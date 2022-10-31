package app;


public class EmployeeB extends Employee {
    String phone;

    public EmployeeB(String name, String position, String phone) {
        super(name, position);
        this.phone = phone;
    }
    String calcSalary(double quantity, double price) {
        double sales = quantity * price;
        double salary;
        if (sales < 10000) {
            salary = sales * 0.05;
        } else if (sales > 10000 && sales <= 30000) {
            salary = sales * 0.1;
        } else {
            salary = sales * 0.15;
        }
        return Rounder.roundValue(salary);
    }
