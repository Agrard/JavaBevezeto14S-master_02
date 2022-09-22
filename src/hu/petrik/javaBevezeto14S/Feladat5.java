package hu.petrik.javaBevezeto14S;

import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem adja meg a téglalap 'a' oldalát (cm): ");
        double a = Double.parseDouble(sc.nextLine().replace(',', '.'));

        System.out.print("Kérem adja meg a téglalap 'b' oldalát (cm): ");
        double b = Double.parseDouble(sc.nextLine().replace(',', '.'));

        System.out.print("Kérem adja meg az elvégzendő műveletet (K - Kerület, T - Terület): ");
        String muvelet = sc.nextLine();

        if (muvelet.equals("K")){
            double kerulet = 2 * (a + b);
            System.out.printf("A téglalap kerülete: %.2f cm", kerulet);
        }
        else if (muvelet.equals("T")){
            double terulet  = a * b;

            System.out.printf("A Területe kerülete: %.2f cm^2", terulet);
        }
        else{
            System.out.println("Rossz műveletet adott meg!");
        }

        if (a == b){
            System.out.println("\nEz egy négyzet!");
        }

    }
}
