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
        if (!nev.isBlank()) {
            this.nev = nev;
        }
        else {
            System.exit(111);
        }
        if ((!neptunkod.isBlank()) && (neptunkod.length() == 6)) {
            this.neptunkod = neptunkod;
        }
        else {
            System.exit(111);
        }
        if (eletkor > 18 && eletkor < 80) {
            this.eletkor = eletkor;
        }

        else {
            System.exit(111);
        }
        if (!egyetem.isBlank()) {
            this.egyetem = egyetem;
        }
        else {
            System.exit(111);
        }
        if (!intezet.isBlank()) {
            this.intezet = intezet;
        }
        else {
            System.exit(111);
        }
        if (beosztas.equalsIgnoreCase("tanársegéd")
                || beosztas.trim().equalsIgnoreCase("adjunktus")
                || beosztas.trim().equalsIgnoreCase("docens")
                || beosztas.trim().equalsIgnoreCase("egyetemi tanár")
                || beosztas.trim().equalsIgnoreCase("mérnöktanár")
                || beosztas.trim().equalsIgnoreCase("óraadó")
                || beosztas.trim().equalsIgnoreCase("oktató")) {
            this.beosztas = beosztas;
        }
        else {
            System.exit(111);
        }
        if (tantargyakSzama > 1) {
            this.tantargyakSzama = tantargyakSzama;
        }
        else {
            System.exit(111);
        }
        if (fizetes > 100000) {
            this.fizetes = fizetes;
        }
        else {
            System.exit(111);
        }
        if (publikaciokSzama > 1) {
            this.publikaciokSzama = publikaciokSzama;
        }
        else {
            System.exit(111);
        }
    }

    public Oktato(String nev, String neptunkod, int eletkor, String intezet, String beosztas, int tantargyakSzama, double fizetes, int publikaciokSzama) {
        if (!nev.isBlank()) {
            this.nev = nev;
        }
        else {
            System.exit(111);
        }
        if ((!neptunkod.isBlank()) && (neptunkod.length() == 6)) {
            this.neptunkod = neptunkod;
        }
        else {
            System.exit(111);
        }
        if (eletkor > 18 && eletkor < 80) {
            this.eletkor = eletkor;
        }

        else {
            System.exit(111);
        }
        if (!intezet.isBlank()) {
            this.intezet = intezet;
        }
        else {
            System.exit(111);
        }
        if (beosztas.equalsIgnoreCase("tanársegéd")
                || beosztas.trim().equalsIgnoreCase("adjunktus")
                || beosztas.trim().equalsIgnoreCase("docens")
                || beosztas.trim().equalsIgnoreCase("egyetemi tanár")
                || beosztas.trim().equalsIgnoreCase("mérnöktanár")
                || beosztas.trim().equalsIgnoreCase("óraadó")
                || beosztas.trim().equalsIgnoreCase("oktató")) {
            this.beosztas = beosztas;
        }
        else {
            System.exit(111);
        }
        if (tantargyakSzama > 1) {
            this.tantargyakSzama = tantargyakSzama;
        }
        else {
            System.exit(111);
        }
        if (fizetes > 100000) {
            this.fizetes = fizetes;
        }
        else {
            System.exit(111);
        }
        if (publikaciokSzama > 1) {
            this.publikaciokSzama = publikaciokSzama;
        }
        else {
            System.exit(111);
        }
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
        if (eletkor > 18 && eletkor < 100) {
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
                || beosztas.trim().equalsIgnoreCase("adjunktus")
                || beosztas.trim().equalsIgnoreCase("docens")
                || beosztas.trim().equalsIgnoreCase("egyetemi tanár")
                || beosztas.trim().equalsIgnoreCase("mérnöktanár")
                || beosztas.trim().equalsIgnoreCase("óraadó")
                || beosztas.trim().equalsIgnoreCase("oktató")) {
            this.beosztas = beosztas;
        }
    }

    public int getTantargyakSzama() {
        return tantargyakSzama;
    }

    public void setTantargyakSzama(int tantargyakSzama) {
        if (tantargyakSzama >= 1) {
            this.tantargyakSzama = tantargyakSzama;
        }
    }

    public double getFizetes() {
        return fizetes;
    }

    public void setFizetes(double fizetes) {
        if (fizetes >= 100000) {
            this.fizetes = fizetes;
        }
    }

    public int getPublikaciokSzama() {
        return publikaciokSzama;
    }

    public void setPublikaciokSzama(int publikaciokSzama) {
        if (publikaciokSzama >= 1) {
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
