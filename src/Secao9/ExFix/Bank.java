package Secao9.ExFix;

import java.util.Locale;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String accountName = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        String control = sc.nextLine();
        Account client;
        double value;
        if (control.equals("y") || control.equals("Y")) {
            System.out.print("Enter initial deposit value: ");
            value = sc.nextDouble();

            client = new Account(accountName, accountNumber, value);
            System.out.println(client);
        } else {
            client = new Account(accountName, accountNumber);
            System.out.println(client);
        }

        System.out.print("\nEnter a deposit value: ");
        value = sc.nextDouble();
        client.deposit(value);

        System.out.print("\nEnter a withdraw value: ");
        value = sc.nextDouble();
        client.withDraw(value);
        sc.close();
    }
}
