package hu.petrik.javaBevezeto14S;

public class Feladat17 {
    public static void main(String[] args) {
        double[] tomb1  = new double[1];
        double[] tomb2  = new double[1];

        for (int i = 0; i < tomb1.length; i++) {
            tomb1[i] = Math.random() * 100 - 50;
            System.out.print("Első tömb: " + tomb1[i]);

        }

        for (int i = 0; i < tomb2.length; i++){
            tomb2[i] = Math.random() * 100 - 50;
            System.out.print("\nMásodik tömb: " + tomb2[i]);
        }

        double[] tomb3 = new double[1];

        for (int i = 0; i < tomb3.length; i++){
            tomb3[i] = tomb1[i] + tomb2[i];
            System.out.print("\nHarmadik tömb: " + tomb3[i] + ", ");
        }
    }
}
