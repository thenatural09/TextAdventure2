import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Troy on 9/14/16.
 */
public class Player extends Character{
    String weapon;
    String location;
    ArrayList<String> items = new ArrayList<>();

    public Player() {
        this.health = 20;
        this.damage = 20;
    }

    void chooseName() {
        System.out.println("What is your name?");
        name = Game.customLine();
        //System.out.println("Welcome, " + name);
        System.out.printf("Welcome %s\n", name);
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
        //System.out.println("You find a " + item + "! Press y pick up");
        System.out.printf("You find a %s! Press y to pick up\n", item);
        String answer = Game.customLine();
        if(answer.equalsIgnoreCase("y")) {
            items.add(item);
            //System.out.println("You picked " + item + " up");
            System.out.printf("You pick %s up\n", item);
        }
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }
}
