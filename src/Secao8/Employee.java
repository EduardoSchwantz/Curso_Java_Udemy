package Secao8;

public class Employee {
    String name;
    double grossSalary;
    double tax;
    public double netSalary(){
        return this.grossSalary - this.tax;
    }
    public void increaseSalary(double percentage){
        this.grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", netSalary());
    }
}
