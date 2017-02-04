package mango.service;


import java.io.IOException;

public class Run {

    public static void main(String[] ars){

        MangoService service = null;
        try {

            service = new MangoService();
            service.start();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
