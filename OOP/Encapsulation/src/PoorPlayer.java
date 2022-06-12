// Without Encapsulation ( bad practice of creating class)
public class PoorPlayer {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("Player Knocked out");
        }
    }

    public  int getHealth() {
        return  health;
    }
}

// Players health can be increased by external methods
