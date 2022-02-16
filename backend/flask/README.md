# How to run

Install the dependencies first. Either run directly or create a venv first:

See here, but don't install Flask: https://flask.palletsprojects.com/en/2.0.x/installation/#create-an-environment 

To install the requirements run:
```
# macOS, Linux:
python3 -m pip install -r requirements.txt

# Windows:
py -m pip install -r requirements.txt
```

## CMD

```
set FLASK_APP=plot
flask run
```

## PowerShell

```
$env:FLASK_APP = "plot"
flask run
```

## Bash

```
export FLASK_APP=plot
flask run
```