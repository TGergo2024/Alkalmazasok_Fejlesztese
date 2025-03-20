package org.example;

public class Main {
    public static void main(String[] args) {

        int szamokDB = 100;
        int db = 0;
        int randomSzam;

        for (int i = 0; i < szamokDB; i++) {
            randomSzam = (int)(Math.random()*100)+1;

            if (randomSzam <=10) {
                System.out.println("Kisebb egyenlő mint 10: "+ randomSzam);
                db++;
            }
        }

        System.out.println("A darabszám: " + db);

    }
}