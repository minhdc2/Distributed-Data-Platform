import support.func_web_scraping as sfws
import datetime
import pytz
import time

if __name__ == '__main__':
    kafka_brokers = [
                     '192.168.2.14:9092',
                     '192.168.2.101:9092',
                     '192.168.2.101:9093'
                    ]

    current_time = datetime.datetime.now(pytz.timezone("Asia/Bangkok"))
    while ((current_time.time() > datetime.time(9, 25, 0)) and (
            current_time.time() < datetime.time(14, 30, 0))) and (
            current_time.weekday() not in [5, 6]):

        # lunch break
        if (current_time.time() > datetime.time(12, 00, 0)) and (current_time.time() < datetime.time(13, 0, 0)):
            time.sleep(300)
            current_time = datetime.datetime.now(pytz.timezone("Asia/Bangkok"))
            continue

        # hnx_liveboard_crawler
        hnx_url_path = '' #removed url
        sfws.crawl_liveboard(url_path=hnx_url_path, topic='test-par1-rep1',
                             kafka_brokers=kafka_brokers, key=b'hnx')

        # crawl every 5 minutes
        time.sleep(300)
        current_time = datetime.datetime.now(pytz.timezone("Asia/Bangkok"))


