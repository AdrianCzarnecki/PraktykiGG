package Lekcja6;

public class Main {
    public static void main(String[] args) {
        //zad 1
        System.out.println("Zad 1");
        Piesek pies = new Piesek();
        pies.wiek();
        pies.wydajDzwiek();
        pies.sen();
        pies.Ciągnięcie();
        System.out.println();
        //zad 2
        System.out.println("Zad 2");
       Pojazd pojazd = new pojazd ();
        System.out.println(pojazd.awaria());
        pojazd.jedzDoPrzodu();
        pojazd.skrecwLewo();
        pojazd.skrecwPrawo();
        pojazd.stop();

        //zad 3
        System.out.println();
        System.out.println("Zad 3");
        PodajRocznikWina PodajRocznikWina = new  PodajRocznikWina ();
        PodajRocznikWina.bulgocze();
        PodajRocznikWina.nalewasie();
        PodajRocznikWina.rocznik();
        PodajRocznikWina.otwierasie();
        PodajRocznikWina.zostajewypite();

        //zad 4
        System.out.println();
        System.out.println("Zad 4");
        pies.badzMilutki();
        pies.bawsie();

        //zad 5
        System.out.println();
        System.out.println("Zad 5");
        Kwadrat kwadrat = new Kwadrat(6);
        System.out.println("Obw = "+kwadrat.obliczObw()+"\n"+"Pole = "+kwadrat.obliczPole());

    }
}
