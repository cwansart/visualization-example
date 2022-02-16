from flask import Flask
from flask_cors import CORS
import json

app = Flask(__name__)
CORS(app)

with open('plotdata.json', 'r') as f:
    plot_data = json.load(f)

# Callable via http://127.0.0.1:5000/plot
@app.route("/plot")
def hello_world():
    return plot_data