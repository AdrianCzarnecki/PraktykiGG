package Lekcja4;
public class KwadratOpis {
    private int bokA;

    public KwadratOpis(int bokA) {
        this.bokA = bokA;
    }
    public int ObliczPole()
    {
        return bokA * bokA;
    }

    public int getBokA() {
        return bokA;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }
}
