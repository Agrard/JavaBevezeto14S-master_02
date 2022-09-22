package hu.petrik.javaBevezeto14S;

import java.util.Scanner;

public class Feladat6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem, adja meg, hogy hány pontot ért el a 100-ból: ");
        int pontszam = sc.nextInt();
        if (pontszam < 43){
            System.out.println("Elégtelen");

        }
        else if (pontszam > 42 && pontszam < 58){
            System.out.println("Elégséges");
        }
        else if (pontszam > 57 && pontszam < 73) {
            System.out.println("Közepes");
        }
        else if (pontszam > 72 && pontszam < 88){
            System.out.println("Jó");
        }
        else{
            System.out.println("Jeles");
        }
    }
}