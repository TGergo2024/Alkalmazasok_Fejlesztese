package org.example;

public class Main {
    public static void main(String[] args) {

        Oktato o1 = new Oktato("Nev1", "BLCL2O", 9, "egyetem", "intezet", "adjunktus", 10, 100, 5);

        System.out.println(o1);
        o1.fizetesEmel(10);
        o1.setTantargyakSzama(1);
        System.out.println(o1.kategoria());

    }
}