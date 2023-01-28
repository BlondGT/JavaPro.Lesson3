package main.Java;

import java.util.Scanner;
import java.lang.String;

public class Symbol {

    static Scanner scanner;
    static String symbol;

    public static void main (String[] args) {

        findSymbolOccurrence();
    }

    private static void findSymbolOccurrence() {
        scanner = new Scanner(System.in);
        System.out.println("Print a word: ");
        String str1 = scanner.next();
        System.out.println("Print a letter: ");
        symbol = scanner.next();
        int number = 1;
        for (int c = 0; c < str1.length(); c++) {
            if (str1.charAt(c) == 'o') {
                System.out.print((str1.charAt(c)));
                System.out.println(number);
                number++;
            }
        }
    }
}