import ship.*;
import weapon.Cannon;
import weapon.Shrapnel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shrapnel> shrapnels = createShrapnels();
        List<Cannon> cannons = createCannons();

        List<ShrapnelShootingShip> shrapnelShootingShips = createShrapnelShootingShips(shrapnels, cannons);
        List<CannonShootingShip> cannonShootingShips = createCannonShootingShips(shrapnels, cannons);

        Fleet fleet = new Fleet(shrapnelShootingShips, cannonShootingShips);
        CannonShootingShip frigate = new Frigate("Frigate2", cannons);
        ShrapnelShootingShip cruiser = new Cruiser("Cruiser2", shrapnels);
        CannonShootingShip battleship = new Battleship("Battleship3", shrapnels, cannons);
        fleet.addCannonShootingShip(frigate);
        fleet.addShrapnelShootingShip(cruiser);
        fleet.addCannonShootingShip(battleship);
        Admiral admiral = new Admiral(fleet);

        admiral.fireAll();
        System.out.println("|||");
        admiral.fireAllBattleShips();
        System.out.println("|||");
        admiral.fireAllCannonBall();
        System.out.println("|||");
    }

    private static List<Shrapnel> createShrapnels() {
        Shrapnel shrapnel1 = new Shrapnel();
        Shrapnel shrapnel2 = new Shrapnel();
        return List.of(shrapnel1, shrapnel2);
    }

    private static List<Cannon> createCannons() {
        Cannon cannon1 = new Cannon();
        Cannon cannon2 = new Cannon();
        return List.of(cannon1, cannon2);
    }

    private static List<ShrapnelShootingShip> createShrapnelShootingShips(List<Shrapnel> shrapnels, List<Cannon> cannons) {
        ShrapnelShootingShip cruiser = new Cruiser("Cruiser-1", shrapnels);
        ShrapnelShootingShip battleship = new Battleship("Battleship-1", shrapnels, cannons);
        return List.of(cruiser, battleship);
    }

    private static List<CannonShootingShip> createCannonShootingShips(List<Shrapnel> shrapnels, List<Cannon> cannons) {
        CannonShootingShip frigate = new Frigate("Frigate-1", cannons);
        CannonShootingShip battleship = new Battleship("Battleship-2", shrapnels, cannons);
        return List.of(frigate, battleship);
    }
}




