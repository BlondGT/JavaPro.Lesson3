package ua.ithillel.lesson3;

import java.lang.String;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("razor"));
    }

    public static boolean isPalindrome(String input) {

       StringBuilder str = new StringBuilder(input);
       str.reverse();
       String data = str.toString();
        return input.equals(data);
    }
}
