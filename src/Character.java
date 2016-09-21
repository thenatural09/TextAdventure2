/**
 * Created by Troy on 9/20/16.
 */
public class Character {
    String name;
    int health;
    int damage;

    void battle(Character enemy) {
        System.out.printf("A wild %s appears\n",enemy.name);
        while (this.health > 0 && enemy.health > 0) {
            this.health -= enemy.damage;
            enemy.health -= this.damage;
            System.out.printf("%s's health: %s\n",this.name, this.health);
            System.out.printf("%s's health: %s\n", enemy.name, enemy.health);
        }
        if(this.health <= 0) {
            System.out.printf("%s has died\n",name);
        }

        if(enemy.health <= 0) {
            System.out.printf("%s has died\n",enemy.name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    //    public Character() {
//
//    }
//
//    public Character(String name, int health, int damage) {
//        this.name = name;
//        this.health = health;
//        this.damage = damage;
//    } This didn't work......
}
