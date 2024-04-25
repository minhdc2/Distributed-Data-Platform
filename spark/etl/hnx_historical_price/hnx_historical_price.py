
from pyspark.sql import SparkSession
from pyspark.sql.functions import *
from pyspark.sql.functions import col, lit
import os

# start Spark session
hostmachine = os.getenv('HOSTMACHINE')
spark = SparkSession.builder.master(f'spark://{hostmachine}:7077')\
    .appName("clean_hnx_historical_price")\
    .enableHiveSupport().getOrCreate()

# define data to be appended
raw_table = "raw.hnx_historical_price"
stg_table = "stg.stg_hnx_historical_price"
stmt = f"""
    SELECT * FROM RAW.HNX_HISTORICAL_PRICE
    WHERE 1=1
    AND RECORDED_DATE > (SELECT MAX(RECORDED_DATE) FROM {stg_table}) 
    AND RECORDED_DATE <= (SELECT MAX(RECORDED_DATE) FROM {raw_table})
"""
print(stmt)
increment_df = spark.sql(stmt)

# treat 'nan' values
increment_df_with_nan_imputed = increment_df.select(
            when(col('STOCK_ID') == 'nan', None).otherwise(col('STOCK_ID')).alias('STOCK_ID'),
            when(col('CLOSE_PRICE') == 'nan', None).otherwise(col('CLOSE_PRICE')).alias('CLOSE_PRICE'),
            when(col('PRICE_CHANGE') == 'nan', None).otherwise(col('PRICE_CHANGE')).alias('PRICE_CHANGE'),
            when(col('BASE_PRICE') == 'nan', None).otherwise(col('BASE_PRICE')).alias('BASE_PRICE'),
            when(col('OPEN_PRICE') == 'nan', None).otherwise(col('OPEN_PRICE')).alias('OPEN_PRICE'),
            when(col('HIGHEST_PRICE') == 'nan', None).otherwise(col('HIGHEST_PRICE')).alias('HIGHEST_PRICE'),
            when(col('LOWEST_PRICE') == 'nan', None).otherwise(col('LOWEST_PRICE')).alias('LOWEST_PRICE'),
            when(col('MATCHED_VOLUME') == 'nan', None).otherwise(col('MATCHED_VOLUME')).alias('MATCHED_VOLUME'),
            when(col('MATCHED_AMOUNT') == 'nan', None).otherwise(col('MATCHED_AMOUNT')).alias('MATCHED_AMOUNT'),
            when(col('SELF_DEALED_VOLUME') == 'nan', None).otherwise(col('SELF_DEALED_VOLUME')).alias('SELF_DEALED_VOLUME'),
            when(col('SELF_DEALED_AMOUNT') == 'nan', None).otherwise(col('SELF_DEALED_AMOUNT')).alias('SELF_DEALED_AMOUNT'),
            when(col('RECORDED_DATE') == 'nan', None).otherwise(col('RECORDED_DATE')).alias('RECORDED_DATE')
        )

# clean data
increment_df_cleaned = increment_df_with_nan_imputed.filter(col('STOCK_ID').isNotNull()) \
            .select(
            col('STOCK_ID'),
            col('CLOSE_PRICE').cast('double').alias('CLOSE_PRICE'),
            regexp_replace(col('PRICE_CHANGE').substr(lit(1), instr(col('PRICE_CHANGE'), ' ') - 1), ',', '').cast(
                'double').alias('PRICE_CHANGE_AMOUNT'),
            regexp_replace(
                regexp_replace(
                    regexp_replace(
                        col('PRICE_CHANGE').substr(instr(col('PRICE_CHANGE'), ' ') + 2,
                                                   length(col('PRICE_CHANGE')) - instr(col('PRICE_CHANGE'), ' ') - 1)
                        , 'INFINITY', '')
                    , ',', '')
                , ' %\)', '').cast('double')
                .alias('PRICE_CHANGE_PERCENT'),
            col('BASE_PRICE').cast('double').alias('BASE_PRICE'),
            col('OPEN_PRICE').cast('double').alias('OPEN_PRICE'),
            col('HIGHEST_PRICE').cast('double').alias('HIGHEST_PRICE'),
            col('LOWEST_PRICE').cast('double').alias('LOWEST_PRICE'),
            col('MATCHED_VOLUME').cast('double').alias('MATCHED_VOLUME'),
            (regexp_replace(col('MATCHED_AMOUNT'), ' TỶ', '').cast('double')*1E9).alias('MATCHED_AMOUNT'),
            col('SELF_DEALED_VOLUME').cast('double').alias('SELF_DEALED_VOLUME'),
            col('SELF_DEALED_AMOUNT').cast('double').alias('SELF_DEALED_AMOUNT'),
            to_date(col('RECORDED_DATE'), 'dd/MM/yyyy').alias('RECORDED_DATE')
        )
print(f"{increment_df_cleaned.count()} rows will be appened!")

# append data to stg table
increment_df_cleaned.write.mode('append').format('hive').saveAsTable('stg.stg_hnx_historical_price')
print("The job has finished!")