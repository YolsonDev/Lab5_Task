package Zadanie5;

public class Figura {
    private String rodzaj;
    private String kolor;

    public Figura(String rodzaj, String kolor){
        this.rodzaj = rodzaj;
        this.kolor = kolor;
    }

    public String getRodzaj(){
        return rodzaj;
    }
    public String getKolor(){
        return kolor;
    }
}
