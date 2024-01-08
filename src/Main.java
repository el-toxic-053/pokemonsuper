class Pokemon {

    private String name;

    private int level;

    private int xp;

    public Pokemon(String name, int level, int xp){
        this.name = name;
        this.level = level;
        this.xp = xp;
    }

    public void attack() {
        System.out.println(name + "used a basic attack!");

    }

    public void xpUp(){
        xp++;
        int oldXp = xp;
        int earnXp = 2540;
        int result = oldXp + earnXp;
        System.out.println(name + " get " + earnXp + " the old xp was " + oldXp + " the new xp is " + result + "!");
    }

    public String getName(){
        return name;
    }

    public int getLevel(){
        return level;
    }

    public int getXp(){
        return xp;
    }

    public void setXp(){
        this.xp = xp;
    }

}

class FirePokemon extends Pokemon {

    private String specialAbility;

    public FirePokemon(String name, int level, int xp, String specialAbility) {
        super(name, level, xp);
        this.specialAbility = specialAbility;
    }

    @Override
    public void attack() {
        System.out.println(getName() + "used Ember!" );
    }

    // getters and setters
    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }
}

class WaterPokemon extends Pokemon {
    private String waterAttack;

    public WaterPokemon(String name, int level, int xp, String waterAttack){
        super(name, level, xp);
        this.waterAttack = waterAttack;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " used Hydro Blast!");
    }

    // getters and setters
    public String getWaterAttack() {
        return waterAttack;
    }

    public void setWaterAttack(String waterAttack) {
        this.waterAttack = waterAttack;
    }
}
class GrassPokemon extends Pokemon{

    private String grassAttack;

    public GrassPokemon(String name, int level, int xp, String grassAttack){
        super(name,level, xp);
        this.grassAttack = grassAttack;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " used Vine Whip!");
    }

    // getters and setters
    public String getGrassAttack() {
        return grassAttack;
    }

    public void setGrassAttack(String grassAttack) {
        this.grassAttack = grassAttack;
    }
}

class ElectricPokemon extends Pokemon {
    private String electricAttack;

    public ElectricPokemon(String name, int level, int xp, String electricAttack) {
        super(name, level, xp);
        this.electricAttack = electricAttack;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " used Thunderbolt!");
    }

    // getters and setters
    public String getElectricAttack() {
        return electricAttack;
    }

    public void setElectricAttack(String electricAttack) {
        this.electricAttack = electricAttack;
    }
}

public class Main {

    public static void main(String[] args) {

        Pokemon pikachu = new ElectricPokemon("Pikachu", 10, 100, "Thunderbolt");
        Pokemon charmander = new FirePokemon("Charmander", 5, 80, "Fire Spin");
        Pokemon squirtle = new WaterPokemon("Squirtle", 8, 90, "Water Gun");
        Pokemon bulbasaur = new GrassPokemon("Bulbasaur", 7, 85, "Vine Whip");

        pikachu.attack();
        charmander.xpUp();
        squirtle.attack();
        bulbasaur.xpUp();
    }
}