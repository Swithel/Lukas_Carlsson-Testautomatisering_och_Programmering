package morseTranslator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logic myInput = new Logic();
        boolean running = true;



        while(running) {
            System.out.println("Vill du översätta MORSE eller ENGELSKA?");
            String input = scan.nextLine();
            String inputUpper = input.toUpperCase();
            if (inputUpper.equals("ENGELSKA")) {
                running = false;
                System.out.println("Skriv något som ska översättas till Morse:");
                myInput.translateEnglish(scan.nextLine());
            } else if (inputUpper.equals("MORSE")) {
                running = false;
                System.out.println("Skriv något på Morse som ska översättas till Engelska:");
                myInput.translateMorse(scan.nextLine());
            } else {
                System.out.println("Fel val.");
            }
        }
    }
}
