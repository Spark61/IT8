package de.spark61;

import java.util.Scanner;

public class Mittelwert0 {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int input = 1;
        int sum = 0;
        int count = 0;

        while (input != 0) {
            input = scanner.nextInt();

            if (input != 0) {
                count++;
                sum += input;
            }
        }

        System.out.println("Der Mittelwert der " + count + " Zahlen ist:" + sum / count);
    }
}
