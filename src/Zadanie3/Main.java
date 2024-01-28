package Zadanie3;

public class Main {
    public static void main(String[] args) {
        Uczen uczen1 = new Uczen("Sebastian", "Kowalewski");
        uczen1.dodajOcene(4);
        uczen1.dodajOcene(2);
        uczen1.dodajOcene(3.5);

        uczen1.wyswietlInformacje();

    }
}
