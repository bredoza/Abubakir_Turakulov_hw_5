public class Hero {
    private String names;
    private int health;
    private int damage;
    private String abilities;

    public Hero(String names, int health, int damage, String abilities) {
        this.names = names;
        this.health = health;
        this.damage = damage;
        this.abilities = abilities;
    }
    public Hero(String names, int health, int damage) {
        this.names = names;
        this.health = health;
        this.damage = damage;
    }

    public String getNames() {
        return names;
    }
    public int getHealth() {
        return health;
    }
    public int getDamage() {
        return damage;
    }
    public String getAbilities() {
        return abilities;
    }
}