package ua.ithillel.lesson3;

import java.lang.String;

public class Word {

    public static void main(String[] args) {

        System.out.println(findWordPosition("Apollo","pollo"));
    }

    public static int findWordPosition(String input, String str) {

       return input.indexOf(str);
    }
}
