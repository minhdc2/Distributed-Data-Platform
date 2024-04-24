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
    last_value_df = pd.read_sql(f"SELECT MAX(RECORDED_DATE) AS last_value FROM {hive_table}", conn)
    last_value = last_value_df.values[0][0]
    last_value_dict['last_value'] = str(last_value).replace("T", " ")
    print(last_value_dict)

    # save new last value
    with open(last_value_path, 'w') as f:
        json.dump(last_value_dict, f)
        f.close()

if __name__ == '__main__':
    query = "SELECT STOCK_ID, PRICE, PRICE_CHANGE_VALUE, BUY_ORDER_QUANTITY, BUY_ORDER_VOLUME, VOLUME_PER_BUY_ORDER, UNMATCHED_BUY_ORDER_QUANTITY, SELL_ORDER_QUANTITY, SELL_ORDER_VOLUME, VOLUME_PER_SELL_ORDER, UNMATCHED_SELL_ORDER_QUANTITY, NET_VOLUME, RECORDED_DATE FROM CAFEF_DATA_SOURCE.HNX_ORDER_STATISTICS WHERE $CONDITIONS"
    hive_table = "raw.hnx_order_statistics"
    target_dir = "/user/hive/warehouse/raw.db/hnx_order_statistics"
    split_by = "STOCK_ID"
    check_column = "RECORDED_DATE"
    migrate_to_hdfs(query=query, hive_table=hive_table, target_dir=target_dir,
                    split_by=split_by, check_column=check_column)