package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

import org.json.JSONObject;

public class Client {
    private int port;
    final String SERVER_ADDRESS = "localhost";

    public Client(int port) {
        this.port = port;
    }

    private void ProcessClient() throws IOException {
        try {
            Socket socket = new Socket(SERVER_ADDRESS, port);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

                JSONObject jsonMessage = new JSONObject();
                jsonMessage.put("message_type", "People");

                System.out.println("ingrese el nombre: ");
                String name = userInput.readLine();
                System.out.println("nombre ingresado " + name);

                out.println(jsonMessage.toString());

                Thread.sleep(30000);
                userInput.close();
                socket.close();

        } catch (SocketException ex){
            System.out.println("cliente desconectado");
            ex.printStackTrace();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client(4000);
        try {
            client.ProcessClient();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
