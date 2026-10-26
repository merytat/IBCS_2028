package Unit1;

import java.util.Scanner;

public class YouDo21 {
    static void main() {
        Scanner kb = new Scanner(System.in);
        System.out.print("6 word sentence: ");
        String sentence = kb.nextLine(); //6 words

        //1st separation
        int space1 = sentence.indexOf(" "); //find the first space
        String word1 = sentence.substring(0,space1); // separate the first word
        String rest1 = sentence.substring(space1+1); // separate the rest of the sentence

        //2nd separation
        int space2 = rest1.indexOf(" "); //find the second space! or the first on the text after removing the first word
        String word2 = rest1.substring(0,space2); // separate the second word
        String rest2 = rest1.substring(space2+1); // separate the rest of the sentence

        //3rd separation
        int space3 = rest2.indexOf(" "); //find the third space! or the first on the text after removing the first and second word
        String word3 = rest2.substring(0,space3); // separate the third word
        String rest3 = rest2.substring(space3+1); // separate the rest of the sentence

        //4th separation
        int space4 = rest3.indexOf(" "); //find the fourth space! or the first on the text after removing the first, second and third word
        String word4 = rest3.substring(0,space4); // separate the fourth word
        String rest4 = rest3.substring(space4+1); // separate the rest of the sentence

        //5th separation
        int space5 = rest4.indexOf(" "); //find the fifth space! or the first on the text after removing the first, second, third and fourth word
        String word5 = rest4.substring(0,space5); // separate the fifth word
        String word6 = rest4.substring(space5+1); // separate the rest of the sentence which will be the word 6

        //Output
        System.out.println("Without spaces: " + word1 + word2 + word3 + word4 + word5 + word6);


    }
}
