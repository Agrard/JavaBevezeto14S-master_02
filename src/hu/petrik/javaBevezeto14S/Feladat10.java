package hu.petrik.javaBevezeto14S;

import java.util.Scanner;

public class Feladat10 {
    public static void main(String[] args) {
        int osszeg = 0;
        int paros = 0;
        int paratlan = 0;

        while (osszeg <= 100){
            Scanner sc = new Scanner(System.in);
            System.out.print("Kérem adjon egy számot: ");
            int szam = sc.nextInt();

            osszeg += szam;

            if (osszeg % 2 == 0){
                paros += 1;
            }
            else{
                paratlan += 1;
            }
        }

        System.out.printf("Az összeg meghaladta a 100-at!\nAz összeg: %s", osszeg);
        System.out.printf("\nEzek közül %d volt páros, és %d volt páratlan", paros, paratlan);
    }
}
