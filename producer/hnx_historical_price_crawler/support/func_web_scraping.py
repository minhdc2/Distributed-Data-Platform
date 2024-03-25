from bs4 import BeautifulSoup
from selenium import webdriver
import time
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.options import Options

def parse_html_with_selenium(url_path, login_info=None):
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
    time.sleep(7)
    content = driver.page_source
    driver.close()
    soup = BeautifulSoup(content, "html.parser")
    return soup