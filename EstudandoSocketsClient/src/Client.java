import java.net.Socket;
import java.util.Scanner;
import java.io.*;
import java.net.*;

public class Client {
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;

    public Client(String address, int port) {
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");

            input = new DataInputStream(System.in);
            output = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException u) {
            System.out.println(u);
            return;
        } catch (IOException i) {
            System.out.println(i);
            return;
        }

        String line = "";

        while (!line.equals("Over")) {
            try {
                Scanner scanner = new Scanner(System.in); // Cria um Scanner para ler a entrada do teclado

                while (!line.equals("Over")) {
                    line = scanner.nextLine(); 
                    output.writeUTF(line);
                }

            } catch (IOException i) {
                System.out.println(i);
            }
        }

        try {
            input.close();
            output.close();
            socket.close();
        }catch(IOException i){
            System.out.println(i);
        }

    }
    public static void main(String args[]){
        Client client = new Client("127.0.0.1", 5000);
    }
}
