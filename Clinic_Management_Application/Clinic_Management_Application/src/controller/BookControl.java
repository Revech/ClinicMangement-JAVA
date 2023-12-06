package controller;

import java.util.ArrayList;
import model.*;

public class BookControl {

    Patient activePatient;
    Appcontrol controller;
    ArrayList<Purchase> cart;

    public BookControl() {
        controller = new Appcontrol();
    }

    public ArrayList<Purchase> getPurchase() {
        return cart;

    }

    public void setPurchase(ArrayList<Purchase> purchase) {
        this.cart =cart;
    }

    public void addAppointment(String date,int price) {
        Purchase p = new Purchase(date, price);
    }

    public void removeAppointment(String date) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getAdate().equals(date)) {
                cart.remove(i);
            }

        }
    }

    public void removePurchase() {
        cart.removeAll(cart);
    }
    public int estimatePrice(){
        int price=0;
        for(int i=0;i<cart.size();i++){
        String adate=cart.get(i).getAdate();
        int p=cart.get(i).getPrice();
        price=p;
        }
        return price;
     }
    
    public void addTocart(String adate,int price){
        Purchase p=new Purchase(adate,price);
        cart.add(p);
        
    }
    public void removeFromCart(String date){
        for(int i=0;i<cart.size();i++){
            if(cart.get(i).getAdate().equals(date)){
                cart.remove(i);
            }
        }
    }
   
    public String printCart(){
        String s="";
        for(int i=0;i<cart.size();i++){
            s+=cart.get(i).getAdate()+"\t"+cart.get(i).getDname()+"\t"+cart.get(i).getPrice();
            
        }
        return s;
    }
}
