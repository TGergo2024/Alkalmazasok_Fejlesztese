package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Hallgato hallgato1 = new Hallgato("Kiss Péter", "123456", "Budapest", new Date(2000-4-20), "ISHW48", true, new ArrayList<>(), 10);
        Hallgato hallgato2 = new Hallgato("Nagy Anna", "654321", "Debrecen", new Date(1999-1-23), "A92KL5", true, new ArrayList<>(), 0);

        Oktato oktato = new Oktato("Dr. Szabó János", "987654", "Szeged", new Date(1970-10-5), "LE23O6", new ArrayList<>(), "Egyetemi Docens", "Természettudományi tanszék");

        Admin admin = new Admin("Admin Erika", "111222", "Pécs", new Date(1989-1-5), "Státusz módosítás, jegybeírás");

        Tantargy prog1 = new Tantargy("Programozás I", "BMEVIAUAB01", 5);
        Tantargy adatb1 = new Tantargy("Adatbázisok I", "BMEVIAUAB02", 4);

        Vizsga prog1Vizsga = new Vizsga(prog1, "2023-12-15 10:00", new ArrayList<>());

        oktato.tantargyHozzaad(prog1);
        oktato.tantargyHozzaad(adatb1);

        hallgato1.targyFelvetel(prog1);
        hallgato1.targyFelvetel(adatb1);
        hallgato2.targyFelvetel(prog1);

        hallgato1.vizsgaJelentkezes(prog1Vizsga);
        hallgato2.vizsgaJelentkezes(prog1Vizsga);

        admin.hallgatoStatusztModosit(hallgato2, false);

        prog1Vizsga.jegyRogzites(hallgato1, 5);

        System.out.println("\n--- Hallgató adatok ---");
        hallgato1.adatokMegjelenitese();
        System.out.println("\n--- Oktató adatok ---");
        oktato.adatokMegjelenitese();
        System.out.println("\n--- Admin adatok ---");
        admin.adatokMegjelenitese();
        System.out.println("\n--- Tantárgy hallgatói ---");
        prog1.hallgatokListazasa();
    }
}