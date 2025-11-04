import factories.*;
import products.*;

public class Main {
    public static void main(String[] args) {
        // Cambia UNA línea para elegir la familia completa:
        DrinkwareFactory factory = new ToGoDrinkwareFactory();
        // DrinkwareFactory factory = new HomeDrinkwareFactory();

        Cup cup = factory.createCup();
        Lid lid = factory.createLid();

        cup.fill("café");
        lid.cover();
    }
}
