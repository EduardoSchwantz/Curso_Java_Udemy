package Secao8.Ex4;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o preço do Dolar? $ ");
        double dollarPrice = sc.nextDouble();
        System.out.print("Quantos dolares você deseja comprar? $ ");
        double amount = sc.nextDouble();
        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
        System.out.printf("Você pagará R$ %.2f reais", result);
        sc.close();
    }
}
