package org.example;

import java.util.ArrayList;

public class Tantargy {

    private String targyNev;
    private String targyKod;
    private int kredit;
    private ArrayList<Hallgato> hallgatokListaja;

    public void hallgatoHozzaad(Hallgato hallgato) {
        if (!hallgatokListaja.contains(hallgato)) {
            hallgatokListaja.add(hallgato);
        }
    }

    public void hallgatokListazasa() {
        System.out.println(targyNev + " tantárgy hallgatói:");
        for (Hallgato h : hallgatokListaja) {
            System.out.println("- " + h.getNev());
        }
    }

    public Tantargy(String targyNev, String targyKod, int kredit) {
        this.targyNev = targyNev;
        this.targyKod = targyKod;
        this.kredit = kredit;
        this.hallgatokListaja = new ArrayList<>();
    }

    public String getTargyNev() {
        return targyNev;
    }

    public void setTargyNev(String targyNev) {
        this.targyNev = targyNev;
    }

    public String getTargyKod() {
        return targyKod;
    }

    public void setTargyKod(String targyKod) {
        this.targyKod = targyKod;
    }

    public int getKredit() {
        return kredit;
    }

    public void setKredit(int kredit) {
        this.kredit = kredit;
    }

    public ArrayList<Hallgato> getHallgatokListaja() {
        return hallgatokListaja;
    }

    public void setHallgatokListaja(ArrayList<Hallgato> hallgatokListaja) {
        this.hallgatokListaja = hallgatokListaja;
    }
}

