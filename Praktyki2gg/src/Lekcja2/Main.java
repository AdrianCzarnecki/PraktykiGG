package Lekcja2;

public class Main {

    public static void main(String[] args) {
        //zad1

        char letterA = 'A';

        for (int i=0; i<26; i++){
            if( i % 2 ==0)
                System.out.print(letterA + "\t");
            letterA++;
        }
        //zad2
        int x=11;
        int inta=0;
        int intb=1;
        for (int i=0; i <x; i++){
            System.out.print(intb + " ");
            intb += inta;
            inta = intb-inta;
        }

    }

}




