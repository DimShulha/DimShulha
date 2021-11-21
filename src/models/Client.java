package models;

import base.Coast;
import base.Discount;

public class Client implements Coast,Discount {

    private String name;
    private int quontity;
    private double price;
    private double discount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quontity;
    }

    public void setQuantity(int quantity) {
        this.quontity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public double calcCoast(double price, int quontity){
        return price * quontity;
    }

    @Override
    public double calcCoast(double summ, double discount) {
        return summ - discount;
    }

    @Override
    public double calculDiscount(double summ) {
        return summ * discount;
    }
}