package ship;

import weapon.Cannon;
import weapon.Weapon;

import java.util.List;

public class Frigate implements CannonShootingShip {
    private final String name;

    private final List<Cannon> cannons;

    public Frigate(String name, List<Cannon> cannons) {
        this.name = name;
        this.cannons = cannons;
    }

    @Override
    public void printName() {
        System.out.println("My name is " + name);
    }

    @Override
    public void shootCannon() {
        printName();
        long amountOfCannons = cannons.size();
        System.out.println("Amount of cannons: " + amountOfCannons);

        cannons.forEach(Cannon::shoot);
        System.out.println("---");
    }
}
