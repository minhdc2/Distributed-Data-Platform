
from pyspark.sql import SparkSession
from pyspark.sql.functions import *
from pyspark.sql.functions import col, lit, window, count, max, mean, stddev, when, date_format, minute, second, lag
import os
from pyspark.sql.window import Window

# start Spark session
hostmachine = os.getenv('HOSTMACHINE')
spark = SparkSession.builder.master(f'spark://{hostmachine}:7077')\
    .appName("clean_hnx_historical_price")\
    .enableHiveSupport().getOrCreate()

# load data
stmt = f"""
    SELECT * FROM STG.STG_HNX_LIVEBOARD_RECORDS
    WHERE 1=1
    AND RECORDED_TIME <= '2023-05-31 00:05:59.0' 
"""
print(stmt)
raw = spark.sql(stmt)

# filter data
windowSpec = Window.partitionBy('STOCK_ID', 'RECORDED_DATE').orderBy('RECORDED_TIME')
windowSpec1 = Window.partitionBy(col("STOCK_ID"), col("RECORDED_DATE")).orderBy(col("end").desc())
windowSpec2 = Window.partitionBy(col("STOCK_ID"), col("RECORDED_DATE")).orderBy(col("end").asc())

dat = raw.select(
    col('STOCK_ID'), col('MATCHED_PRICE'), col('MATCHED_VOLUME'),
    date_format(col('RECORDED_TIME'), 'yyyy-MM-dd').alias('RECORDED_DATE'),
    col('RECORDED_TIME'),
).filter(
    col('MATCHED_VOLUME').isNotNull()
).withColumn(
    'PREV_RECORDED_TIME', lag('RECORDED_TIME', 1).over(windowSpec)
).select(
    col('STOCK_ID'), col('MATCHED_PRICE'), col('MATCHED_VOLUME'),
    concat(col('RECORDED_DATE'), lit(' 09:30:00')).alias('RECORDED_TIME_start'),
    concat(col('RECORDED_DATE'), lit(' 14:30:00')).alias('RECORDED_TIME_end'),
    col('RECORDED_DATE'), col('RECORDED_TIME'), col('PREV_RECORDED_TIME'),
    when(col('PREV_RECORDED_TIME').isNull(), 0).otherwise(
        col('RECORDED_TIME').cast('long') - col('PREV_RECORDED_TIME').cast('long')).alias('TIME_DIFF')
).filter(
    (col('TIME_DIFF') <= 900) & (col('TIME_DIFF') >= 60) & (col('RECORDED_TIME') >= col('RECORDED_TIME_start')) & (col('RECORDED_TIME') <= col('RECORDED_TIME_end'))
).select(
    col('STOCK_ID'), col('MATCHED_PRICE'), col('RECORDED_DATE'), col('RECORDED_TIME')
).select(
    col('STOCK_ID'), col('RECORDED_DATE'),
    col('RECORDED_TIME'), col('MATCHED_PRICE')
).groupBy(
    window(col('RECORDED_TIME'), "15 minutes", "15 minutes"),
    col('STOCK_ID'), col('RECORDED_DATE')
).agg(
    mean(col('MATCHED_PRICE')).alias('avg_MATCHED_PRICE'),
    stddev(col('MATCHED_PRICE')).alias('stddev_MATCHED_PRICE'),
    count('*').alias('count')
).select(
    col('window.start'), col('window.end'),
    col('STOCK_ID'), col('RECORDED_DATE'),
    col('avg_MATCHED_PRICE'), col('stddev_MATCHED_PRICE'),
    col('count')
).filter(
    col('count') > 1
).sort(
    col('RECORDED_DATE').asc(),
    col('STOCK_ID').asc(),
    col('end').desc()
).withColumn(
    "start_ahead", lag(col("start"), 1).over(windowSpec1)
).withColumn(
    "avg_MATCHED_PRICE_ahead", lag(col("avg_MATCHED_PRICE"), 1).over(windowSpec1)
).filter(
    col('end') == col('start_ahead')
).withColumn(
    "avg_MATCHED_PRICE_ahead", lag(col("avg_MATCHED_PRICE"), 1).over(windowSpec1)
).withColumn(
    "avg_MATCHED_PRICE_before", lag(col("avg_MATCHED_PRICE"), 1).over(windowSpec2)
).select(
    col('start'), col('end'),
    col('STOCK_ID'), col('RECORDED_DATE'),
    col('avg_MATCHED_PRICE'), col('stddev_MATCHED_PRICE'),
    when(col('avg_MATCHED_PRICE') > col('avg_MATCHED_PRICE_before'), 1).otherwise(-1).alias('TREND'),
    col('avg_MATCHED_PRICE_ahead')
).filter(
    col('end') == col('start_ahead')
).withColumn(
    "prev_TREND", lag(col("TREND"), 1).over(windowSpec2)
).filter(
    (col('prev_TREND').isNotNull()) & (col('avg_MATCHED_PRICE_ahead').isNotNull())
)

# # export to csv format
# dat.write.mode('overwrite').option('header', 'true').csv('hdfs://192.168.2.14:19000/ml_data/raw/csv/dat.csv')

# export to parquet format
# dat.write.save('hdfs://192.168.2.14:19000/ml_data/raw/parquet/dat.parquet', format='parquet', mode='overwrite')
dat.write.mode('overwrite').option('header', 'true').parquet(f'hdfs://{hostmachine}:19000/ml_data/raw/parquet/dat.parquet')

# stop SparkSession
spark.stop()