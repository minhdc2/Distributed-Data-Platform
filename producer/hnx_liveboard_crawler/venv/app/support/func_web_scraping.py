from bs4 import BeautifulSoup
from selenium import webdriver
import time
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.options import Options
import connection_config.connection_params.vnd_connection_params as ccv
from kafka import KafkaProducer
from bson import json_util
import json
import pandas as pd
from datetime import datetime

def parse_html_with_selenium(url_path, login_info=None,
                             id=None, onclick=None, web_driver_path='./connection_config/web_driver/chromedriver.exe'):
    options = webdriver.ChromeOptions()
    options.add_argument('--headless')
    options.add_argument("--disable-gpu")
    options.add_argument("--disable-extensions")
    options.add_argument("--disable-infobars")
    options.add_argument("--start-maximized")
    options.add_argument("--disable-notifications")
    options.add_argument('--no-sandbox')
    options.add_argument('--disable-dev-shm-usage')
    driver = webdriver.Chrome(options=options)
    driver.get(url_path)
    if login_info:
        driver.find_element(By.NAME, 'username').send_keys(login_info["username"])
        driver.find_element(By.NAME, 'password').send_keys(login_info["password"])
        driver.find_element(By.XPATH, "//button[@type='submit']").click()
    if id:
        confirmar = driver.find_element(By.ID, id)
        driver.execute_script(onclick, confirmar)
    else:
        if type(onclick) == str:
            driver.execute_script(onclick)
        elif type(onclick) == list:
            for action in onclick:
                driver.execute_script(action)
    time.sleep(7)
    content = driver.page_source
    driver.close()
    soup = BeautifulSoup(content, "html.parser")
    return soup


def crawl_liveboard_test(topic, kafka_brokers, key):
    ###### I. RAW DATA COLLECT ######
    ###### IMPORT HTML TABLE TO ORACLE ######
    if True:
        # send message to Kafka
        producer = KafkaProducer(bootstrap_servers=kafka_brokers)
        key = key
        msg = key + bytes(datetime.now().strftime('%Y%m%d-%H:%M:%S'), "utf-8")
        producer.send(topic, key=key, value=msg)
        producer.flush()
        print(key, msg)


def crawl_liveboard(url_path, topic, kafka_brokers, key):
    soup = parse_html_with_selenium(url_path, login_info=ccv.login_info)
    table_tag = soup.find('table',
                          {'id': 'banggia-khop-lenh'})

    ###### I. RAW DATA COLLECT ######
    ###### IMPORT HTML TABLE TO ORACLE ######
    if table_tag:
        print(url_path + ' Found a table!')
        src_df = pd.read_html(str(table_tag).upper())[0]
        current_time = datetime.now()
        
        # drop duplicated columns
        src_df_cols = src_df.columns
        for column in src_df.columns:
            if len(src_df_cols) >= 2:
                src_df_cols = [col for col in src_df_cols if col != column]
                src_df_copy = src_df.copy().fillna('')
                for compared_column in src_df_cols:
                    if len(src_df_copy[src_df_copy[column] != src_df_copy[compared_column]]) == 0 \
                            and len(src_df[src_df[column].isnull() == False]) > 0:
                        src_df = src_df.drop(column, axis=1)
                        
        src_df = src_df.astype('str')
        
        # add RECORDED_TIME column
        src_df['RECORDED_TIME'] = current_time.strftime('%d-%b-%y %I:%M:%S %p')

        # send message to Kafka
        for broker in kafka_brokers:
            print(broker, 'Connecting...!')
            try:
                producer = KafkaProducer(bootstrap_servers=[broker])
            except Exception as error:
                print(broker, error)
                continue
            print(broker, 'Connected!')
            key = key
            msg = json.dumps(src_df.to_dict(), default=json_util.default).encode('utf-8')
            print(key, msg)
            producer.send(topic, key=key, value=msg)
            producer.flush()
            print(key, key + bytes(datetime.now().strftime('%Y%m%d-%H:%M:%S'), "utf-8"))
            break
