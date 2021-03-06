import requests
import bs4
import random
from data import URL


def get_html(url):
    r = requests.get(url)
    return r.text


def get_data(Chapter):
    html = get_html(URL)
    soup = bs4.BeautifulSoup(html, 'html.parser')
    jokes_main_class = soup.find(class_='mw-parser-output')
    jokes_poem = jokes_main_class.find_all(class_='poem')
    joke = None
    if Chapter == '1':
        joke = jokes_poem[random.randint(0, 34)]
    elif Chapter == '2':
        joke = jokes_poem[random.randint(35, 65)]
    elif Chapter == '3':
        joke = jokes_poem[random.randint(66, 114)]
    elif Chapter == '4':
        joke = jokes_poem[random.randint(115, 127)]
    return joke.get_text()
