package Secao10.ExProposto99;

public class Employee {
    private final int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void increaseSalary(double percentage){
        this.salary += this.salary * (percentage / 100);
    }

    @Override
    public String toString() {
        return this.id + ", " + this.name + ", " + String.format("%.2f" ,this.salary);
    }
}
