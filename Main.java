package Farm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cow Cow1 = new Cow("C1", 120, 3);
        Cow Cow2 = new Cow("C2", 150, 5);
        Cow Cow3 = new Cow("C3", 500, 4);

        Cow1.display();
        Goat Goat1 = new Goat("G1", 150, 3);
        Goat1.display();

        List<Animals> ListAnimal = new ArrayList<>();
        ListAnimal.add(Cow1);
        ListAnimal.add(Cow2);
        ListAnimal.add(Cow3);
        ListAnimal.add(Goat1);

        System.out.println("List Animals: " + ListAnimal);
    }
}
