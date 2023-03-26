package ship;

import weapon.Shrapnel;
import weapon.Weapon;

import java.util.List;

public class Cruiser implements ShrapnelShootingShip {
    private final String name;
    private final List<Shrapnel> shrapnels;

    public Cruiser(String name, List<Shrapnel> shrapnels) {
        this.name = name;
        this.shrapnels = shrapnels;
    }

    @Override
    public void printName() {
        System.out.println("My name is " + name);
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
