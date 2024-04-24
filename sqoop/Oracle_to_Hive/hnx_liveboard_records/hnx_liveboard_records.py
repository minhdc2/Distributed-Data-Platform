import subprocess
import pandas as pd
import json
from pyhive import  hive
import os
import sys
sys.path.insert(1, '\\'.join(os.getcwd().split("\\")[:-3]))
import env.set_envs

def migrate_to_hdfs(query, hive_table, target_dir, split_by, check_column,
                    last_value_path='./last_value/last_value.json',
                    jdbc_connector='jdbc:oracle:thin:@//192.168.2.14:1521/orcl2',
                    username='hive',
                    password='hive',
                    hive_hostmachine=os.getenv('HIVE_HOSTMACHINE'),
                    mode='append'):

    # read last value
    f = open(last_value_path)
    last_value_dict = json.loads(f.read())
    last_value = last_value_dict['last_value']
    f.close()
    print(last_value)
    
    # migrate data
    command = f'%SQOOP_HOME%/bin/sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" --connect {jdbc_connector} --query "{query}" --username {username} --password {password} --hive-import --hive-table {hive_table} --target-dir {target_dir} --split-by {split_by} --check-column {check_column} --incremental {mode} --last-value "{last_value}"'
    print(command)
    subprocess.run(command.strip(), shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)

    # retrieve new last value from Hive
    conn = hive.Connection(host=hive_hostmachine, port='10000', database='default', auth='NONE')
    last_value_df = pd.read_sql(f"SELECT MAX(RECORDED_TIME) AS last_value FROM {hive_table}", conn)
    last_value = last_value_df.values[0][0]
    last_value_dict['last_value'] = str(last_value).replace("T", " ")
    print(last_value_dict)

    # save new last value
    with open(last_value_path, 'w') as f:
        json.dump(last_value_dict, f)
        f.close()

if __name__ == '__main__':
    query = "SELECT STOCK_ID, OPEN_PRICE, HIGHEST_PRICE, LOWEST_PRICE, TOTAL_VOLUME_AND_AMOUNT, BUY_THIRD_PRICE, BUY_THIRD_VOLUME, BUY_SECOND_PRICE, BUY_SECOND_VOLUME, BUY_FIRST_PRICE, BUY_FIRST_VOLUME, MATCHED_PRICE, MATCHED_VOLUME, PRICE_CHANGE, SELL_FIRST_PRICE, SELL_FIRST_VOLUME, SELL_SECOND_PRICE, SELL_SECOND_VOLUME, SELL_THIRD_PRICE, SELL_THIRD_VOLUME, HIGH_PRICE, AVERAGE_PRICE, LOW_PRICE, RESIDUAL_BUY, RESIDUAL_SELL, FOREIGN_BUY_SELL_REMAINING_AMOUNT, RECORDED_TIME FROM VND_DATA_SOURCE.HNX_LIVEBOARD_RECORDS WHERE $CONDITIONS"
    hive_table = "raw.hnx_liveboard_records"
    target_dir = "/user/hive/warehouse/raw.db/hnx_liveboard_records"
    split_by = "STOCK_ID"
    check_column = "RECORDED_TIME"
    migrate_to_hdfs(query=query, hive_table=hive_table, target_dir=target_dir,
                    split_by=split_by, check_column=check_column)