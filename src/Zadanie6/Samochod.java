package Zadanie6;

public class Samochod extends Pojazd {
    private int liczbaDrzwi;
    private String typSilnika;
    public Samochod(String marka, int rokProdukcji, int liczbaDrzwi, String typSilnika){
        super(marka, rokProdukcji);
        this.liczbaDrzwi = liczbaDrzwi;
        this.typSilnika = typSilnika;
    }

    public int getLiczbaDrzwi() {
        return liczbaDrzwi;
    }

    public String getTypSilnika() {
        return typSilnika;
    }
}
