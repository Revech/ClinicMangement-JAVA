package Server_Admin;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.net.*;

public class Admin {

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8000);
            System.out.print("Server started");
            Socket s = ss.accept();
            DataInputStream inputFromClient = new DataInputStream(s.getInputStream());
            DataOutputStream outputToClient = new DataOutputStream(s.getOutputStream());
            while (true) {
                int num = inputFromClient.readInt();
                System.out.println("You have a discount,CONGRATULATIONS" + num);
                double discount = num - num * 0.02;
                System.out.println("Your amount to pay after the discount of 20% is " + discount);
                outputToClient.writeDouble(discount);
                System.out.println("Discount sent to patient");
            }

        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
