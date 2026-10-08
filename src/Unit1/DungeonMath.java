package Unit1;

import java.util.Scanner;

public class DungeonMath {
    static void main() {
        //Coins conversion
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter total copper coins: ");
        int coins = kb.nextInt();
        int gold = coins / 1000;
        int silver = coins % 1000 / 100;
        int bronze = coins % 100 / 10;
        int cooper = coins % 10; //ones digit
        System.out.println("Gold Bars: " + gold);
        System.out.println("Silver coins: " + silver);
        System.out.println("Bronze coins: " + bronze);
        System.out.println("Loose copper: " + cooper);
        System.out.println(); //empty line

        //Gems calculations
        System.out.print("Enter gem weight in carats: ");
        double weight = kb.nextDouble();
        System.out.println("Truncated weight: " + (int)weight + " carats");
        System.out.println("Rounded weight: " + Math.round(weight * 100) / 100.0);

        // Vault code



    }
}
