public class Main {
    public static void main(String[] args){
        Boss boss = new Boss();
        boss.setBossHealth(1000);
        boss.setBossDamage(50);
        boss.setBossWeakness("None");

        System.out.println("Boss Information:");
        System.out.println("Health: " + boss.getBossHealth());
        System.out.println("Damage: " + boss.getBossDamage());
        System.out.println("Weakness: " + boss.getBossWeakness());

        Hero[] heroes = createHeroes();

        for (Hero hero : heroes) {
            System.out.println(" ");
            System.out.println("Names: " + hero.getNames());
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Ability: " + hero.getAbilities());
        }
    }

    public static Hero[] createHeroes() {
        Hero warrior = new Hero("Warrior", 300, 30);
        Hero mage = new Hero("Mage", 200, 50, "Ice Meteor");
        Hero archer = new Hero("Archer", 250, 40, "Sniper Hit");

        Hero[] heroes = {warrior, mage, archer};
        return heroes;
    }
}