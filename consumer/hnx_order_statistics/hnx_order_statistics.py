import time
import pandas as pd
import requests
import json
import numpy as np
import cx_Oracle
from datetime import datetime

ip_address = "192.168.2.101"
BASE = f"http://{ip_address}:5001/"

response = requests.get(BASE + 'data')
response = json.loads(response.json())
df = pd.DataFrame(response)
df['RECORDED_DATE'] = [datetime.strptime(value, "%d/%m/%Y") for value in df['RECORDED_DATE']]
df['RECORDED_DATE'] = [value.strftime("%d-%b-%y %I:%M:%S %p") for value in df['RECORDED_DATE']]
print(df.head())

def stmt_delete_from_table(table_name, condition):
    stmt = f"""
        DELETE FROM {table_name}
        WHERE {condition}
    """
    return stmt

def executemany_Oracle_insert(conn, dst_table, src_df):
    rows = [tuple(row) for row in src_df.values]
    values = ''
    for n in range(len(rows[0])):
        values += ':' + str(n + 1) + ', '
    values = values[:-2]
    insert_stmt = f"""
        INSERT INTO {dst_table}
        VALUES({values})
    """
    print(insert_stmt)
    conn.cursor().executemany(insert_stmt, rows)
    conn.commit()

def execute_Oracle_query(conn, query):
    print(query)
    conn.cursor().execute(query)
    conn.commit()

def open_Oracle_connection():
    hostname = '192.168.2.14'
    port = '1521'
    service_name = 'orcl2'
    usr = '' #removed usr
    pwd = '' #removed pwd
    dsn_tns = cx_Oracle.makedsn(hostname, port, service_name=service_name)
    conn = cx_Oracle.connect(user=usr, password=pwd, dsn=dsn_tns)
    return conn

if len(df) > 0:
    recorded_date = np.unique(df['RECORDED_DATE'])[0]

    # connection to Oracle
    db_conn = open_Oracle_connection()
    target_table_in_Oracle = 'HNX_ORDER_STATISTICS'

    # delete old records
    delete_from_stmt = stmt_delete_from_table(target_table_in_Oracle,
                                              condition=f"RECORDED_DATE = '{recorded_date}'")
    execute_Oracle_query(db_conn, delete_from_stmt)

    # insert new records
    executemany_Oracle_insert(db_conn, target_table_in_Oracle, df)