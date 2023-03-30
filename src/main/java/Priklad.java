public class Priklad {


    private int prvniCislo;
    private int druheCislo;

    private String znamenko;

    private int  vysledek;

    private double vysleddekProDeleni;

    public Priklad(int prvniCislo, int druheCislo, String znamenko) {
        this.prvniCislo = prvniCislo;
        this.druheCislo = druheCislo;
        this.znamenko = znamenko;
    }

    public int getPrvniCislo() {
        return prvniCislo;
    }

    public void setPrvniCislo(int prvniCislo) {
        this.prvniCislo = prvniCislo;
    }

    public int getDruheCislo() {
        return druheCislo;
    }

    public void setDruheCislo(int druheCislo) {
        this.druheCislo = druheCislo;
    }

    public String getZnamenko() {
        return znamenko;
    }

    public void setZnamenko(String znamenko) {
        this.znamenko = znamenko;
    }

    public int getVysledek() {
        return vysledek;
    }

    public void setVysledek(int vysledek) {
        this.vysledek = vysledek;
    }

    public double getVysleddekProDeleni() {
        return vysleddekProDeleni;
    }

    public void setVysleddekProDeleni(double vysleddekProDeleni) {
        this.vysleddekProDeleni = vysleddekProDeleni;
    }
}
