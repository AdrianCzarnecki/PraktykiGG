package Lekcja7Kontynuacja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            //Zad 1
            System.out.println("Zadanie 1");
            Scanner scanner = new Scanner(System.in);
            List<String> array = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                String x = scanner.nextLine();
                boolean z = false;
                for (int j = 0; j < array.size(); j++) {
                    if (array.get(j).equals(x)) {
                        z = true;
                    }
                }
                if (z == false) {
                    array.add(x);
                } else {
                    System.out.println("Liczba sie powtarza, nie zostanie zapisana do tablicy");
                }
            }
            //zad2

            for(int i = 0; i < array.size(); i++){
                System.out.println("Array["+i+"] = "+array.get(i));
            }
            System.out.println("Zadanie 2");
            try {
                for(int j=0;j<5;j++){
                    System.out.println("Podaj index");
                    array.remove(scanner.nextInt());
                }
            }catch (java.util.InputMismatchException InputMismatchException){
                System.out.println("Zły typ danych");
            }
            //zad3
            System.out.println("Zadanie 3");
            for(int h=0;h<2;h++){
                System.out.println("Podaj index elementu który chcesz zamienić");
                int x1=scanner.nextInt();
                scanner.nextLine();
                System.out.println("na co chcesz zamienić el "+array.get(x1));
                String y1=scanner.nextLine();
                array.set(x1,y1);
            }
            for(int i = 0; i < array.size(); i++) {
                System.out.println("Array[" + i + "] = " + array.get(i));
            }
        }

}

