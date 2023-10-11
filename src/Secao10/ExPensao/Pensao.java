package Secao10.ExPensao;

import java.util.Locale;
import java.util.Scanner;

public class Pensao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rooms[] rooms = new Rooms[10];
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        String name, email;
        int room;
        for (int i = 1; i <= n; i++) {
            System.out.print("Rent #" + i);
            System.out.print("\nName: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Room: ");
            room = sc.nextInt();
            rooms[room] = new Rooms(name, email);
        }
        System.out.println("Busy rooms: ");
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i] != null){
                System.out.println(i + ": " + rooms[i]);
            }
        }
        sc.close();
    }
}
