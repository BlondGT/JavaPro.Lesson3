package main.Java;

import java.lang.String;
import java.util.Scanner;

public class Word {

    public static void main(String[] args) {

        findWordPosition();
    }

    private static void findWordPosition() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Print source word: ");
        String str = scanner.next();
        System.out.println("Print target word: ");
        String str1 = scanner.next();
        System.out.println(str.indexOf(String.valueOf(str.contains(str1))));
    }
}
