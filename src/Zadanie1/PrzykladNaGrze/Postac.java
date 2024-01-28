package Zadanie1.PrzykladNaGrze;

public class Postac {
    String imie;
    int poziomZdrowia;

    public Postac(String imie, int poziomZdrowia) {
        this.imie = imie;
        this.poziomZdrowia = poziomZdrowia;
    }

    void atak() {
        System.out.println("Postać atakuje!");
    }

    void przedstawSie() {
        System.out.println("Jestem postacią o imieniu " + imie);
    }
}
