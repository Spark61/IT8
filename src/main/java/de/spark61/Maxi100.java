package de.spark61;

import java.util.Scanner;

public class Maxi100 {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int zahl;
        int ergebnis0 = 0;

        for (int i = 1; i <= 30; i++) {
            zahl = scanner.nextInt();

            if (zahl > 100) ergebnis0 += 1;
        }

        System.out.println("Anzahl der Zahlen größer 100 ist: " + ergebnis0);
    }
}
