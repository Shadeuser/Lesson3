package pck1;

import java.util.Scanner;
import java.io.*;

public class Main {

    //Задание 2
    static String[] words = {"apple", "orange", "lemon", "banana", "apricot",
            "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango",
            "mushroom", "nut", "olive", "pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};
    public static void main(String[] args) {
        int pos = (int)(Math.random() * words.length - 1);
        String guessedWord = words[pos];
        String inWord ="";
        Scanner sc = new Scanner(System.in);
        while (true) {
            String newWord = "";
            System.out.println("Угадайте слово");
            inWord = sc.nextLine();
            for (int i = 0; i <= guessedWord.length() - 1; i++) {
                if (guessedWord.length()-1 >= i && inWord.length()-1 >= i) {
                    if (guessedWord.charAt(i) == inWord.charAt(i)) {
                        newWord += guessedWord.charAt(i);
                    } else {
                        newWord += "#";
                    }
                }
            }
            if (inWord.equals(guessedWord)) {
                System.out.println("Вы угадали слово, это слово " + guessedWord);
                break;
            } else {
                for (int i = newWord.length(); i <= 14; i++) {
                    newWord += "#";
                }
                System.out.println(newWord);
            }

        }

    }
}
