package models;

import base.Coast;
import base.Discount;

public class Client implements Coast,Discount {

    private String name;
    private int quontity;
    private double price;
    private double discount;

// Конструктор.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuontity() {
        return quontity;
    }

    public void setQuontity(int quantity) {
        this.quontity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {this.price = price;}

    public double getDiscount() { return discount; }

    public void setDiscount(double discount){this.discount = this.discount; }


    // Подсчет цены товара.
    @Override
    public double calcCoast(double price, int quontity){
        return price * quontity;
    }

    // Подсчет цены товара со скидкой.
    @Override
    public double calcCoast(double coast, double discount) {
        return coast - discount;
    }

    // Сумма скидки.
    @Override
    public double calculDiscount(double coast) {
        return coast * discount / 100;
    }
}