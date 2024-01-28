package Zadanie1.PrzykladNaGrze;

public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektów różnych postaci
        Postac postac = new Postac("Gracz1", 100);

        //Nawet jeśli postać jest wojownikiem, możesz ją trzymać jako ogólną postać:
        //W ten sposób, nawet jeśli zadeklarowaliśmy postac jako Postac, to w rzeczywistości jest to wojownik
        Postac upcastingCharacter = new Wojownik("Aragorn",150, 900);

        Wojownik wojownik = new Wojownik("Wojownik1", 120, 30);
        Mag mag = new Mag("Mag1", 80, 40);



        //test rzutowanie w dół

        if (upcastingCharacter instanceof Wojownik) {
            // Rzutowanie w dół do klasy Wojownik
            Wojownik konkretnyWojownik = (Wojownik) upcastingCharacter;

            // Teraz możemy używać metod specyficznych dla klasy Wojownik
            konkretnyWojownik.atak();
        } else {
            System.out.println("Obiekt nie jest instancją klasy Wojownik");
        }



// Wywoływanie metod różnych postaci
        upcastingCharacter.atak();
        postac.atak();
        wojownik.atak();
        mag.atak();

        postac.przedstawSie();
        wojownik.przedstawSie();
        mag.przedstawSie();
    }
}
