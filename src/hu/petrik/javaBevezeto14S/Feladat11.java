package hu.petrik.javaBevezeto14S;

import java.util.Scanner;

public class Feladat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem, adjon meg egy pozitív, egész számot: ");
        int szam = sc.nextInt();
        int osszeg = 0;

        int i = 0;
        while(i<=szam){
            if (i%2 != 0){
                osszeg+=i;
            }
            i++;
        }
        System.out.println("A páratlan számok összege: " + osszeg);
    }
}
