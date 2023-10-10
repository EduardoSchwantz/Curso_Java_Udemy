package Secao8.Ex2;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee func = new Employee();
        System.out.print("Name: ");
        func.name = sc.nextLine();
        System.out.print("Gross salary: ");
        func.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        func.tax = sc.nextDouble();
        System.out.print("\nEmployee: " + func
                +"\nWhich percentage to increase salary? ");
        double percentage = sc.nextDouble();
        func.increaseSalary(percentage);
        System.out.println("\nUpdated data: " + func);
        sc.close();
        
    }
}
