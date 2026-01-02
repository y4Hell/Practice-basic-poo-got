public abstract class Character {
    protected Weapon weapon;
    protected String name;

    public Character(Weapon weapon, String name) {
        this.weapon = weapon;
        this.name = name;
    }

    // Permite cambiar el arma en tiempo de ejecución (parte clave del Strategy Pattern)
    public void changeWeapon(Weapon newWeapon) {
        System.out.println(name + " cambia su arma por un " + newWeapon.getClass().getSimpleName());
        this.weapon =  newWeapon;
    }

    public abstract void fight();
}

interface Weapon {
    void useWeapon();
}

interface Human {}
interface Giant {}

// === PERSONAJES HUMANOS ===
class Queen extends Character implements Human {
    public Queen(Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("The Queen " + name + " enters the battle!");
    }

    @Override
    public void fight() {
        System.out.println("The Queen " + name + " attacks without mercy!");
        weapon.useWeapon();
    }
}

class King extends Character implements Human {
    public King(Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("The King " + name + " enters the battle!");
    }

    @Override
    public void fight() {
        System.out.println("The King " + name + " thinks of a tactic...");
        weapon.useWeapon();
    }
}

class Knight extends Character implements Human {
    public Knight(Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("The Knight " + name + " enters the battlefield!");
    }

    @Override
    public void fight() {
        System.out.println("The Knight " + name + " starts fighting!");
        weapon.useWeapon();
    }
}

// === PERSONAJES GIGANTES ===
class Troll extends Character implements Giant {
    public Troll(Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("The Troll " + name + " enters the battle!");
    }

    @Override
    public void fight() {
        System.out.println("The Troll " + name + " is smashing everything!");
        weapon.useWeapon();
    }
}

class Dragon extends Character implements Giant {
    public Dragon(Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("The Dragon " + name + " soars into the battle!");
    }

    @Override
    public void fight() {
        System.out.println("The Dragon " + name + " flies over the battlefield and spits fire on everyone!");
        weapon.useWeapon();
    }
}

// === ARMAS ===
class Sword implements Weapon {
    public Sword() {
        System.out.println("A sword has been forged!");
    }

    @Override
    public void useWeapon() {
        System.out.println("→ Attacks with the sword, delivering a powerful slash!");
    }
}

class Axe implements Weapon {
    public Axe() {
        System.out.println("A mighty axe has been created!");
    }

    @Override
    public void useWeapon() {
        System.out.println("→ Swings the powerful axe!");
    }
}

class Knife implements Weapon {
    public Knife() {
        System.out.println("A forgotten knife has been found...");
    }

    @Override
    public void useWeapon() {
        System.out.println("→ Stabs quickly with the knife!");
    }
}

class BowAndArrow implements Weapon {
    public BowAndArrow() {
        System.out.println("A bow and arrows are ready!");
    }

    @Override
    public void useWeapon() {
        System.out.println("→ Shoots an arrow from the bow!");
    }
}
