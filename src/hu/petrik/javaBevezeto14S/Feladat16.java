package hu.petrik.javaBevezeto14S;

import java.util.Random;
import java.util.Scanner;

public class Feladat16 {
    public static void main(String[] args) {
        int[] tomb = new int[5];

        Scanner sc = new Scanner(System.in);



        int i = 0;
        while (i != 5) {
            System.out.print("Kérem adja meg a tömb elemeit: ");
            tomb[i] = sc.nextInt();
            i += 1;
        }

        System.out.print("A tömb elemei: ");
        for (int j = 0; j < tomb.length; j++) {
            System.out.print(tomb[j] + ", ");
        }



    }
}
