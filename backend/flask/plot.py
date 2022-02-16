from flask import Flask
import json

app = Flask(__name__)

with open('plotdata.json', 'r') as f:
    plot_data = json.load(f)

# Callable via http://127.0.0.1:5000/plot
@app.route("/plot")
def hello_world():
    return plot_data