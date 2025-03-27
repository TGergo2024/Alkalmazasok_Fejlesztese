package org.example;

public class Main {
    public static void main(String[] args) {

        Szemely sz1 = new Szemely("Nev1", 12, 0, "lakcim1", 0);
        Szemely sz2 = new Szemely("Nev2", 40, 500, "lakcim2", 2);
        Szemely sz3 = new Szemely("Nev3", 25, 550, "lakcim3", 0);
        Szemely sz4 = new Szemely("Nev4", 20, "lakcim", 0);
        System.out.println(sz1);
        System.out.println(sz2);
        System.out.println(sz3);
        System.out.println(sz4);
        System.out.println("-----------------------------------------------------");
        System.out.println("Tanuló függvény hívása");
        System.out.println(sz1.tanuloE());
        System.out.println(sz2.tanuloE());
        System.out.println(sz3.tanuloE());
        System.out.println(sz4.tanuloE());
        System.out.println("Fizetés kategória függvény hívása");
        System.out.println(sz1.fizetesKategoria());
        System.out.println(sz2.fizetesKategoria());
        System.out.println(sz3.fizetesKategoria());
        System.out.println(sz4.fizetesKategoria());
        sz1.fizetesEmel(10);
        sz2.fizetesEmel(12.5);
        sz3.fizetesEmel(5.7);
        sz4.fizetesEmel(15);
        System.out.println("-----------------------------------------------------");
        System.out.println("Fizetés emelés után");
        System.out.println(sz1);
        System.out.println(sz2);
        System.out.println(sz3);
        System.out.println(sz4);

    }
}