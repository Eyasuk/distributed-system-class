import net from 'net';

const host = "127.0.0.1";
// we tried public ip it workes fine 
// the reason we used local host is to make it compatable on every computer
// even if ip is changed
const port = 1277;
const SIM_LENGTH = 10;

try {
    const server = net.createServer((socket) => {

        for (let count = 0; count <= SIM_LENGTH; count++) {
            socket.write(`connect_socket ${count} \n`)
            console.log(`Server has written ${count} to socket \n`);

        }
        socket.end();


    });
    server.listen(port, () => {
        console.log("Server is alive and wating for socket connection from client Information.\n");
    });
} catch (error) {
    console.error('Socket error')
}