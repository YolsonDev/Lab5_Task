package Zadanie4;

public class Student {
    private String imie;
    private String naziwsko;
    private String numerIndeksu;

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNaziwsko(String naziwsko) {
        this.naziwsko = naziwsko;
    }
    public void setNumerIndeksu(String numerIndeksu){
        if(numerIndeksu.matches("\\d+")){
            this.numerIndeksu = numerIndeksu;
        } else {
            System.out.println("Błędny indeks, indeks musi składać się z samych numerów");
        }
    }

    public String getImie(){
        return imie;
    }
    public String getNaziwsko(){
        return naziwsko;
    }
    public String getNumerIndeksu(){
        return numerIndeksu;
    }
}