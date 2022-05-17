package de.spark61;

import java.util.Scanner;

public class Zahlensumme {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int Anzahl = 0;
        int Summe = 0;
        int Zahl = scanner.nextInt();

        while (Zahl >= 0) {
            Summe += Zahl;
            Anzahl++;
            Zahl = scanner.nextInt();
        }

        System.out.println("Ergebnis: " + Anzahl + " " + Summe);
    }
}
