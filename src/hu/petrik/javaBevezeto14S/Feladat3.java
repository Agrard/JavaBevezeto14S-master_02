package hu.petrik.javaBevezeto14S;

import java.util.Scanner;

public class Feladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem, adjon meg egy valós, pozitív számot:");
        double valos = sc.nextDouble();

        System.out.println("A szám a(z) " + Math.round(Math.floor(valos)) + "és a(z) " + Math.round(Math.ceil(valos)) + " között van, és a " + Math.round(valos) + " számhoz van közelebb.");

    }
}
