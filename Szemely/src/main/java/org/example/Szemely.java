package org.example;

public class Szemely {

    private String nev;
    private int eletkor;
    private double fizetes;
    private String lakcim;
    private int gyerekek_szama;

    public Szemely(String nev, int eletkor, double fizetes, String lakcim, int gyerekek_szama) {
        this.nev = nev;
        this.eletkor = eletkor;
        this.fizetes = fizetes;
        this.lakcim = lakcim;
        this.gyerekek_szama = gyerekek_szama;
    }

    public Szemely(String nev, int eletkor, String lakcim, int gyerekek_szama) {
        this.nev = nev;
        this.eletkor = eletkor;
        this.fizetes = 0;
        this.lakcim = lakcim;
        this.gyerekek_szama = gyerekek_szama;
    }

    public boolean tanuloE () {
        if (this.fizetes == 0) {
            return true;
        }
        return false;
    }

    public String fizetesKategoria() {
        if (this.fizetes == 0) {
            return "Tanuló";
        }
        else if (this.fizetes >= 0 && this.fizetes <= 300) {
            return "Alap";
        }
        else if (this.fizetes >= 300 && this.fizetes <= 500) {
            return "Közép";
        }
        else if (this.fizetes >= 500) {
            return "Prémium";
        }
        return "Nem megfelelő fizetés";
    }

    public void fizetesEmel (double szazalek) {
        this.fizetes += this.fizetes*(szazalek/100) ;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        if (!nev.isBlank()) {
            this.nev = nev;
        }

    }

    public int getEletkor() {
        return eletkor;
    }

    public void setEletkor(int eletkor) {
        if (eletkor != 0) {
            this.eletkor = eletkor;
        }
    }

    public double getFizetes() {
        return fizetes;
    }

    public void setFizetes(int fizetes) {
        if (fizetes >= 0) {
            this.fizetes = fizetes;
        }
    }

    public String getLakcim() {
        return lakcim;
    }

    public void setLakcim(String lakcim) {
        if (!lakcim.isBlank()) {
            this.lakcim = lakcim;
        }
    }

    public int getGyerekek_szama() {
        return gyerekek_szama;
    }

    public void setGyerekek_szama(int gyerekek_szama) {
        if (gyerekek_szama >= 0 && gyerekek_szama    <= 10) {
            this.gyerekek_szama = gyerekek_szama;
        }
    }

    @Override
    public String toString() {
        return "Szemely: " + "nev='" + nev + '\'' + ", eletkor=" + eletkor + ", fizetes=" + fizetes + ", lakcim='" + lakcim + '\'' + ", gyerekek_szama=" + gyerekek_szama;
    }
}
