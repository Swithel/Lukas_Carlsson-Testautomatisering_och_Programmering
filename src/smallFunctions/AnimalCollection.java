package smallFunctions;

import java.util.ArrayList;

public class AnimalCollection {

    ArrayList<String> animals;

    public AnimalCollection() {
        animals = new ArrayList<>();
        animals.add("Häst");
        animals.add("Hund");
        animals.add("Gris");
    }

//Skapar en metod som tar emot ett int värde och skickar tillbaka innehållet i ArrayList som har det värdet.
    public String getAnimal(int index) {
        return animals.get(index);
    }
}
