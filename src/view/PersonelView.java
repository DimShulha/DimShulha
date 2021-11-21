package view;

import models.Personel;
import utils.Validator;

import java.util.Scanner;

public class PersonelView {

    Personel mode;
    String headline;
    String name;
    double salary;
    double hours;
    Scanner scanner;

    public PersonelView( Personel mode ){ this.mode = mode; }

    public void InputText(){

        scanner = new Scanner(System.in);

        headline = "Введите имя работника - ";
        System.out.print(headline);
        name = Validator.validateName(scanner);
        mode.setName(name);

        headline = "Введите оплата за час работы - ";
        System.out.print(headline);
        salary =  Validator.validatePriceInput(scanner);
        mode.setSalary(salary);

        headline = "Введите количество отработанных часов за месяц - ";
        System.out.print(headline);
        hours = Validator.validateHoursInput(scanner);
        mode.setHours(hours);

        scanner.close();
    }

    public void Output(String output) {
        System.out.println(output);
    }

}
