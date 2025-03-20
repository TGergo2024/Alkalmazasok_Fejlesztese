package org.example;

import java.util.Scanner;

public class Main {
    public static double minKeres(double[]tomb) {
        double min =tomb[0];
        for (int i = 1; i < tomb.length; i++) {
            if (tomb[i] < min) {
                min = tomb[i];
            }
        }
        return min;
    }
    public static double maxKeres(double[]tomb) {
        double max =tomb[0];
        for (int i = 1; i < tomb.length; i++) {
            if (tomb[i] > max) {
                max = tomb[i];
            }
        }
        return max;
    }
    public static double beolvasas(String szoveg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(szoveg);
        String sor = sc.nextLine();
        return Double.parseDouble(sor);
    }
    public static double[] ertekKozotti (double[]tomb, double ertek1, double ertek2) {
        double[] szurtTomb = new double[tomb.length];
        int index = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] >= ertek1 && tomb[i] <= ertek2) {
                szurtTomb[index] = tomb[i];
                index++;
            }
        }
        return szurtTomb;
    }
    public static double osszeg (double[] tomb) {
        double ossz = 0;
        for (int i = 0; i < tomb.length; i++) {
            ossz += tomb[i];
        }
        return ossz;
    }
    public static void main(String[] args) {

        int elemszam;
        elemszam = (int)beolvasas("Kérem a darabszámot!");
        double[] tomb = new double[elemszam];
        double osszeg = 0;
        for (int i = 1; i < elemszam; i++) {
            tomb[i] = beolvasas("Kérem az " +(i+1) + ". számot");
        }
        double ossz = osszeg(tomb);
        double min = minKeres(tomb);
        double max = maxKeres(tomb);
        double[] ertekKozott = ertekKozotti(tomb,0.4,0.5);
        double osszErtekKozott = osszeg(ertekKozott);

        System.out.println("Összeg: " + ossz);
        System.out.println("Minimum: "+ min);
        System.out.println("Maximum: "+ max);
        System.out.println("Megadott érték közötti számok darabja: " +ertekKozott.length);
        System.out.println("Megadott érték közötti számok összege: " +osszErtekKozott);

    }
}