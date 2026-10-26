package Unit1;

import java.util.Scanner;

public class YouDo18 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an out: ");
        String out = input.nextLine();
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        String result = out.substring(0,2) + word + out.substring(2,4);
        System.out.println(result);
    }
}
