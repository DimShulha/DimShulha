package view;

import models.Client;
import utils.Validator;

import java.util.Scanner;

public class ClientView {

    Client mode;
    String headline;
    String name;
    double price;
    int quontity;
    double discount;
    Scanner scanner;

    public ClientView( Client mode ){
        this.mode = mode; }

    public void InputText(){

        scanner = new Scanner(System.in );

        headline = "Введите имя клиента: ";
        System.out.print(headline);
        name = Validator.validateName(scanner);
        mode.setName(name);

        headline = "Введите количество: ";
        System.out.print(headline);
        quontity = Validator.validateQuantityInput(scanner);
        mode.setQuontity(quontity);

        headline = "Введите цену: ";
        System.out.print(headline);
        price = Validator.validatePriceInput(scanner);
        mode.setPrice(price);

        headline = "Введите процент скидки: ";
        System.out.println(headline);
        discount = Validator.validateDiscountInput(scanner);
        mode.setDiscount(discount);

        scanner.close();

    }

    public void Output(String output) {
        System.out.println(output);
    }
}
