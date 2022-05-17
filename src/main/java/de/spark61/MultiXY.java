package de.spark61;

import java.util.Scanner;

public class MultiXY {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int number1 = scanner.nextInt();
        final int number2 = scanner.nextInt();
        final int product = number1 * number2;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println("Das Produkt: " + number1 + " * " + number2 + " ist " + product);
    }
}