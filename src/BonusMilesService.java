public class BonusMilesService {
    public int calculate(int price) {
        int oneMile = 20;
        int amount = price / oneMile;

        return amount;
    }
}
