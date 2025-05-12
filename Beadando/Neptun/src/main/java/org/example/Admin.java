package org.example;

import java.util.Date;

public class Admin extends Szemely{

    private String jogok;

    public void hallgatoStatusztModosit(Hallgato hallgato, boolean ujStatusz) {
        hallgato.setStatusz(ujStatusz);
    }
    @Override
    public void adatokMegjelenitese() {
        System.out.println("Adminisztrátor neve:" + getNev());
        System.out.println("Jogosultságok: " + jogok);
    }

    public Admin(String nev, String szemIgSzam, String lakcim, Date szulDatum, String jogok) {
        super(nev, szemIgSzam, lakcim, szulDatum);
        this.jogok = jogok;
    }

    public String getJogok() {
        return jogok;
    }

    public void setJogok(String jogok) {
        this.jogok = jogok;
    }
}
