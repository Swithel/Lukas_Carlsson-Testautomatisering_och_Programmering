package smallFunctions;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> textToMorse = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        //Keys and Values
        textToMorse.put("A", "*-");
        textToMorse.put("B", "-***");
        textToMorse.put("C", "-*-*");
        textToMorse.put("D", "-**");
        textToMorse.put("E", "*");
        textToMorse.put("F", "**-*");
        textToMorse.put("G", "--*");
        textToMorse.put("H", "****");
        textToMorse.put("I", "**");
        textToMorse.put("J", "*---");
        textToMorse.put("K", "-*-");
        textToMorse.put("L", "*-**");
        textToMorse.put("M", "--");
        textToMorse.put("N", "-*");
        textToMorse.put("O", "---");
        textToMorse.put("P", "*--*");
        textToMorse.put("Q", "--*-");
        textToMorse.put("R", "*-*");

        boolean running = true;

        while (running) {
            String input = scan.nextLine();
            if (input == "STOP") {
                running = false;
            } else {
                String whatMorse = textToMorse.get(input);
                System.out.println(whatMorse);
            }

        }
    }
}
