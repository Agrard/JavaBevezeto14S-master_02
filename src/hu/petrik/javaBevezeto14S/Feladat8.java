package hu.petrik.javaBevezeto14S;

import java.util.Scanner;

public class Feladat8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Fej vagy írás? (0 - fej || 1 - írás): ");
        int tipp = sc.nextInt();

        int gepdobas = (int)(Math.random() * 2);

        /*
        Egész szám generálása 'min' és 'max' között:
        ((int)Math.random() * (max - min + 1) + min)*/

        System.out.printf("A dobás eredménye: %s", gepdobas == 0 ? "fej" : "írás");


        if (tipp == gepdobas){
            System.out.println("\nGratulálok");
        }
        else{
            System.out.println("\nNem sikerült!, Játszon újra!");
        }


    }
}
