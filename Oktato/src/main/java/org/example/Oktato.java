package org.example;

public class Oktato {
    private String nev;
    private String neptunkod;
    private int eletkor;
    private String egyetem;
    private String intezet;
    private String beosztas;
    private int tantargyakSzama;
    private double fizetes;
    private int publikaciokSzama;

    public Oktato(String nev, String neptunkod, int eletkor, String egyetem, String intezet, String beosztas, int tantargyakSzama, double fizetes, int publikaciokSzama) {
        this.nev = nev;
        this.neptunkod = neptunkod;
        this.eletkor = eletkor;
        this.egyetem = egyetem;
        this.intezet = intezet;
        this.beosztas = beosztas;
        this.tantargyakSzama = tantargyakSzama;
        this.fizetes = fizetes;
        this.publikaciokSzama = publikaciokSzama;
    }

    public Oktato(String nev, String neptunkod, int eletkor, String intezet, String beosztas, int tantargyakSzama, double fizetes, int publikaciokSzama) {
        this.nev = nev;
        this.neptunkod = neptunkod;
        this.eletkor = eletkor;
        this.egyetem = "THE";
        this.intezet = intezet;
        this.beosztas = beosztas;
        this.tantargyakSzama = tantargyakSzama;
        this.fizetes = fizetes;
        this.publikaciokSzama = publikaciokSzama;
    }

    public void targyakSzamaEmel(int darabszam) {
        this.tantargyakSzama += darabszam;
    }
    public void targyakSzamaCsokkent(int darabszam) {
        this.tantargyakSzama -= darabszam;
    }
    public void fizetesEmel(double szazalek) {
        this.fizetes += this.fizetes*(szazalek/100);
    }

    public String kategoria() {
        if ((this.tantargyakSzama) + (this.publikaciokSzama*0.5) < 5) {
            return "Alap";
        }
        else if ((this.tantargyakSzama) + (this.publikaciokSzama*0.5) > 5 && (this.tantargyakSzama) + (this.publikaciokSzama*0.5) < 10) {
            return "Közép";
        }
        else if ((this.tantargyakSzama) + (this.publikaciokSzama*0.5) > 10) {
            return "Felső";
        }
        else {
            return "Nem megfelelő";
        }
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        if (!nev.isBlank()) {
            this.nev = nev;
        }
    }

    public String getNeptunkod() {
        return neptunkod;
    }

    public void setNeptunkod(String neptunkod) {
        if (!neptunkod.isBlank()) {
            this.neptunkod = neptunkod;
        }
    }

    public int getEletkor() {
        return eletkor;
    }

    public void setEletkor(int eletkor) {
        if (eletkor > 20 && eletkor < 100) {
            this.eletkor = eletkor;
        }
    }

    public String getEgyetem() {
        return egyetem;
    }

    public void setEgyetem(String egyetem) {
        if (!egyetem.isBlank()) {
            this.egyetem = egyetem;
        }
    }

    public String getIntezet() {
        return intezet;
    }

    public void setIntezet(String intezet) {
        if (!intezet.isBlank()) {
            this.intezet = intezet;
        }
    }

    public String getBeosztas() {
        return beosztas;
    }

    public void setBeosztas(String beosztas) {
        if (beosztas.equalsIgnoreCase("tanársegéd")
                || beosztas.equalsIgnoreCase("adjunktus")
                || beosztas.equalsIgnoreCase("docens")
                || beosztas.equalsIgnoreCase("egyetemi tanár")
                || beosztas.equalsIgnoreCase("mérnöktanár")
                || beosztas.equalsIgnoreCase("óraadó")
                || beosztas.equalsIgnoreCase("oktató")) {
            this.beosztas = beosztas;
        }
    }

    public int getTantargyakSzama() {
        return tantargyakSzama;
    }

    public void setTantargyakSzama(int tantargyakSzama) {
        if (tantargyakSzama >= 0) {
            this.tantargyakSzama = tantargyakSzama;
        }
    }

    public double getFizetes() {
        return fizetes;
    }

    public void setFizetes(double fizetes) {
        if (fizetes >= 0) {
            this.fizetes = fizetes;
        }
    }

    public int getPublikaciokSzama() {
        return publikaciokSzama;
    }

    public void setPublikaciokSzama(int publikaciokSzama) {
        if (publikaciokSzama >= 0) {
            this.publikaciokSzama = publikaciokSzama;
        }
    }

    @Override
    public String toString() {
        return "Oktato: " +
                "nev='" + nev + '\'' +
                ", neptunkod='" + neptunkod + '\'' +
                ", eletkor=" + eletkor +
                ", egyetem='" + egyetem + '\'' +
                ", intezet='" + intezet + '\'' +
                ", beosztas='" + beosztas + '\'' +
                ", tantargyakSzama=" + tantargyakSzama +
                ", fizetes=" + fizetes +
                ", publikaciokSzama=" + publikaciokSzama +
                '}';
    }
}
