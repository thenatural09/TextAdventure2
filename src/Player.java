import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Troy on 9/14/16.
 */
public class Player {
    String name;
    String weapon;
    String location;
    ArrayList<String> items = new ArrayList<>();

    void chooseName() {
        System.out.println("What is your name?");
        name = Game.customLine();
        System.out.println("Welcome, " + name);
    }

    void chooseWeapon() {
        System.out.println("Do you want a sword or mace?");
        weapon = Game.customLine();

        if(weapon.equalsIgnoreCase("sword")) {
            System.out.println("Here's your sword");
        }
        else if(weapon.equalsIgnoreCase("mace")) {
            System.out.println("Here's your mace");
        }
        else {
            System.out.println("Weapon not recognized");
            chooseWeapon();
        }
    }

    void chooseLocation() {
        System.out.println("Would you like to go to the tunnel or forest?");
        location = Game.customLine();

        if(location.equalsIgnoreCase("tunnel")) {
            System.out.println("Entering tunnel...");
        }
        else if(location.equalsIgnoreCase("forest")) {
            System.out.println("Entering forest...");
        }
        else {
            //throw new Exception("Invalid weapon);
            System.out.println("Location not recognized");
            chooseLocation();
        }
    }

    void findItem(String item) {
        System.out.println("You find a " + item + "! Press y pick up");
        String answer = Game.customLine();
        if(answer.equalsIgnoreCase("y")) {
            items.add(item);
            System.out.println("You picked " + item + " up");
        }
    }
}
