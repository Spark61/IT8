package de.spark61;

import java.util.Scanner;

public class LiesZahlenMinimum {
    public static void main(final String[] args) {
        System.out.println(LiesZahlenMinimum.liesZahlen(3));
        System.out.println(LiesZahlenMinimum.liesZahlen(7));
    }

    private static int liesZahlen(final int x) {
        try (final Scanner scanner = new Scanner(System.in)) {
            int smallest = Integer.MAX_VALUE;
            int tempNumber;

            for (int i = 0; i < x; i++) {
                tempNumber = scanner.nextInt();
                if (tempNumber < smallest) smallest = tempNumber;
            }

            return smallest;
        }
    }
}
