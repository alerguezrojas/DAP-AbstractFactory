package products;

public class ToGoCup implements Cup {
    @Override
    public void fill(String beverage) {
        System.out.println("Llenando vaso desechable con " + beverage);
    }
}
