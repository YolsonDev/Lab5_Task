package Zadanie6;

public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod("VW", 2004, 3, "Benzyna");
        Motocykl motocykl = new Motocykl("Yamaha", 2016, "Rzędowy", 600.0);

        // Rzutowanie
        Pojazd pojazd1 = samochod;
        Pojazd pojazd2 = motocykl;

        System.out.println("Marka samochodu: " + pojazd1.getMarka());
        System.out.println("Rok produkcji samochodu: " + pojazd1.getRokProdukcji());

        System.out.println("Marka motocykla: " + pojazd2.getMarka());
        System.out.println("Rok produkcji motocykla: " + pojazd2.getRokProdukcji());

    }
}
