package factories;

import products.*;

public class HomeDrinkwareFactory implements DrinkwareFactory {
    @Override
    public Cup createCup() {
        return new HomeMug();
    }
    @Override
    public Lid createLid() {
        return new HomeCoaster();
    }
}
