package Zadanie6;

public class Pojazd {
    private String marka;
    private int rokProdukcji;

    public Pojazd(String marka, int rokProdukcji){
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
    }
    public String getMarka(){
        return marka;
    }
    public int getRokProdukcji(){
        return rokProdukcji;
    }
}
