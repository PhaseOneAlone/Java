public class Admiral {
    private final Fleet fleet;

    public Admiral(Fleet fleet) {
        this.fleet = fleet;
    }

    public void fireAll() {
        fleet.shootAll();
    }

    public void fireAllCannonBall() {
        fleet.shootCannons();
    }

    public void fireAllSrapnel() {
        fleet.shootShrapnels();
    }

    public void fireAllFrigate() {
        fleet.fireFrigates();
    }

    public void fireAllCruiser() {
        fleet.fireCruisers();
    }

    public void fireAllBattleShips() {
        fleet.fireBattleships();
    }
}
