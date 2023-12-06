package model;

public class Doctor {

    private String name;
    private String password;
    private char active;

    public Doctor(String name, String password) {
        this.name = name;
        this.password = password;
        
    }

    public Doctor() {

    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void activeD() {
        active = '1';
    }

    public void deactiveD() {
        active = '0';
    }

    @Override
    public String toString() {
        return name + "/t" + password ;
    }

}
