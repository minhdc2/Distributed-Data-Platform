
import support.func_web_scraping as sfws
import datetime
import pandas as pd
from flask import Flask
from flask_restful import Api, Resource

app = Flask(__name__)
api = Api(app)

def crawl_hnx_order_statistics(date_string, destination='./data/'):
    url_path = f"https://s.cafef.vn/tracuulichsu2/2/hnx/{date_string}.chn"
    soup = sfws.parse_html_with_selenium(url_path)
    table_tag = soup.find('table',
                          {'id': 'header_table_GDNN'})
    if table_tag:
        print(url_path + ' Found a table!')
        src_df = pd.read_html(str(table_tag).upper())[0]
        src_df['RECORDED_DATE'] = date_string
        columns = ['STOCK_ID', 'PRICE', 'PRICE_CHANGE_VALUE', 'BUY_ORDER_QUANTITY',
                   'BUY_ORDER_VOLUME', 'VOLUME_PER_BUY_ORDER', 'UNMATCHED_BUY_ORDER_QUANTITY',
                   'SELL_ORDER_QUANTITY', 'SELL_ORDER_VOLUME', 'VOLUME_PER_SELL_ORDER',
                   'UNMATCHED_SELL_ORDER_QUANTITY', 'NET_VOLUME', 'RECORDED_DATE']
        src_df = pd.DataFrame(src_df.values, columns=columns)
        print(src_df.head())

    filename = date_string
    filename = filename.split("/")
    filename = ''.join([filename[-1*(l+1)] for l in range(len(filename))])
    filepath = destination + filename + '.csv'
    src_df.to_csv(filepath, index=False, encoding='utf-8-sig')
    src_df = src_df.to_json()
    return src_df

@app.route('/')
def index():
    return "<h1>Hello</h1>"

class command(Resource):

    def get(self):
        print("The program is running!")
        today = datetime.datetime.now().strftime('%d/%m/%Y')
        src_df = crawl_hnx_order_statistics(date_string=today)

        return src_df, 200

api.add_resource(command, '/data')

if __name__ == '__main__':
    app.run(host="0.0.0.0", port=5001, debug=True)

