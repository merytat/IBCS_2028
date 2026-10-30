package Unit1;

import java.util.Scanner;

public class WeDo7 {
    static void main() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter rating:");
        int rating = kb.nextInt();

        boolean isHigh = rating > 3; //rating >= 4
        boolean isMedium = (rating <= 3) && (rating > 1); //
        boolean isLow = rating <= 1; // rating < 2
        boolean isHighWithText = "Four".equals("four");

        System.out.println("It is " + isHigh + " that the rating is 4 or above");
        System.out.println("It is " + isMedium + " that the rating is greater or equals than 2 or equals than 3");
        System.out.println("It is " + isLow + " that the rating is below 2" );


    }
}
