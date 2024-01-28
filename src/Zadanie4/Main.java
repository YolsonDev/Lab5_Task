package Zadanie4;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setImie("Sebastian");
        student.setNaziwsko("Kowalewski");
        student.setNumerIndeksu("1");

        System.out.println("Imię: " + student.getImie());
        System.out.println("Nazwisko: " + student.getNaziwsko());
        System.out.println("Numer indeksu: " + student.getNumerIndeksu());

        student.setNumerIndeksu("abc");
    }
}
