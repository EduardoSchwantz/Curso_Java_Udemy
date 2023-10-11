/*import java.util.Locale;
import java.util.Scanner;

public class Anotacoes {
    public static void main(String[] args) {
        // psvm + tab para gerar o main
        //padrão para casas decimais ->Locale.setDefault(Locale.US);
        //entrada de dados ->Scanner sc = new Scanner(System.in);
        //declaração e escrita String-> String c = sc.nextLine();
        //nextLine() para consumir quebra de linha
        //declaração e escrita Int -> int N = sc.nextInt();
        //declaração e escrita float -> f = sc.nextFloat();
        //sout  + tab -> System.out.println();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        sc.close();
}
}
*/
/*
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Anotacoes {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");
        System.out.println(list.size());
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

    }
}
*/