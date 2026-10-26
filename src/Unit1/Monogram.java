package Unit1;

import java.util.Scanner;

public class Monogram {
    static void main() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Full name: ");
        String name = kb.nextLine();

        // get the first letter of the name
        String monogram = name.substring(0,1);

        // get the first letter of middle name
        // find the space
        int firstSpace = name.indexOf(" "); // 4
        monogram += name.substring(firstSpace + 1, firstSpace + 2);

        // get the first letter of the last name
        // find the second space - substring starting at the middle name
        String secondThird = name.substring(firstSpace + 1);
        int secondSpace = secondThird.indexOf(" "); // 4
        monogram += secondThird.substring(secondSpace + 1, secondSpace + 2);

        System.out.println(monogram);

    }
}
