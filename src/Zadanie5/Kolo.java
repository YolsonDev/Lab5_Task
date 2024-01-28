package Zadanie5;

public class Kolo extends Figura{
    private double promien;
    public Kolo(String rodzaj, String kolor, double promien){
        super(rodzaj, kolor);
        this.promien = promien;
    }
    public double getPromien(){
        return promien;
    }
    public double obliczPole(){
        return Math.PI * promien * promien;
    }
    public double obliczObwod(){
        return 2 * Math.PI * promien;
    }
}
