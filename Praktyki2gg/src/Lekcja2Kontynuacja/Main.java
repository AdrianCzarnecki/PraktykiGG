package Lekcja2Kontynuacja;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //zad3
        System.out.println("Zad 3 \n");
        Scanner sc = new Scanner(System.in);
        boolean programIsRunning = true;

        while (programIsRunning) {
            System.out.print("Podaj numer drzwi: ");
            String userInput = sc.next();

            switch (userInput) {
                case "1": {
                    System.out.println("Wybrałeś dobre drzwi. Gratulacje!");
                    programIsRunning = false;
                    break;
                }
                case "2": {
                    System.out.println("Wybrałeś złe drzwi. Spóbój ponownie");
                    break;
                }
                case "3": {
                    System.out.println("Wybrałeś złe drzwi. Spóbój ponownie");
                    break;
                }
                case "4": {
                    System.out.println("Wybrałeś złe drzwi. Spóbój ponownie");
                    break;
                }
                case "5": {
                    System.out.println("Wybrałeś złe drzwi. Spóbój ponownie");
                    break;
                }
                default: {
                    System.out.println("Zly rodzaj danych");
                }
            }
        }

        System.out.println("Zad 4 \n");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        System.out.println("\n" + "\n");

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int x = j * i;
                int y = x % 6;
                if (y == 0) {
                    System.out.print(x + "\t");
                } else {
                    System.out.print("X" + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("\n" + "\n" + "Zad 5");
        //zad 5
        int wysokoscTrojkata = 5;
        for (int i = 0; i < wysokoscTrojkata; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
        }
}

