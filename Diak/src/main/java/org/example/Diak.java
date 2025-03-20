package org.example;

public class Diak {
    private String nev;
    private String neptunKod;
    private int eletkor;
    private int koltseg;
    private String egyetem;

    public Diak(String nev, String neptunKod, int eletkor, int koltseg, String egyetem) {
        super();
        this.nev = nev;
        this.neptunKod = neptunKod;
        this.eletkor = eletkor;
        this.koltseg = koltseg;
        this.egyetem = egyetem;
    }

    public Diak(String nev, String neptunKod, int eletkor, int koltseg) {
        super();
        this.nev = nev;
        this.neptunKod = neptunKod;
        this.eletkor = eletkor;
        this.koltseg = koltseg;
        this.egyetem = "THE";
    }

    public String getTanrend() {
        if (this.eletkor>30) {
            return "Levelező";
        }
        else return "Nappali";
    }

    public void koltsegEmel(int ertek) {
        this.koltseg += ertek;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getNeptunKod() {
        return neptunKod;
    }

    public void setNeptunKod(String neptunKod) {
        this.neptunKod = neptunKod;
    }

    public int getEletkor() {
        return eletkor;
    }

    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }

    public int getKoltseg() {
        return koltseg;
    }

    public void setKoltseg(int koltseg) {
        this.koltseg = koltseg;
    }

    public String getEgyetem() {
        return egyetem;
    }

    public void setEgyetem(String egyetem) {
        this.egyetem = egyetem;
    }

    @Override
    public String toString() {
        return "Diak{" +
                "nev='" + nev + '\'' +
                ", neptunKod='" + neptunKod + '\'' +
                ", eletkor=" + eletkor +
                ", koltseg=" + koltseg +
                ", egyetem='" + egyetem + '\'' +
                '}';
    }
}
