
import os
from pyspark.sql import SparkSession
from pyspark.sql.types import *
from pyspark.sql.functions import col, lit, window, count, max, mean, stddev, when, date_format, minute, second, lag
from pyspark.ml.regression import LinearRegression
from pyspark.ml.feature import VectorAssembler
from pyspark.ml.evaluation import RegressionEvaluator

# start Spark session
hostmachine = os.getenv('HOSTMACHINE')
spark = SparkSession.builder.master(f'spark://{hostmachine}:7077')\
    .appName("ml_data_transform")\
    .enableHiveSupport().getOrCreate()

myschema = StructType([
    StructField('start', TimestampType(), True),
    StructField('end', TimestampType(), True),
    StructField('STOCK_ID', StringType(), True),
    StructField('RECORDED_DATE', StringType(), True),
    StructField('avg_MATCHED_PRICE', DecimalType(24, 5), True),
    StructField('stddev_MATCHED_PRICE', DoubleType(), True),
    StructField('TREND', IntegerType(), True),
    StructField('avg_MATCHED_PRICE_ahead', DecimalType(24, 5), True),
    StructField('prev_TREND', IntegerType(), True),
])

# load parquet file
path = f"hdfs://{hostmachine}:19000/ml_data/raw/parquet/dat.parquet"
dat = spark.read.format("parquet").option("header", "true").load(path, schema=myschema)

# stock id list
stock_ids = ['IDC', 'BCC', 'MBS']

for stock_id in stock_ids:
    print(f"Stock ID: {stock_id}")

    # select stock id's data
    df = dat.filter(col('STOCK_ID') == stock_id)

    # vector assembling
    assembler = VectorAssembler(
        inputCols=['avg_MATCHED_PRICE', 'stddev_MATCHED_PRICE', 'TREND', 'prev_TREND'],
        outputCol='features'
    )
    df = assembler.transform(df)
    df = df.select('features', 'avg_MATCHED_PRICE_ahead')

    # split train, test sets
    train, test = df.randomSplit([0.8, 0.2], seed=42)

    # model development
    lr = LinearRegression(featuresCol="features", labelCol="avg_MATCHED_PRICE_ahead", predictionCol="prediction")
    lr = lr.fit(train)

    # make predictions
    predictions = lr.transform(test)

    # evaluate model
    evaluator = RegressionEvaluator(labelCol="avg_MATCHED_PRICE_ahead", predictionCol="prediction",
                                    metricName="rmse")
    rmse = evaluator.evaluate(predictions)
    print("Root Mean Squared Error (RMSE) on test data: {:.3f}".format(rmse))

    evaluator_r2 = RegressionEvaluator(labelCol="avg_MATCHED_PRICE_ahead", predictionCol="prediction",
                                       metricName="r2")
    r2 = evaluator_r2.evaluate(predictions)
    print("R-squared (R2) on test data: {:.3f}".format(r2))

    # save the model
    lr.write().overwrite().save(f"hdfs://{hostmachine}:19000/ml_model/{stock_id}")

# # stop SparkSession
# spark.stop()
