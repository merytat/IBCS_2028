package Unit1;

import java.util.Scanner;

public class Voting {
    static void main() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = kb.nextInt();

        if (age >= 18) {  //if statement with one way selection
            // rest of the program happens
            System.out.print("Are you voting in Sofia: 1. Yes 2. No");
            int inSofia = kb.nextInt();

            //if statement 2-way selection
            if (inSofia == 2){
                System.out.println("Please go to the city center to vote");
            }
            else{
                //rest the program happens
                System.out.println("Select your residence area: ");
                System.out.println("1. West area");
                System.out.println("2. East area");
                System.out.println("3. South area");
                System.out.println("4. North area");
                int area = kb.nextInt();
                if (area == 1){
                    System.out.println("Go to west school to vote");
                }
                else if (area == 2){
                    System.out.println("Go to the east school to vote");
                }
                else if (area == 3){
                    System.out.println("Go to the South school to vote");
                }
                else if (area == 4){
                    System.out.println("Go to the north school to vote");
                }
                else {
                    System.out.println("Invalid option.  Go to the city center to vote");
                }
            }
        }

        System.out.println("End of program.  Thanks");

    }
}
