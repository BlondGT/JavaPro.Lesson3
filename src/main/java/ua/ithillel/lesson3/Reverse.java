package ua.ithillel.lesson3;

import java.util.Scanner;
import java.lang.String;

public class Reverse {

    static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.println("Print a word: ");
        String input = scanner.next();
        System.out.println(stringReverse(input));
    }
   public static String stringReverse(String input) {


        return new StringBuilder(input).reverse().toString();

   }
}
