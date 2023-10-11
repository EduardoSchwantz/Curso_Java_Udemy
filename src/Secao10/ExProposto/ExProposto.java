package Secao10.ExProposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExProposto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        List<Employee> func = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.print("Employee #:" + i);
            System.out.print("\nId: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            func.add(new Employee(id, name, salary));
        }
        print(func);

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Integer pos = position(func, id);
        if (pos == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            func.get(pos).increaseSalary(percent);
            print(func);
        }
        sc.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static void print(List<Employee> func) {
        System.out.print("\nList of employees:\n");
        for (Employee x : func) {
            System.out.println(x);
        }
    }
}

