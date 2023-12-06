
package model;

public class Appointment {
   private String date;
   private int price;

    public Appointment(String date, int price) {
        this.date = date;
        this.price = price;
    }

    public Appointment() {
    }


    public String getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return date + "/t" + price ;
    }
    
}
