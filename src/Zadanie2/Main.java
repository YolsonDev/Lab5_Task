package Zadanie2;

public class Main {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Sebasan", "Kowaski", 25);

        // Informacje przed zmianą
        osoba.informacje();

        //Zmiana informacji o osobie
        osoba.setImie("Sebastian");
        osoba.setNazwisko("Kowalewski");
        osoba.setWiek(26);

        // Informacje po zmianie
        System.out.println(osoba.getImie() + " "
                + osoba.getNazwisko() + " "
                + osoba.getWiek());


    }
}
