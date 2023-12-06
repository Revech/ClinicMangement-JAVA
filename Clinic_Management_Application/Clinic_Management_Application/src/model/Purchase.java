
package model;


public class Purchase {
  private String adate;//appointment date
  private String dname;//doctor name
  private int price;//price of appointment to be payed

    public Purchase(String adate,int price) {
        this.adate = adate;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    

    public String getAdate() {
        return adate;
    }


    public String getDname() {
        return dname;
    }

    public void setAdate(String adate) {
        this.adate = adate;
    }



    public void setDname(String dname) {
        this.dname = dname;
    }
    
}
