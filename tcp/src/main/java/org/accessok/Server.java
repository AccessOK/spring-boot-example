package org.accessok;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            while (true) {
                Socket socket = serverSocket.accept();
                Thread thread = new Thread(() -> {
                    try {
                        InputStream inputStream = socket.getInputStream();

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                })
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
