
package model;


public class Patient {
    private String name;
    private String password;
    private char active ;

    public Patient(String name, String password) {
        this.name = name;
        this.password = password;
        this.active='1';
    }

    public Patient() {
       
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
    public void activeP(){
     active='1';
    
}
    public void deactiveP(){
     active='0';
    }
    @Override
    public String toString() {
        return  name + "/t"+ password ;
    }
    
    
}
