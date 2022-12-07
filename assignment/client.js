import net from "net"

const port = 1277;
const host = "127.0.0.1"
const client = new net.Socket()
client.connect({ port: port, host: host })
client.on("data", (data) => {
  console.log(data);
})
