package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Oktato extends Szemely{

    private String neptunKod;
    private ArrayList<Tantargy> tanitottTargyak;
    private String beosztas;
    private String intezet;

    public void tantargyHozzaad(Tantargy tantargy) {
        tanitottTargyak.add(tantargy);
    }

    @Override
    public void adatokMegjelenitese() {
        System.out.println("Oktató neve: " + getNev());
        System.out.println("Intézet: " + intezet);
        System.out.println("Beosztás: " + beosztas);
        System.out.println("Oktatott tantárgyak:");
        for (Tantargy t : tanitottTargyak) {
            System.out.println("- " + t.getTargyNev());
        }
    }

    public Oktato(String nev, String szemIgSzam, String lakcim, Date szulDatum, String neptunKod, ArrayList<Tantargy> tanitottTargyak, String beosztas, String intezet) {
        super(nev, szemIgSzam, lakcim, szulDatum);
        this.neptunKod = neptunKod;
        this.tanitottTargyak = tanitottTargyak;
        this.beosztas = beosztas;
        this.intezet = intezet;
    }

    public String getNeptunKod() {
        return neptunKod;
    }

    public void setNeptunKod(String neptunKod) {
        this.neptunKod = neptunKod;
    }

    public ArrayList<Tantargy> getTanitottTargyak() {
        return tanitottTargyak;
    }

    public void setTanitottTargyak(ArrayList<Tantargy> tanitottTargyak) {
        this.tanitottTargyak = tanitottTargyak;
    }

    public String getBeosztas() {
        return beosztas;
    }

    public void setBeosztas(String beosztas) {
        this.beosztas = beosztas;
    }

    public String getIntezet() {
        return intezet;
    }

    public void setIntezet(String intezet) {
        this.intezet = intezet;
    }
}
