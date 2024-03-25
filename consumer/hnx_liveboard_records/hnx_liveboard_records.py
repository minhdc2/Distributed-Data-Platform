from kafka import KafkaConsumer
from kafka import TopicPartition, OffsetAndMetadata
import json
import pandas as pd
import cx_Oracle
import numpy as np
from datetime import datetime

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

topic_name = 'test-par1-rep1'
consumer = KafkaConsumer(#topic_name,
                         #group_id='hnx_liveboard_records',
                         bootstrap_servers=['192.168.2.101:9092'],
                         auto_offset_reset='earliest', enable_auto_commit=True)
# consumer.subscribe(topics=['test-par1-rep1'])

# consume data from partition 0
consumer.assign([TopicPartition(topic_name, 0)])

for message in consumer:
    # message value and key are raw bytes -- decode if necessary!
    # e.g., for unicode: `message.value.decode('utf-8')`

    print("%s:%d:%d: key=%s" % (message.topic, message.partition,
                                message.offset, message.key))
    response = message.value.decode('utf8')
    response = json.loads(response)
    df = pd.DataFrame(response)
    print(df.head(1))

    recorded_time = np.unique(df['RECORDED_TIME'])[0]

    # connection to Oracle
    db_conn = open_Oracle_connection()
    target_table_in_Oracle = 'HNX_LIVEBOARD_RECORDS'

    # delete old records
    delete_from_stmt = stmt_delete_from_table(target_table_in_Oracle,
                                              condition=f"recorded_time = '{recorded_time}'")
    execute_Oracle_query(db_conn, delete_from_stmt)

    # insert new records
    executemany_Oracle_insert(db_conn, target_table_in_Oracle, df)

    # # After consuming the message commit the offset. (manually)
    # consumer.commit({TopicPartition(topic_name, message.partition
    #                                 ): OffsetAndMetadata(message.offset + 1, '')})
