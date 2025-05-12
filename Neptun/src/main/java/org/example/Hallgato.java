package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Hallgato extends Szemely{

    private String neptunKod;
    private boolean aktivE;
    private ArrayList<Tantargy> felvettTargyak;
    private int kreditekSzama;
    private final int MAX_KREDIT = 30;

    public boolean targyFelvetel (Tantargy tantargy) {
        if (kreditekSzama + tantargy.getKredit() < MAX_KREDIT) {
            felvettTargyak.add(tantargy);
            kreditekSzama += tantargy.getKredit();
            tantargy.hallgatoHozzaad(this);
            return true;
        }
        return false;
    }

    public void vizsgaJelentkezes(Vizsga vizsga) {
        if (aktivE && felvettTargyak.contains(vizsga.getTantargy())) {
            vizsga.hallgatoHozzaad(this);
        }
    }

    public void adatokMegjelenitese() {
        System.out.println("Hallgató neve: " + getNev());
        System.out.println("Neptunkód: " + neptunKod);
        System.out.println("Státusz: " + (aktivE ? "Aktív" : "Inaktív"));
        System.out.println("Kreditek száma: " + kreditekSzama);
        System.out.println("Regisztrált tantárgyak:");
        for (Tantargy t : felvettTargyak) {
            System.out.println("- " + t.getTargyNev());
        }
    }

    public Hallgato(String nev, String szemIgSzam, String lakcim, Date szulDatum, String neptunKod, boolean aktivE, ArrayList<Tantargy> felvettTargyak, int kreditekSzama) {
        super(nev, szemIgSzam, lakcim, szulDatum);
        this.neptunKod = neptunKod;
        this.aktivE = aktivE;
        this.felvettTargyak = felvettTargyak;
        this.kreditekSzama = kreditekSzama;
    }

    public String getNeptunKod() {
        return neptunKod;
    }

    public void setNeptunKod(String neptunKod) {
        this.neptunKod = neptunKod;
    }

    public boolean isAktivE() {
        return aktivE;
    }

    public void setAktivE(boolean aktivE) {
        this.aktivE = aktivE;
    }

    public ArrayList<Tantargy> getFelvettTargyak() {
        return felvettTargyak;
    }

    public void setFelvettTargyak(ArrayList<Tantargy> felvettTargyak) {
        this.felvettTargyak = felvettTargyak;
    }

    public int getKreditekSzama() {
        return kreditekSzama;
    }

    public void setKreditekSzama(int kreditekSzama) {
        this.kreditekSzama = kreditekSzama;
    }

    public int getMAX_KREDIT() {
        return MAX_KREDIT;
    }

    public void setStatusz(boolean ujStatusz) {
        this.aktivE = ujStatusz;
    }

}
