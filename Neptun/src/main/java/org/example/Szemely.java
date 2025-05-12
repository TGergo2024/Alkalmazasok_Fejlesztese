package org.example;

import java.util.Date;

public abstract class Szemely {

    private String nev;
    private String szemIgSzam;
    private String lakcim;
    private Date szulDatum;



    public Szemely(String nev, String szemIgSzam, String lakcim, Date szulDatum) {
        this.nev = nev;
        this.szemIgSzam = szemIgSzam;
        this.lakcim = lakcim;
        this.szulDatum = szulDatum;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getSzemIgSzam() {
        return szemIgSzam;
    }

    public void setSzemIgSzam(String szemIgSzam) {
        this.szemIgSzam = szemIgSzam;
    }

    public String getLakcim() {
        return lakcim;
    }

    public void setLakcim(String lakcim) {
        this.lakcim = lakcim;
    }

    public Date getSzulDatum() {
        return szulDatum;
    }

    public void setSzulDatum(Date szulDatum) {
        this.szulDatum = szulDatum;
    }

    public abstract void adatokMegjelenitese();

}
