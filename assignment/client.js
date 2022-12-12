import net from "net"

const port = 1277;
const host = "127.0.0.1";
// we tried public ip it workes fine 
// the reason we used local host is to make it compatable on every computer
// even if ip is changed
try {
    const client = new net.Socket()
    client.connect({ port: port, host: host }, () => {
        console.log('Client is alive and establishing socket connection. \n');
    })
    client.on("data", (data) => {
        console.log(data.toString());
    });
} catch (error) {
    console.log('Error establishing connection')
}