const http = require("http");
const plotData = require("./plotdata.json");

// Callable via http://localhost:4200/plot
const requestListener = function (req, res) {
  if (req.url === "/plot" && req.method === "GET") {
    res.writeHead(200, {
      "Access-Control-Allow-Origin": "*",
      "Content-Type": "application/json",
    });
    res.end(JSON.stringify(plotData));
  } else {
    res.writeHead(404);
    res.end();
  }
};

const server = http.createServer(requestListener);
server.listen(4200);
