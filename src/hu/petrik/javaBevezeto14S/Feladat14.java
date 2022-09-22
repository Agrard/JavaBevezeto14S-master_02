package hu.petrik.javaBevezeto14S;

import java.util.Locale;
import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem adjon meg egy szöveget: ");

        String szoveg = sc.nextLine();


/**
 switch(valasztas){
 case"a":
 System.out.println(szoveg.toUpperCase());
 break;
 case"b":
 System.out.println(szoveg.toLowerCase());
 break;
 case"c":
 System.out.printf("A szöveg hossza %d karakter", szoveg.length());
 break;
 case"d":
 System.out.print("Kérem adja meg a másik szöveget: ");

 String masikSzoveg = sc.nextLine();
 break;
 case"e":
 System.out.println(szoveg.toUpperCase());
 break;
 case"f":
 System.out.println(szoveg.toUpperCase());
 break;
 default:
 System.out.println("Ilyen menüpont nem létezik!");
 break;
 }
 */
        String valasztas = "";

        while (!valasztas.equals("f")) {

            System.out.print("Mit szeretne csinálni a szöveggel? " +
                    "\n(a - nagybetűs)" +
                    "\n(b - kisbetűs)" +
                    "\n(c - lekérdezi a hosszát)" +
                    "\n(d - Összehasonlítani egy másik stringel)" +
                    "\n(e - Egy részét kiiratni a Stringnek)" +
                    "\n(f - kilépés)\n" +
                    "Választás: ");

            valasztas = sc.nextLine().toLowerCase();

            if (valasztas.equals("a")) {
                System.out.println(szoveg.toUpperCase());
            } else if (valasztas.equals("b")) {
                System.out.println(szoveg.toLowerCase());
            } else if (valasztas.equals("c")) {
                System.out.println(szoveg.length() + " Karakter");
            } else if (valasztas.equals("d")) {
                System.out.println("Kérem adjon meg egy szöveget megint: ");

                String szoveg2 = sc.nextLine();
                if (szoveg.length() > szoveg2.length()) {
                    System.out.println("Az első szöveg hosszabb mint a második szöveg");
                } else if (szoveg.length() < szoveg2.length()) {
                    System.out.println("A második szöveg hosszab mint az első");
                } else {
                    System.out.println("A két szöveg hossza egyenlő!");
                }
            } else if (valasztas.equals("e")) {
                System.out.print("Mettől meddig irassa ki a szöveget?: ");

                System.out.println("\nMettől: ");
                int mettol = sc.nextInt();
                System.out.println("Meddig: ");
                int meddig = sc.nextInt();

                System.out.println(szoveg.substring(mettol, meddig));

            } else if (valasztas.equals("f")) {
                System.out.println("Kilépés");
            } else {
                System.out.println("Nincs ilyen opció!");
            }
        }
    }
}
