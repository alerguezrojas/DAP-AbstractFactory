package factories;

import products.*;

public class ToGoDrinkwareFactory implements DrinkwareFactory {
    @Override
    public Cup createCup() {
        return new ToGoCup();
    }
    @Override
    public Lid createLid() {
        return new ToGoLid();
    }
}
