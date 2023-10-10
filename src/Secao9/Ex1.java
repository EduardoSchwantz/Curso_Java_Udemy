package Secao9;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);
        System.out.println("\nProduct data: " + product);
        System.out.print("\nEnter the number of products to be added in stock: ");
        int quantityAdd = sc.nextInt();
        product.addProducts(quantityAdd);
        System.out.println("\nUpdated data: " + product);
        System.out.print("\nEnter the number of products to be removed from stock: ");
        int quantityRem = sc.nextInt();
        product.removeProducts(quantityRem);
        System.out.println();
        System.out.println("Updated data: " + product);
        sc.close();
    }
}
