package mango.service;

import mango.data.Database;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MangoService {

    ServerSocket serverSocket;

    public MangoService() throws IOException {
        serverSocket = new ServerSocket(Settings.PORT);
    }

    public void start() throws IOException {

        System.out.println("Mango service running..");
        while (true){
            Socket clientSocket = serverSocket.accept();

            System.out.println("socket acepted");

            new Thread(() -> {
                try {

                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    String line = null;
                    while ((line = in.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();


        }
    }

}
