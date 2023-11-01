package Secao14.ExFixacao.application;

import Secao14.ExFixacao.entities.ImportedProduct;
import Secao14.ExFixacao.entities.Product;
import Secao14.ExFixacao.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> product = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (ch == 'i' || ch == 'I'){
                System.out.print("Customs fee: ");
                double customFee = sc.nextDouble();
                product.add(new ImportedProduct(name, price, customFee));
            } else if (ch == 'u' || ch == 'U') {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.print("Manufacture date (dd/MM/yyyy): ");
                Date manufactureDate = sdf.parse(sc.next());
                product.add(new UsedProduct(name, price, manufactureDate));
            }else product.add(new Product(name, price));
        }
        System.out.print("\nPRICE TAGS:\n");
        for(Product prod: product){
            System.out.println(prod.priceTag());
        }
        sc.close();
    }
}
