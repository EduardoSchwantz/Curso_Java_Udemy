package Secao14.ExFixacaoAbstract.application;

import Secao14.ExFixacao.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> Pessoa = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){

        }
        sc.close();
    }
}
