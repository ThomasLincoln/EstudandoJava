import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream input = null;

    public Server(int port) {
        try {
            server = new ServerSocket(port);
            System.out.println("Server started");

            System.out.println("Waiting for a cliente...");

            socket = server.accept();
            System.out.println("Client accepted");

            input = new DataInputStream(
                    new BufferedInputStream(socket.getInputStream()));
            String line = "";

            while (!line.equals("Over")) {
                try {
                    line = input.readUTF();
                    System.out.println(line);
                } catch (IOException i) {
                    System.out.println(i);
                }
            }

            System.out.println("Closing Connection");

            socket.close();
            input.close();

        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws Exception {
        Server server = new Server(5000);
    }
}
