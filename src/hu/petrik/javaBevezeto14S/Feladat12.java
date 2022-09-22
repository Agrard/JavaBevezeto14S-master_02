package hu.petrik.javaBevezeto14S;

import java.util.Scanner;

public class Feladat12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem, adjon meg egy számot 1 és 1000 között:");
        int osszeg = sc.nextInt();
        int kettoszazas = 0;
        int szazas = 0;
        int otvenes = 0;
        int huszas = 0;
        int tizes = 0;
        int otos = 0;

        if (osszeg > 1000 || osszeg < 1){
            System.out.println("A megadott érték nem megfelelő!");

        } else {
            while (osszeg>=200){
                osszeg-=200;
                kettoszazas++;
            }
            while (osszeg>=100){
                osszeg-=100;
                szazas++;
            }
            while (osszeg>=50){
                osszeg-=50;
                otvenes++;
            }
            while (osszeg>=20){
                osszeg-=20;
                huszas++;
            }
            while (osszeg>=10){
                osszeg-=10;
                tizes++;
            }
            while (osszeg>=5){
                osszeg-=5;
                otos++;
            }
            System.out.println("A pénz érmékre lebontva: 200ft-os: " + kettoszazas + "db, 100ft-os:" + szazas + "db, 50ft-os:" + otvenes + "db, 20ft-os: " + huszas + "db, 10ft-os: " + tizes + "db, 5ft-os: " + otos + "db.");
        }


    }
}

