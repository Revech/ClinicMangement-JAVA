package controller;

import java.util.ArrayList;
import model.*;

public class Appcontrol {

    FileAccess fA;

    public Appcontrol() {
        fA = new FileAccess();
    }

    public void addoffering(String date, int price) {
        Appointment a = new Appointment(date, price);
        String str=a.toString()+"\n";
        fA.writeToFile("Appointments :", str);
       
    }

    public void addpatient(String name, String pass) {
        Patient p = new Patient(name, pass);
        String str=p.toString()+"\n";
        fA.writeToFile("Patients :", str);
        
    }

    public void adddoctor(String name, String pass) {
        Doctor d = new Doctor(name, pass); 
        String str=d.toString()+"\n";
        fA.writeToFile("Doctors :",str);
    }

    public void addAppointment(String date, int price) {
        Appointment a = new Appointment(date, price);
        String str=a.toString()+"\n";
        fA.writeToFile("Appointments :",str);
    }

    public String printallofferings() {
        String s = "";
        ArrayList<Appointment> allofferings = fA.readAppointment();
        for (int i = 0; i < allofferings.size(); i++) {
            s += allofferings.get(i).toString() + "\n";
        }
        return s;
    }

    public String printalldoctors() {
        String s = "";
        ArrayList<Doctor> alldoctors = fA.readDoctors();
        for (int i = 0; i < alldoctors.size(); i++) {
            s += alldoctors.get(i).toString() + "\n";
        }
        return s;
    }

    public String printallpatients() {
        String s = "";
        ArrayList<Patient> allpatients = fA.readPatients();
        for (int i = 0; i < allpatients.size(); i++) {
            s += allpatients.get(i).toString() + "\n";
        }
        return s;
    }

    public boolean CheckPatient(String name, String pass) {
        boolean b = false;
        ArrayList<Patient> allpatients = fA.readPatients();
        for (int i = 0; i < allpatients.size(); i++) {
            if (allpatients.get(i).getName().equals(name) && allpatients.get(i).getPassword().equals(pass)) {
                b = true;
            }
        }
        return b;
    }

    public boolean CheckDoctor(String name, String pass) {
        boolean b = false;
        ArrayList<Doctor> alldoctors = fA.readDoctors();
        for (int i = 0; i < alldoctors.size(); i++) {
            if (alldoctors.get(i).getName().equals(name) && alldoctors.get(i).getPassword().equals(pass)) {
                b = true;
            }
        }
        return b;
    }

    public ArrayList<String> getAllAppointments() {
        ArrayList<String> out = new ArrayList();
        ArrayList<Appointment>allappointments=new ArrayList();
        allappointments=fA.readAppointment();
        for (int i = 0; i < allappointments.size(); i++) {
            out.add(allappointments.get(i).getDate());
        }
        return out;
        

    }

    public void addPurchase(ArrayList<Purchase> cart) {
        for (int i = 0; i < cart.size(); i++) {
            fA.writeToFile("Purchases", cart.get(i).toString() + "\n");

        }
    }

    public ArrayList<Appointment> getAppointmentList() {
        return fA.readAppointment();
    }

    public ArrayList<Doctor> getDoctorsList() {
        return fA.readDoctors();
    }

    public ArrayList<Patient> getPatientsList() {
        return fA.readPatients();
    }

    public String getPrice(String price) {
        return price;
    }
    public String getDate(String date){
        return date;
    }

    public String getDname(String dname) {
        return dname;
    }

    public int getAppointmentCount() {
        return fA.readAppointment().size();
    }

    public String[][] getAppointmentdata() {
        int row = this.getAppointmentCount();
        String[][] data = fA.getAppointmentinfo(row);
        return data;

    }
}
