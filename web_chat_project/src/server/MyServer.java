package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        Socket socket = null;
        ServerSocket server = null;
        try {
            server = new ServerSocket(8189);
            System.out.println("Server started");

            socket = server.accept();
            System.out.println("Client connected");

//            DataInputStream in = new DataInputStream(socket.getInputStream());
//            DataOutputStream out = new DataOutputStream(socket.getOutputStream());


        } catch (IOException e) {
 //           e.printStackTrace();
            System.out.println("client disconnected");
        }
    }
}
