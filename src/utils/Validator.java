package utils;

import java.util.Scanner;

public class Validator {


        // Валидация ввода имени
        public static String validateName(Scanner scanner) {
            String str = scanner.nextLine().trim();
            while (str.isEmpty()) {
                System.out.print("НЕ ИМЯ! Введите имя: ");
                str = scanner.nextLine().trim();
            }
            return str;
        }

        // Валидация ввода количества
        public static int validateQuantityInput(Scanner scanner) {
            while (!scanner.hasNextInt()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.print("Введите количество!: ");
            }
            int quantity = scanner.nextInt();
            while (quantity <= 0) {
                System.out.println("Неверное значение! Введите количество: ");
                while (!scanner.hasNextInt()) {
                    String str = scanner.next().trim();
                    System.out.printf("\"%s\" - не число!\n", str);
                    System.out.println("Введите количество!: ");
                }
                quantity = scanner.nextInt();
            }
            return quantity;
        }

        // Валидация ввода цены
        public static double validatePriceInput(Scanner scanner) {
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.print("Введите цену!: ");
            }
            double price = scanner.nextDouble();
            while (price <= 0) {
                System.out.print("Неверное значение! Введите цену: ");
                while (!scanner.hasNextDouble()) {
                    String str = scanner.nextLine().trim();
                    System.out.printf("\"%s\" - не число!\n", str);
                    System.out.print("Введите цену!: ");
                }
                price = scanner.nextDouble();
            }
            return price;
        }

    public static int validateDiscountInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите количество!: ");
        }
        int quantity = scanner.nextInt();
        while (quantity <= 0) {
            System.out.println("Неверное значение! Введите количество: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите количество!: ");
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }

    public static double validateHoursInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите количество часов отработанных за месяц!: ");
        }
        double hours = scanner.nextDouble();
        while (hours <= 100) {
            System.out.print("Неверное значение! Введите количество часов: ");
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.print("Введите количество часов!: ");
            }
            hours = scanner.nextDouble();
        }
        return hours;
    }
    }

