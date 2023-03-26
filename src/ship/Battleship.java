package ship;

import weapon.Cannon;
import weapon.Shrapnel;

import java.util.List;

public class Battleship implements CannonShootingShip, ShrapnelShootingShip {
    private final String name;
    private final List<Shrapnel> shrapnels;
    private final List<Cannon> cannons;

    public Battleship(String name, List<Shrapnel> shrapnels, List<Cannon> cannons) {
        this.name = name;
        this.shrapnels = shrapnels;
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
    }

    @Override
    public void shootShrapnel() {
        printName();
        long amountOfShrapnels = shrapnels.size();
        System.out.println("Amount of shrapnels: " + amountOfShrapnels);

        shrapnels.forEach(Shrapnel::shoot);
        System.out.println("---");
    }
}
