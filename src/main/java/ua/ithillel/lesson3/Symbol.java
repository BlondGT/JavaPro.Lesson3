package ua.ithillel.lesson3;

import java.lang.String;

public class Symbol {

    public static void main (String[] args) {

        System.out.println(findSymbolOccurrence("people", 'w'));
    }

    public static int findSymbolOccurrence(String input, char s) {

        int number = 0;
        for (int c = 0; c < input.length(); c++) {
            if (input.charAt(c) == s) {
                number++;
            }
        }
        return number;
    }
}