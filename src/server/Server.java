package server;

import view.View;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Server {
    private ArrayList<Socket> clients;
    private int port;

    View view = new View();
    public Server(int port){
        this.port = port;
        this.clients = new ArrayList<>();
    }
    private void runServer(){
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("servidor escuchando en el puerto " + port);

            while(true){
                Socket clientSocket = serverSocket.accept();
                System.out.println("cliente conectado desde: " +clientSocket.getInetAddress().getHostAddress());

                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clientHandler.start();

                view.showMessage("cliente conectado");
                clients.add(clientSocket);
            }
        } catch (SocketException ex) {
            System.out.println("cliente desconectado");
            ex.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        Server server = new Server(4000);
        server.runServer();
    }
}
