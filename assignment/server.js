import net from 'net';

const port = 1277;

const server = net.createServer((socket) => {
  socket.end('');
})

server.listen(port);

