public class main1lekcja {
    public static void main(String[] args) {
        //Zad 1
        int intA = 4;
        double doubleB = 3.2;
        char charC = 'A';
        String stingD = "Adrian Czarnecki";

        System.out.println(intA + " " + doubleB + " " + charC + " " + stingD);

        //zad2
        int intB = 5;
        int intC = 4;
        int suma = intB * intB + intC * intC;
        System.out.println("Wynik = " + suma);

        //zad3
        int intD = 7;
        double sqrt = Math.sqrt(3);
        double pole = intD * intD * sqrt / 4;
        System.out.println("Pole = " + pole);

        //zad4
        String imie = "Imie : Adrian";
        String nazwisko = "Nazwisko : Czarnecki";
        System.out.println(imie + "\n" + nazwisko);
    }
}
