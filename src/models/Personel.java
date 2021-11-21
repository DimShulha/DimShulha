package models;

import base.Sallary;

public class Personel implements Sallary {
    private String name;
    private double salary;
    private double hours;

    public String getName(){ return name; }

    public void setName(String name){ this.name = name;}

    public double getSalary(){ return  salary; }

    public void setSalary(double salary){ this.salary = salary; }

    public double getHours(){ return hours; }

    public void setHours(){this.hours = hours; }


    @Override
    public double calcSalary(double salary, double hours){
        return salary * hours;
    }

}
