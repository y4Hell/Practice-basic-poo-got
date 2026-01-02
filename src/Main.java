public class Main {
    public static void main(String[] args) {
        System.out.println("=== THE BATTLE BEGINS ===\n");

        Character robert = new King(new Axe(), "Robert Baratheon");
        robert.fight();

        Character jon = new Knight(new Sword(), "Jon Snow");
        jon.fight();

        Character margaery = new Queen(new Knife(), "Margaery Tyrell");
        margaery.fight();

        Character cersei = new Queen(new Axe(), "Cersei Lannister");
        cersei.fight();
        cersei.changeWeapon(new Knife());  // Demostrando el cambio de arma
        cersei.fight();

        Character viserion = new Dragon(new BowAndArrow(), "Viserion");
        viserion.fight();

        System.out.println("\n=== THE BATTLE CONTINUES... ===");
    }
}