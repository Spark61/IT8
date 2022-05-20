package de.spark61;

public class MusterBeispiel {
    public static void main(final String[] args) {
        MusterBeispiel.printstars(5, 1);
        MusterBeispiel.printstars(4, 3);
        MusterBeispiel.printstars(3, 5);
        MusterBeispiel.printstars(2, 7);
        MusterBeispiel.printstars(5, 1);
    }

    private static void printstars(final int zahl1, final int zahl2) {
        System.out.print(" ".repeat(zahl1) + "*".repeat(zahl2));
        System.out.println(" ");
    }
}
