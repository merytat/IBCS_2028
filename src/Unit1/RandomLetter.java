package Unit1;

import java.util.Scanner;

public class RandomLetter {
    static void main() {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        int max = word.length() - 1;
        int randomIndex = (int) (Math.random() * (max + 1));
        // charAt: gives me a type char by adding "" converting ot a String
        String randomLetter = word.charAt(randomIndex) + "";
        // substring
        String randomLetter2 = word.substring(randomIndex, randomIndex+1);
        System.out.println("Random letter: " + randomLetter);

        //middle letter
        int middleIndex = word.length() / 2;
        String middleLetter = word.charAt(middleIndex) + "";

        boolean same = middleLetter == randomLetter;
        System.out.println("Same letter: " + same);

    }
}
