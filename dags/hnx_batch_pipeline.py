from datetime import datetime, timedelta
from airflow import DAG
from airflow.operators.bash import BashOperator
from airflow.models import TaskInstance
from airflow.utils.state import State
from airflow.models import Variable
import os

def mark_task_success(context):
    print("mark_task_success is running!")
    task_instance: TaskInstance = context.get("task_instance")
    task_instance.set_state(State.SUCCESS)

default_args = {
    'owner': 'minh',
    'retries': 0,
}

with DAG(
    dag_id='hnx_batch_pipeline',
    default_args=default_args,
    description='Crawl data of HNX stock exchange',
    start_date=datetime(2024, 3, 13, 21, 30, 0),
    concurrency=10,
    schedule_interval='15 15 * * Mon,Tue,Wed,Thu,Fri',
    catchup=False
) as dag:
    task1 = BashOperator(
        task_id='hnx_historical_price_crawler',
        bash_command="cd /mnt/d/apps/consumer/hnx_historical_price; python3 hnx_historical_price.py",
    )

    task2 = BashOperator(
        task_id='hnx_order_statistics_crawler',
        bash_command="cd /mnt/d/apps/consumer/hnx_order_statistics; python3 hnx_order_statistics.py",
    )

    task3 = BashOperator(
        task_id='hnx_liveboard_records_crawler',
        bash_command="cd /mnt/d/apps/consumer/hnx_liveboard_records; python3 hnx_liveboard_records.py",
        execution_timeout=timedelta(minutes=5),
        on_failure_callback=mark_task_success,
    )

    task4 = BashOperator(
        task_id='hnx_historical_price_migrator',
        env=Variable.get('env', deserialize_json=True),
        bash_command="cd /mnt/d/apps/ssh/run_sqoop/hnx_historical_price; python3 hnx_historical_price.py",
        execution_timeout=timedelta(minutes=15),
    )

    task5 = BashOperator(
        task_id='hnx_order_statistics_migrator',
        env=Variable.get('env', deserialize_json=True),
        bash_command="cd /mnt/d/apps/ssh/run_sqoop/hnx_order_statistics; python3 hnx_order_statistics.py",
        execution_timeout=timedelta(minutes=15),
    )

    task6 = BashOperator(
        task_id='hnx_liveboard_records_migrator',
        env=Variable.get('env', deserialize_json=True),
        bash_command="cd /mnt/d/apps/ssh/run_sqoop/hnx_liveboard_records; python3 hnx_liveboard_records.py",
        execution_timeout=timedelta(minutes=15),
        on_failure_callback=mark_task_success,
    )

    task1 >> task4
    task2 >> task5
    task3 >> task6