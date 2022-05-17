package de.spark61;

import java.util.Scanner;

public class ScannerAufgabe {
    private static final String EXIT_VALUE = "q";

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String eingabe = "";

        while (!eingabe.equals(ScannerAufgabe.EXIT_VALUE)) {
            eingabe = scanner.next();
            System.out.println(eingabe);
        }
    }
}
