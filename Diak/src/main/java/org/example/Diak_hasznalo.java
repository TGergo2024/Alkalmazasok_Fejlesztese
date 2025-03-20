package org.example;

public class Diak_hasznalo {

    public static void main(String[] args) {

        Diak d1 = new Diak("Nev1", "NK122", 25, 120000, "egyetem1");
        Diak d2 = new Diak("Nev2", "NK7878", 40, 200000, "egyetem2");
        Diak d3 = new Diak("Név3", "NK78454", 22, 200000);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        d1.koltsegEmel(50000);
        d2.koltsegEmel(100000);
        d3.setNev("Ujnev3");

        System.out.println("-------------------------------------------");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}