package app;

import java.util.Scanner;

public class Main {

    static Scanner scanner;
    private static String name;
    private static String position;
    private final static String CURRENCY = "USD";
    private static String wageRounded;
    private static String output;

    public static void main(String[] args) {
        chooseOption();
    }

    private static void chooseOption() {
        scanner  = new Scanner(System.in);
        System.out.println("""
                Choose an option:
                1 - get EmployeeA info.
                2 - get EmployeeB info.
                0 - close the app.
                """);
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> getEmployeeAInfo();
            case 2 -> getEmployeeBInfo();
            case 0 -> {
                scanner.close();
                System.out.println("App closed.");
                System.exit(0);
            }

            default -> {
                scanner.close();
                System.out.println("No such option. Restart the app.");
                System.exit(0);
            }
        }
    }

    private static void getEmployeeAInfo() {
        name = "Lucy";
        position = "secretary";
        String email = "abc@mail.com";
        int hours = 150;
        double tariff = 120.5;
        EmployeeA employeeA = new EmployeeA(name, position, email);
        wageRounded = employeeA.calcSalary(hours, tariff);
        output = "Employee: " + employeeA.getName() + " "
                + employeeA.getPosition() + " " + email +
                "\nsalary " + CURRENCY + " " + wageRounded;
        showInfo(output);
    }

    private static void getEmployeeBInfo() {
        name = "Tom";
        position = "manager";
        String phone = "555 123-4567";
        double quantity = 1500;
        double price = 20.99;
        EmployeeB employeeB = new EmployeeB(name, position, phone);
        wageRounded = employeeB.calcSalary(quantity, price);
        output = "Employee: " + employeeB.getName() + " " +
                employeeB.getPosition() + " " + phone +
                "\nsalary " + CURRENCY + " " + wageRounded;
        showInfo(output);
    }

    private static void showInfo(String output) {
        scanner.close();
        System.out.println(output);
    }
}
