package client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by Arun on 04-02-2017.
 */
public class Client {

    public static void main(String [] args ){


        System.out.println("client test started");



        try {
            Socket link = new Socket(InetAddress.getLocalHost(),60010);

                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(link.getOutputStream()));

                while (true) {
                    out.write("Hello World!");
                    out.newLine();
                    out.flush();

                    Thread.sleep(2000);
                }


        } catch (InterruptedException e){
                e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}

