package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler extends Thread{
    private Socket clientSocket;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }
    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Lógica para recibir y procesar mensajes JSON
            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Mensaje recibido del cliente: " + message);

                // Aquí puedes implementar la lógica para procesar el mensaje recibido

                // Ejemplo: responder al cliente
                out.println("Mensaje recibido correctamente");
            }

            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
