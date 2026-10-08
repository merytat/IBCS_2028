package Unit1;
import java.util.Scanner;
import java.util.*;

public class Futbol {
    static void main() {
        Scanner kb = new Scanner(System.in); //one Scanner ib is enough



        System.out.print("Wins: ");
        int wins = kb.nextInt();

        System.out.print("Draws: ");
        int draws = kb.nextInt();

        System.out.print("Losses: ");
        int losses = kb.nextInt();

        System.out.println("Enter team name: ");
        kb.nextLine(); //catch the previous enter
        String team = kb.nextLine();

        int points = (wins * 3) + draws;
        System.out.println("Total points: " + points);



    }
}
