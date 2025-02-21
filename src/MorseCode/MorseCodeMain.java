package MorseCode;

import java.util.Scanner;

public class MorseCodeMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MorseCodeTranslator translator = new MorseCodeTranslator();

        System.out.print("Skriv in den morsekod eller text som du vill översätta: ");
        String input = scan.nextLine();

        // Översätter Morsekod --> Text
        if (input.contains(".") || input.contains("-")) {
            System.out.println("Översatt text: " + translator.translateToText(input));
        } else {
            // Översätter Text --> Morsekod
            System.out.println("Morsekod: " + translator.translateToMorse(input));
        }
    }
}


