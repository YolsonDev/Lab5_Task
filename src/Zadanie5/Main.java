package Zadanie5;

public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat("Kwadrat", "Zielony", 5);
        System.out.println("Pole kwadratu wynosi: " + kwadrat.obliczPole());
        System.out.println("Obwód kwadratu wynosi: " + kwadrat.obliczObwod());

        Kolo kolo = new Kolo("Kolo", "Czarny", 5);
        System.out.println("Pole koła wynosi: " + Math.round(kolo.obliczPole()));
        System.out.println("Obwód koła wynosi: " + Math.round(kolo.obliczObwod()));

    }
}
