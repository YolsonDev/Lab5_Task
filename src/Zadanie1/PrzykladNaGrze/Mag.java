package Zadanie1.PrzykladNaGrze;

public class Mag extends Postac {
    int poziomMagii;

    public Mag(String imie, int poziomZdrowia, int poziomMagii) {
        super(imie, poziomZdrowia);
        this.poziomMagii = poziomMagii;
    }

    // Przesłonięcie metody przedstawSie() dla maga
    @Override
    void przedstawSie() {
        System.out.println("Jestem magiem o imieniu " + imie + " i poziomie magii " + poziomMagii);
    }

}
