import ship.*;

import java.util.List;
import java.util.stream.Stream;

public class Fleet {
    private  List<ShrapnelShootingShip> shrapnelShootingShips;
    private  List<CannonShootingShip> cannonShootingShips;

    public Fleet(List<ShrapnelShootingShip> shrapnelShootingShips, List<CannonShootingShip> cannonShootingShips) {
        this.shrapnelShootingShips = shrapnelShootingShips;
        this.cannonShootingShips = cannonShootingShips;
    }

    public void shootAll() {
        shootShrapnels();
        shootCannons();
    }

    public void shootShrapnels() {
        shrapnelShootingShips.forEach(ShrapnelShootingShip::shootShrapnel);
    }

    public void shootCannons() {
        cannonShootingShips.forEach(CannonShootingShip::shootCannon);
    }

    public void fireFrigates() {
        Stream.concat(
                        cannonShootingShips.stream(),
                        shrapnelShootingShips.stream()
                ).filter(Frigate.class::isInstance)
                .map(Frigate.class::cast)
                .forEach(Frigate::shootCannon);
    }

    public void fireCruisers() {
        Stream.concat(
                        cannonShootingShips.stream(),
                        shrapnelShootingShips.stream()
                ).filter(Cruiser.class::isInstance)
                .map(Cruiser.class::cast)
                .forEach(Cruiser::shootShrapnel);
    }

    public void fireBattleships() {
        Stream.concat(
                        cannonShootingShips.stream(),
                        shrapnelShootingShips.stream()
                ).filter(Battleship.class::isInstance)
                .map(Battleship.class::cast)
                .forEach(battleship -> {
                    battleship.shootCannon();
                    battleship.shootShrapnel();
                });
    }

    public void addShrapnelShootingShip(ShrapnelShootingShip shrapnelShootingShip) {
        shrapnelShootingShips.add(shrapnelShootingShip);
    }

    public void addCannonShootingShip(CannonShootingShip cannonShootingShip) {
        cannonShootingShips.add(cannonShootingShip);
    }

}
