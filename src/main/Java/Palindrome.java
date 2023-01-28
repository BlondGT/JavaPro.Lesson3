package main.Java;

import java.lang.String;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        isPalindrome();
    }
    private static void isPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print a word: ");
        String str = scanner.next();
        if (isPalindrome(str)) {
            System.out.println("Palindrome");
            } else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0, j = str.length() - 1;
             i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
