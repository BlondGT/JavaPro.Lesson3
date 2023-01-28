package main.Java;

import java.util.Scanner;
import java.lang.String;

public class Reverse {

    static Scanner scanner;

    public static void main(String[] args) {

        stringReverse();

    }
   public static void stringReverse() {

        scanner = new Scanner(System.in);
        System.out.println("Print a word: ");
        String str = scanner.next();
        String result = String.valueOf(new StringBuilder(str).reverse());
        System.out.println(result);
   }
}
