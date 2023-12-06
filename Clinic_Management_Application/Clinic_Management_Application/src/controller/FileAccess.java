package controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import model.*;

class FileAccess {

    public void writeToFile(String fileName, String str) {
        try {
            FileWriter stdinf = new FileWriter(fileName + ".txt", true);
            stdinf.write(str);
            stdinf.close();
        } catch (IOException ioe) {
        }
    }

    public ArrayList<Patient> readPatients() {
        ArrayList<Patient> allpatients = new ArrayList();
        String line;
        String pinfo[];
        try {
            FileInputStream fs = new FileInputStream("patients.txt");
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);

        
        while (in.ready()) {
            line = in.readLine();
            pinfo = line.split("\t");
            Patient p = new Patient(pinfo[0], pinfo[1]);
            if (pinfo[2].equals("inactive")) {
                p.deactiveP();
            }
            allpatients.add(p);
        }
        in.close();
    }
    catch(IOException e) { }
    return allpatients ;
}
        public ArrayList<Doctor> readDoctors() {
        ArrayList<Doctor> alldoctors = new ArrayList();
        String line;
        String dinfo[];
        try {
            FileInputStream fs = new FileInputStream("doctors.txt");
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);

        
        while (in.ready()) {
            line = in.readLine();
            dinfo = line.split("\t");
            Doctor d= new Doctor(dinfo[0], dinfo[1]);
            if (dinfo[2].equals("inactive")) {
                d.deactiveD();
            }
            alldoctors.add(d);
        }
        in.close();
    }
    catch(IOException e) { }
    return alldoctors ;
}
        public ArrayList<Appointment> readAppointment() {
        ArrayList<Appointment> allappointments = new ArrayList();
        String line;
        String ainfo[];
        try {
            FileInputStream fs = new FileInputStream("appointments.txt");
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);

        
        while (in.ready()) {
            line = in.readLine();
            ainfo = line.split("\t");
            Appointment a= new Appointment(ainfo[0],Integer.parseInt(ainfo[1]));
//            if (ainfo[2].equals("inactive")) {
//               
//            }
            allappointments.add(a);
        }
        in.close();
    }
    catch(IOException e) { }
    return allappointments ;
} 
        public void resetfile(String fileName){
            try{
                FileWriter info=new FileWriter (fileName+"txt",false);
                info.close();
            }
            catch(IOException ioe){
                
            }
        }
        public String[][]getAppointmentinfo(int rowcount){
          String[][]data=new String[rowcount][4];
          String ainfo[];
          String line="";
          int row=0;
          try{
            FileInputStream fs = new FileInputStream("appointments.txt");
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while(in.ready()){ 
                line=in.readLine();
                ainfo=line.split("\t");
                data [row][0]=ainfo[0];
                data [row][1]=ainfo[0];
                data [row][2]=ainfo[0];
                
            } 
            row++;
          
          in.close();
        }
         catch(IOException ioe){
                
            }
        return data;
        
        
}
}
