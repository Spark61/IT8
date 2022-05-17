package de.spark61;

import java.util.Scanner;

public class Mittel10 {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int tempSumme = 0;
        int zahl;
        float mittelwert;

        for (int zaehler = 1; zaehler <= 10; zaehler++) {
            zahl = scanner.nextInt();
            tempSumme += zahl;
            mittelwert = (float) tempSumme / zaehler;
            System.out.println("Mittelwert ist " + mittelwert);
        }

    }
}
