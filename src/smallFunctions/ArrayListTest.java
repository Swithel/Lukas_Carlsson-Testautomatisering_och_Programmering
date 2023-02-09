package smallFunctions;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        //Startar Scanner
        Scanner scan = new Scanner(System.in);
        //Skapar en ArrayList som heter animals
        ArrayList<String> animals = new ArrayList<String>();
        //Skapar en Array som
        String[] frogs = new String[9];

        //Använder klassen AnimalCollection och skickar värdet 2 till den. Får tillbaka animals[2]
        AnimalCollection collection = new AnimalCollection();
        System.out.println(collection.getAnimal(2));

        //Lägger till Hund och katt till animals
        animals.add("Hund");
        animals.add("Katt");

        //Lägger till värden med Scanner i animals tills användaren skriver in 'exit'
        String frog = scan.nextLine();
        while(!frog.equals("exit")) {
            animals.add("Kermit the Frog");
            frog = scan.nextLine();
        }

        frogs[0] = "Kermit the frog";
        frogs[1] = "FROGGER";

        /*for(int i = 0; i<frogs.length;i++){
            frogs[i] = scan.nextLine();
        } */
        //SKriver ut alla värden i animals
       for(int i = 0; i < animals.size(); i++) {
           System.out.println(animals.get(i));
       }
       //Skriver ut alla värden i frogs
        System.out.println();
        for(int i = 0; i < frogs.length; i++) {
            System.out.println(frogs[i]);
        }

    }
}
