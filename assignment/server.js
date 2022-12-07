import { createServer } from "http";
import  server  from "socket.io";

const Server = server;
const port = 1277;

const httpServer = createServer();
const io = new Server(httpServer, {});

io.on("connection", (socket) => {
  
});

httpServer.listen(port);
