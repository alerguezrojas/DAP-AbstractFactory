package factories;

import products.Cup;
import products.Lid;

public interface DrinkwareFactory {
    Cup createCup();
    Lid createLid();
}
