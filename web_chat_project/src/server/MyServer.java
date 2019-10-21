package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public void MyServ() {
        Socket socket = null;
        ServerSocket server = null;
        try {
            server = new ServerSocket(8189);
            System.out.println("Server started");

// подключение клиентов
            while (true) {
                socket = server.accept();
                System.out.println("Client connected");
                new ClientHandler(this, socket);
            }

//            DataInputStream in = new DataInputStream(socket.getInputStream());
//            DataOutputStream out = new DataOutputStream(socket.getOutputStream());


        } catch (IOException e) {
 //           e.printStackTrace();
            System.out.println("client disconnected");
        }
    }
}
