package de.spark61;

public class MethodenBeispiel {
    public static void main(final String[] args) {
        MethodenBeispiel.zeigQuadrat(3);
        MethodenBeispiel.zeigQuadrat(25);
        MethodenBeispiel.zeigQuadrat(7890);

        System.out.println(MethodenBeispiel.rechneQuadrat(7));
        System.out.println(MethodenBeispiel.rechneQuadrat(25));
        System.out.println(MethodenBeispiel.rechneQuadrat(47890));
    }

    private static void zeigQuadrat(final long width) {
        System.out.println(width * width);
    }

    private static long rechneQuadrat(final long width) {
        return width * width;
    }
}
