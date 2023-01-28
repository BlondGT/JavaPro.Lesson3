package main.Java;

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

        int hintCharacter = 2;
        while (!randomWord.equals(word)) {
            StringBuilder stringBuilder = new StringBuilder(randomWord.substring(0,hintCharacter));
            System.out.println(stringBuilder.append("###############"));
            System.out.println("Try again! ");
            word = scanner.next().toLowerCase();
            if (hintCharacter + 2 <= randomWord.length()) {
                hintCharacter += 2;
            }
        }

        System.out.println("Correct! You won!!!");
    }
}
