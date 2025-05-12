package org.example;

import java.util.ArrayList;

public class Vizsga {

    private Tantargy tantargy;
    private String idopont;
    private ArrayList<Hallgato> jelentkezettHallgatok;
    public void hallgatoHozzaad(Hallgato hallgato) {
        if (!jelentkezettHallgatok.contains(hallgato)) {
            jelentkezettHallgatok.add(hallgato);
            System.out.println(hallgato.getNev() + " sikeresen jelentkezett a vizsgára.");
        }
    }

    public void jegyRogzites(Hallgato hallgato, int jegy) {
        if (jelentkezettHallgatok.contains(hallgato)) {
            System.out.println(hallgato.getNev() + " vizsgája rögzítve. Jegy: " + jegy);
        }
    }

    public Vizsga(Tantargy tantargy, String idopont, ArrayList<Hallgato> jelentkezettHallgatok) {
        this.tantargy = tantargy;
        this.idopont = idopont;
        this.jelentkezettHallgatok = jelentkezettHallgatok;
    }

    public Tantargy getTantargy() {
        return tantargy;
    }
    public String getIdopont() {
        return idopont;
    }


}
