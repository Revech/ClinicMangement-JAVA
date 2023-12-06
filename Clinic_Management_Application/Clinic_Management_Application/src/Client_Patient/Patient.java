
package Client_Patient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;

public class Patient {
    DataOutputStream toServer=null;
    DataInputStream fromServer=null;
    

public static void main (String []args){
    try{  
    Socket s=new Socket("localhost",8000);
       DataInputStream fromServer=new DataInputStream(s.getInputStream());
       DataOutputStream toServer=new DataOutputStream(s.getOutputStream());
       toServer.writeChars("Thank you for your services");
       System.out.println("Thank you");
       toServer.flush();
       double discount=fromServer.readDouble();
       System.out.println("Your amount to pay after the discont of 20% is " + discount);
    
       s.close();
    
    }
    catch (Exception e){
        System.out.print(e);
    }
}
}