package Zadanie1.PrzykladNaGrze;

public class Wojownik extends Postac{
    int poziomAtaku;

    public Wojownik(String imie, int poziomZdrowia, int poziomAtaku) {
        super(imie, poziomZdrowia);
        this.poziomAtaku = poziomAtaku;
    }

    // Przesłonięcie metody atak() dla wojownika
    @Override
    void atak() {
        System.out.println("Wojownik "+imie+" atakuje z siłą "+poziomAtaku+"!");
    }
}
