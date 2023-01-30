package ua.ithillel.lesson3;

import java.lang.String;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("radar"));
    }

    public static boolean isPalindrome(String input) {

        int i = input.length() - 1;
        int j = 0;

        return input.charAt(i) == input.charAt(j);
    }
}
