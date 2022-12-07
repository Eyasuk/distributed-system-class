import net from 'net';

const port = 1277;

const server = net.createServer((socket) => {
  socket.end('data 1');
})

server.listen(port);

