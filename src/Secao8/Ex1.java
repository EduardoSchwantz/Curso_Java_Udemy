package Secao8;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle retangulo = new Rectangle();
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();
        double area = retangulo.Area();
        double perimetro = retangulo.Perimeter();
        double diagonal = retangulo.Diagonal();
        System.out.println("Área: "
                            + area +
                            "\nPerímetro: "
                            + perimetro +
                            "\nDiagonal: "
                            + diagonal);
        sc.close();
    }
}
