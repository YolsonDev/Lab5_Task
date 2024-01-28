package Zadanie5;

public class Kwadrat extends Figura{
    private double bok;

    public Kwadrat(String rodzaj, String kolor, double bok) {
        super(rodzaj, kolor);
        this.bok = bok;
    }
    public double getBok(){
        return bok;
    }
    public double obliczPole(){
        return bok * bok;
    }
    public double obliczObwod(){
        return 4 * bok;
    }
}
