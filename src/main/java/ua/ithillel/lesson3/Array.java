package ua.ithillel.lesson3;

import java.lang.String;
import java.util.Random;
import java.util.Scanner;

public class Array {

    static Scanner scanner;
    static Random random;
    static String randomWord;

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        scanner = new Scanner(System.in);
        random = new Random();
        randomWord = words[random.nextInt(words.length)];

        System.out.println("Guess a word: ");
        String word = scanner.next().toLowerCase();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("###############");

        while (!randomWord.equals(word)) {
            checkChars(word, randomWord, stringBuilder);
            System.out.println(stringBuilder);
            System.out.println("Try again! ");
            word = scanner.next().toLowerCase();
        }
        System.out.println("Correct! You won!!!");
    }

    public static void checkChars(String word, String answer, StringBuilder tablo) {

        for(int i = 0; i < answer.length() && i < word.length(); i++) {
            if(word.charAt(i) == answer.charAt(i)) {
                tablo.setCharAt(i, word.charAt(i));
            }
        }
    }
}
