package Zadanie6;

public class Motocykl extends Pojazd{
    private String typNapedu;
    private double pojemnoscSilnika;

    public Motocykl(String marka,int rokProdukcji, String typNapedu, double pojemnoscSilnika){
        super(marka, rokProdukcji);
        this.typNapedu = typNapedu;
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public String getTypNapedu() {
        return typNapedu;
    }

    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }
}
