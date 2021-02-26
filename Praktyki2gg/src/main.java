public class main {

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
//zad3
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean programIsRunning = true;

        while(programIsRunning)
        {
            System.out.print("Podaj numer drzwi: ");
            String userInput = sc.next();

            switch (userInput)
            {
                case "1": {
                    System.out.println("Złe drzwi >:)");
                    break;
                }
                case "2": {
                    System.out.println("Złe drzwi >:)");
                    break;
                }
                case "3": {
                    programIsRunning = false;
                    break;
                }
                case "4": {
                    System.out.println("Złe drzwi >:)");
                    break;
                }
                case "5": {
                    System.out.println("Złe drzwi >:)");
                    break;
                }
                default: {
                    System.out.println("Podałeś złe dane!");
                }
            }
        }

        System.out.println("Bravo skończyłeś lochy!");
    }
}
//zad4
