package Zadanie3;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Uczen {
    private String imie;
    private String nazwisko;
    private ArrayList<Double> oceny;

    public Uczen(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = new ArrayList<>();
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void dodajOcene(double ocena) {
        if (ocena >= 2.0 && ocena <= 5.0) {
            oceny.add(ocena);
        } else {
            System.out.println("Błędna ocena zakres od 2 do 5");
        }
    }
    public double sredniaOcen(){
        if(oceny.isEmpty()){
            return 0.0;
        } else{
            double sumaOcen = 0.0;
            for(double ocena : oceny) {
                sumaOcen += ocena;
            }
            double srednia = sumaOcen / oceny.size();
            srednia = srednia * 100.0;
            srednia = Math.round(srednia);
            srednia = srednia / 100.0;
            return srednia;
        }
    }
    public void wyswietlInformacje(){
        System.out.println("Uczen: " + imie + " " + nazwisko);
        System.out.println("Oceny: " + oceny);
        System.out.println("Średnia ocen: " + sredniaOcen());
    }
}
