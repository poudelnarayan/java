// Using Encapsulation
public class EnhancedPlayer {
    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100)
            this.health = health;
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("Player Knocked out");
        }
    }
}

// whatever we do we have no chance of increasing the players health
