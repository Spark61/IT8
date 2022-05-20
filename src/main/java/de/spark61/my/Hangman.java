package de.spark61.my;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Hangman {
    private static final List<String> WORDS = Arrays.asList("test", "test3", "lol");
    private static final int MAX_TRIES = 4;

    public static void main(final String[] args) {
        new Hangman();
    }

    private final String word;
    private boolean started;
    private final List<String> successTries;
    private final List<String> badTries;

    public Hangman() {
        this.word = this.getRandomWord();
        this.successTries = new ArrayList<>();
        this.badTries = new ArrayList<>(Hangman.MAX_TRIES);
        this.start();
    }

    private String getRandomWord() {
        return Hangman.WORDS.get(ThreadLocalRandom.current().nextInt(0, Hangman.WORDS.size() - 1))
                .toLowerCase(Locale.ROOT);
    }

    private void start() {
        this.started = true;
        final Scanner scanner = new Scanner(System.in);
        String input;

        while (this.started) {
            this.printConsole();
            input = scanner.next().toLowerCase(Locale.ROOT);

            if (this.successTries.contains(input) || this.badTries.contains(input)) continue;//TODO error?

            if (input.length() == 1 && this.word.contains(input)) {
                this.successTries.add(input);
                continue;
            }

            if (input.equals(this.word)) {
                this.finish(true);
                continue;
            }

            this.badTries.add(input);

            this.checkEnd();
        }
    }

    private void printConsole() {
        System.out.println("Wort: " + this.word);

        final String output = Arrays.stream(this.word.split(""))
                .map(s -> this.successTries.contains(s) ? s : "_")
                .collect(Collectors.joining());

        System.out.println(output);
    }

    private void finish(final boolean success) {
        this.started = false;

        if (success) System.out.println("Gewonnen!");
        else System.out.println("Verloren!");
    }

    private void checkEnd() {
        if (this.badTries.size() == Hangman.MAX_TRIES) this.finish(false);
        else if (this.successTries.size() == this.word.length()) this.finish(true);
    }

}
