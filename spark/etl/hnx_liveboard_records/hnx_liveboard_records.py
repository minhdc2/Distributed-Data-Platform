
from pyspark.sql import SparkSession
from pyspark.sql.functions import *
from pyspark.sql.functions import col, lit
import os
import sys
sys.path.insert(1, '\\'.join(os.getcwd().split("\\")[:-3]))
import env.set_envs

# start Spark session
hostmachine = os.getenv('HOSTMACHINE')
spark = SparkSession.builder.master(f'spark://{hostmachine}:7077')\
    .appName("clean_hnx_liveboard_records")\
    .enableHiveSupport().getOrCreate()

# define data to be appended
raw_table = "raw.hnx_liveboard_records"
stg_table = "stg.stg_hnx_liveboard_records"
stmt = f"""
    SELECT * FROM RAW.HNX_LIVEBOARD_RECORDS
    WHERE 1=1
    AND RECORDED_TIME > (SELECT MAX(RECORDED_TIME) FROM {stg_table}) 
    AND RECORDED_TIME <= (SELECT MAX(RECORDED_TIME) FROM {raw_table})
"""
print(stmt)
increment_df = spark.sql(stmt)

# treat 'nan' values
increment_df_with_nan_imputed = increment_df.select(
            when(col('STOCK_ID') == 'nan', None).otherwise(col('STOCK_ID')).alias('STOCK_ID'),
            when(col('OPEN_PRICE') == 'nan', None).otherwise(col('OPEN_PRICE')).alias('OPEN_PRICE'),
            when(col('HIGHEST_PRICE') == 'nan', None).otherwise(col('HIGHEST_PRICE')).alias('HIGHEST_PRICE'),
            when(col('LOWEST_PRICE') == 'nan', None).otherwise(col('LOWEST_PRICE')).alias('LOWEST_PRICE'),
            when(col('TOTAL_VOLUME_AND_AMOUNT') == 'nan', None).otherwise(col('TOTAL_VOLUME_AND_AMOUNT')).alias(
                'TOTAL_VOLUME_AND_AMOUNT'),
            when(col('BUY_THIRD_PRICE') == 'nan', None).otherwise(col('BUY_THIRD_PRICE')).alias('BUY_THIRD_PRICE'),
            when(col('BUY_THIRD_VOLUME') == 'nan', None).otherwise(col('BUY_THIRD_VOLUME')).alias('BUY_THIRD_VOLUME'),
            when(col('BUY_SECOND_PRICE') == 'nan', None).otherwise(col('BUY_SECOND_PRICE')).alias('BUY_SECOND_PRICE'),
            when(col('BUY_SECOND_VOLUME') == 'nan', None).otherwise(col('BUY_SECOND_VOLUME')).alias(
                'BUY_SECOND_VOLUME'),
            when(col('BUY_FIRST_PRICE') == 'nan', None).otherwise(col('BUY_FIRST_PRICE')).alias('BUY_FIRST_PRICE'),
            when(col('BUY_FIRST_VOLUME') == 'nan', None).otherwise(col('BUY_FIRST_VOLUME')).alias('BUY_FIRST_VOLUME'),
            when(col('MATCHED_PRICE') == 'nan', None).otherwise(col('MATCHED_PRICE')).alias('MATCHED_PRICE'),
            when(col('MATCHED_VOLUME') == 'nan', None).otherwise(col('MATCHED_VOLUME')).alias('MATCHED_VOLUME'),
            when(col('PRICE_CHANGE') == 'nan', None).otherwise(col('PRICE_CHANGE')).alias('PRICE_CHANGE'),
            when(col('SELL_FIRST_PRICE') == 'nan', None).otherwise(col('SELL_FIRST_PRICE')).alias('SELL_FIRST_PRICE'),
            when(col('SELL_FIRST_VOLUME') == 'nan', None).otherwise(col('SELL_FIRST_VOLUME')).alias(
                'SELL_FIRST_VOLUME'),
            when(col('SELL_SECOND_PRICE') == 'nan', None).otherwise(col('SELL_SECOND_PRICE')).alias(
                'SELL_SECOND_PRICE'),
            when(col('SELL_SECOND_VOLUME') == 'nan', None).otherwise(col('SELL_SECOND_VOLUME')).alias(
                'SELL_SECOND_VOLUME'),
            when(col('SELL_THIRD_PRICE') == 'nan', None).otherwise(col('SELL_THIRD_PRICE')).alias('SELL_THIRD_PRICE'),
            when(col('SELL_THIRD_VOLUME') == 'nan', None).otherwise(col('SELL_THIRD_VOLUME')).alias(
                'SELL_THIRD_VOLUME'),
            when(col('HIGH_PRICE') == 'nan', None).otherwise(col('HIGH_PRICE')).alias('HIGH_PRICE'),
            when(col('AVERAGE_PRICE') == 'nan', None).otherwise(col('AVERAGE_PRICE')).alias('AVERAGE_PRICE'),
            when(col('LOW_PRICE') == 'nan', None).otherwise(col('LOW_PRICE')).alias('LOW_PRICE'),
            when(col('RESIDUAL_BUY') == 'nan', None).otherwise(col('RESIDUAL_BUY')).alias('RESIDUAL_BUY'),
            when(col('RESIDUAL_SELL') == 'nan', None).otherwise(col('RESIDUAL_SELL')).alias('RESIDUAL_SELL'),
            when(col('FOREIGN_BUY_SELL_REMAINING_AMOUNT') == 'nan', None).otherwise(
                col('FOREIGN_BUY_SELL_REMAINING_AMOUNT')).alias('FOREIGN_BUY_SELL_REMAINING_AMOUNT'),
            col('RECORDED_TIME')
        )

# clean data
increment_df_cleaned = increment_df_with_nan_imputed.filter(((col('BUY_FIRST_PRICE') != lit('ATC')) & (col('SELL_FIRST_PRICE') != lit('ATC'))) | (col('BUY_FIRST_PRICE').isNull()) | (col('SELL_FIRST_PRICE').isNull())) \
            .select(
            regexp_replace(col('STOCK_ID'), "\*", "").alias('STOCK_ID'),
            (col('OPEN_PRICE').cast('double') * 1e3).alias('OPEN_PRICE'),
            (col('HIGHEST_PRICE').cast('double') * 1e3).alias('HIGHEST_PRICE'),
            (col('LOWEST_PRICE').cast('double') * 1e3).alias('LOWEST_PRICE'),
            when(col('TOTAL_VOLUME_AND_AMOUNT').like('% %'),
                 (regexp_replace(col('TOTAL_VOLUME_AND_AMOUNT')
                                 .substr(lit(1), instr(col('TOTAL_VOLUME_AND_AMOUNT'), ' ') - 1), ',', '')
                  .cast('double') * 10))
                .otherwise(col('TOTAL_VOLUME_AND_AMOUNT').cast('double') * 10)
                .alias('TOTAL_VOLUME'),
            when(col('TOTAL_VOLUME_AND_AMOUNT').like('%   %'),
                 (regexp_replace(col('TOTAL_VOLUME_AND_AMOUNT')
                                 .substr(instr(col('TOTAL_VOLUME_AND_AMOUNT'), '   ') + 3,
                                         length(col('TOTAL_VOLUME_AND_AMOUNT')) - instr(col('TOTAL_VOLUME_AND_AMOUNT'),
                                                                                        '   ') - 2), ',', '')
                  .cast('double') * 1e6))
                .otherwise(None)
                .alias('TOTAL_AMOUNT'),
            (col('BUY_THIRD_PRICE').cast('double') * 1e3).alias('BUY_THIRD_PRICE'),
            (regexp_replace(col('BUY_THIRD_VOLUME'), ',', '').cast('double') * 10).alias('BUY_THIRD_VOLUME'),
            (col('BUY_SECOND_PRICE').cast('double') * 1e3).alias('BUY_SECOND_PRICE'),
            (regexp_replace(col('BUY_SECOND_VOLUME'), ',', '').cast('double') * 10).alias('BUY_SECOND_VOLUME'),
            (col('BUY_FIRST_PRICE').cast('double') * 1e3).alias('BUY_FIRST_PRICE'),
            (regexp_replace(col('BUY_FIRST_VOLUME'), ',', '').cast('double') * 10).alias('BUY_FIRST_VOLUME'),
            (col('MATCHED_PRICE').cast('double') * 1e3).alias('MATCHED_PRICE'),
            (regexp_replace(col('MATCHED_VOLUME'), ',', '').cast('double') * 10).alias('MATCHED_VOLUME'),
            (when(col('PRICE_CHANGE').like('%     %'),
                  col('PRICE_CHANGE').substr(lit(1), instr(col('PRICE_CHANGE'), '     ') - 1))
             .when(col('PRICE_CHANGE').like('%    %'),
                   col('PRICE_CHANGE').substr(lit(1), instr(col('PRICE_CHANGE'), '    ') - 1))
             .when(col('PRICE_CHANGE').like('%   %'),
                   col('PRICE_CHANGE').substr(lit(1), instr(col('PRICE_CHANGE'), '   ') - 1))
             .when(col('PRICE_CHANGE').like('%  %'),
                   col('PRICE_CHANGE').substr(lit(1), instr(col('PRICE_CHANGE'), '  ') - 1))
             .when(col('PRICE_CHANGE').like('% %'),
                   col('PRICE_CHANGE').substr(lit(1), instr(col('PRICE_CHANGE'), ' ') - 1))
             .otherwise(col('PRICE_CHANGE'))).cast('double').alias('ABS_PRICE_CHANGE'),
            regexp_replace(when(col('PRICE_CHANGE').like('%     %'),
                                col('PRICE_CHANGE').substr(instr(col('PRICE_CHANGE'), '     ') + 5,
                                                           length(col('PRICE_CHANGE')) - instr(col('PRICE_CHANGE'),
                                                                                               '     ') - 4))
                           .when(col('PRICE_CHANGE').like('%    %'),
                                 col('PRICE_CHANGE').substr(instr(col('PRICE_CHANGE'), '    ') + 4,
                                                            length(col('PRICE_CHANGE')) - instr(col('PRICE_CHANGE'),
                                                                                                '    ') - 3))
                           .when(col('PRICE_CHANGE').like('%   %'),
                                 col('PRICE_CHANGE').substr(instr(col('PRICE_CHANGE'), '   ') + 3,
                                                            length(col('PRICE_CHANGE')) - instr(col('PRICE_CHANGE'),
                                                                                                '   ') - 2))
                           .when(col('PRICE_CHANGE').like('%  %'),
                                 col('PRICE_CHANGE').substr(instr(col('PRICE_CHANGE'), '  ') + 2,
                                                            length(col('PRICE_CHANGE')) - instr(col('PRICE_CHANGE'),
                                                                                                '  ') - 1))
                           .when(col('PRICE_CHANGE').like('% %'),
                                 col('PRICE_CHANGE').substr(instr(col('PRICE_CHANGE'), ' ') + 1,
                                                            length(col('PRICE_CHANGE')) - instr(col('PRICE_CHANGE'),
                                                                                                ' ') - 0))
                           .otherwise(col('PRICE_CHANGE')), '%', '').cast('double').alias('PERCENT_PRICE_CHANGE'),
            (col('SELL_FIRST_PRICE').cast('double') * 1e3).alias('SELL_FIRST_PRICE'),
            (regexp_replace(col('SELL_FIRST_VOLUME'), ',', '').cast('double') * 10).alias('SELL_FIRST_VOLUME'),
            (col('SELL_SECOND_PRICE').cast('double') * 1e3).alias('SELL_SECOND_PRICE'),
            (regexp_replace(col('SELL_SECOND_VOLUME'), ',', '').cast('double') * 10).alias('SELL_SECOND_VOLUME'),
            (col('SELL_THIRD_PRICE').cast('double') * 1e3).alias('SELL_THIRD_PRICE'),
            (regexp_replace(col('SELL_THIRD_VOLUME'), ',', '').cast('double') * 10).alias('SELL_THIRD_VOLUME'),
            (col('HIGH_PRICE').cast('double') * 1e3).alias('HIGH_PRICE'),
            (col('AVERAGE_PRICE').cast('double') * 1e3).alias('AVERAGE_PRICE'),
            (col('LOW_PRICE').cast('double') * 1e3).alias('LOW_PRICE'),
            (regexp_replace(when(col('FOREIGN_BUY_SELL_REMAINING_AMOUNT').like('% %') == False,
                                 col('FOREIGN_BUY_SELL_REMAINING_AMOUNT'))
                            .when(col('FOREIGN_BUY_SELL_REMAINING_AMOUNT').like('%    %'),
                                  col('FOREIGN_BUY_SELL_REMAINING_AMOUNT')
                                  .substr(instr(col('FOREIGN_BUY_SELL_REMAINING_AMOUNT'), '    ') + 4,
                                          length(col('FOREIGN_BUY_SELL_REMAINING_AMOUNT')) - instr(
                                              col('FOREIGN_BUY_SELL_REMAINING_AMOUNT'), '    ') - 3))
                            .when((col('FOREIGN_BUY_SELL_REMAINING_AMOUNT').like('%   %')) & (
                    col('FOREIGN_BUY_SELL_REMAINING_AMOUNT').like('%    %') == False),
                                  col('FOREIGN_BUY_SELL_REMAINING_AMOUNT')
                                  .substr(instr(col('FOREIGN_BUY_SELL_REMAINING_AMOUNT'), '   ') + 3,
                                          length(col('FOREIGN_BUY_SELL_REMAINING_AMOUNT')) - instr(
                                              col('FOREIGN_BUY_SELL_REMAINING_AMOUNT'), '   ') - 2)), ',', '').cast(
                'double') * 1e4)
                .alias('REMAINING_AMOUNT'),
            col('RECORDED_TIME')
        )
print(f"{increment_df_cleaned.count()} rows will be appened!")

# append data to stg table
increment_df_cleaned.write.mode('append').format('hive').saveAsTable('stg.stg_hnx_liveboard_records')
print("The job has finished!")