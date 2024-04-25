
from pyspark.sql import SparkSession
from pyspark.sql.functions import *
from pyspark.sql.functions import col, lit
import os

# start Spark session
hostmachine = os.getenv('HOSTMACHINE')
spark = SparkSession.builder.master(f'spark://{hostmachine}:7077')\
    .appName("clean_hnx_order_statistics")\
    .enableHiveSupport().getOrCreate()

# define data to be appended
raw_table = "raw.hnx_order_statistics"
stg_table = "stg.stg_hnx_order_statistics"
stmt = f"""
    SELECT * FROM RAW.HNX_ORDER_STATISTICS
    WHERE 1=1
    AND RECORDED_DATE > (SELECT MAX(RECORDED_DATE) FROM {stg_table}) 
    AND RECORDED_DATE <= (SELECT MAX(RECORDED_DATE) FROM {raw_table})
"""
print(stmt)
increment_df = spark.sql(stmt)

# treat 'nan' values
increment_df_with_nan_imputed = increment_df.select(
            when(col('STOCK_ID') == 'nan', None).otherwise(col('STOCK_ID')).alias('STOCK_ID'),
            when(col('PRICE') == 'nan', None).otherwise(col('PRICE')).alias('PRICE'),
            when(col('PRICE_CHANGE_VALUE') == 'nan', None).otherwise(col('PRICE_CHANGE_VALUE')).alias('PRICE_CHANGE_VALUE'),
            when(col('BUY_ORDER_QUANTITY') == 'nan', None).otherwise(col('BUY_ORDER_QUANTITY')).alias('BUY_ORDER_QUANTITY'),
            when(col('BUY_ORDER_VOLUME') == 'nan', None).otherwise(col('BUY_ORDER_VOLUME')).alias('BUY_ORDER_VOLUME'),
            when(col('VOLUME_PER_BUY_ORDER') == 'nan', None).otherwise(col('VOLUME_PER_BUY_ORDER')).alias('VOLUME_PER_BUY_ORDER'),
            when(col('UNMATCHED_BUY_ORDER_QUANTITY') == 'nan', None).otherwise(col('UNMATCHED_BUY_ORDER_QUANTITY')).alias('UNMATCHED_BUY_ORDER_QUANTITY'),
            when(col('SELL_ORDER_QUANTITY') == 'nan', None).otherwise(col('SELL_ORDER_QUANTITY')).alias('SELL_ORDER_QUANTITY'),
            when(col('SELL_ORDER_VOLUME') == 'nan', None).otherwise(col('SELL_ORDER_VOLUME')).alias('SELL_ORDER_VOLUME'),
            when(col('VOLUME_PER_SELL_ORDER') == 'nan', None).otherwise(col('VOLUME_PER_SELL_ORDER')).alias('VOLUME_PER_SELL_ORDER'),
            when(col('UNMATCHED_SELL_ORDER_QUANTITY') == 'nan', None).otherwise(col('UNMATCHED_SELL_ORDER_QUANTITY')).alias('UNMATCHED_SELL_ORDER_QUANTITY'),
            when(col('NET_VOLUME') == 'nan', None).otherwise(col('NET_VOLUME')).alias('NET_VOLUME'),
            when(col('RECORDED_DATE') == 'nan', None).otherwise(col('RECORDED_DATE')).alias('RECORDED_DATE')
        )

# clean data
increment_df_cleaned = increment_df_with_nan_imputed.filter(col('STOCK_ID').isNotNull()) \
            .select(
            col('STOCK_ID'),
            col('PRICE').cast('double').alias('PRICE'),
            regexp_replace(col('PRICE_CHANGE_VALUE').substr(lit(1), instr(col('PRICE_CHANGE_VALUE'), ' ') - 1), ',',
                           '').cast('double').alias('PRICE_CHANGE_VALUE'),
            col('BUY_ORDER_QUANTITY').cast('double').alias('BUY_ORDER_QUANTITY'),
            col('BUY_ORDER_VOLUME').cast('double').alias('BUY_ORDER_VOLUME'),
            col('VOLUME_PER_BUY_ORDER').cast('double').alias('VOLUME_PER_BUY_ORDER'),
            col('UNMATCHED_BUY_ORDER_QUANTITY').cast('double').alias('UNMATCHED_BUY_ORDER_QUANTITY'),
            col('SELL_ORDER_QUANTITY').cast('double').alias('SELL_ORDER_QUANTITY'),
            col('SELL_ORDER_VOLUME').cast('double').alias('SELL_ORDER_VOLUME'),
            col('VOLUME_PER_SELL_ORDER').cast('double').alias('VOLUME_PER_SELL_ORDER'),
            col('UNMATCHED_SELL_ORDER_QUANTITY').cast('double').alias('UNMATCHED_SELL_ORDER_QUANTITY'),
            col('NET_VOLUME').cast('double').alias('NET_VOLUME'),
            to_date(col('RECORDED_DATE'), 'dd/MM/yyyy').alias('RECORDED_DATE')
        )
print(f"{increment_df_cleaned.count()} rows will be appened!")

# append data to stg table
increment_df_cleaned.write.mode('append').format('hive').saveAsTable('stg.stg_hnx_order_statistics')
print("The job has finished!")