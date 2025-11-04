package products;

public class HomeMug implements Cup {
    @Override
    public void fill(String beverage) {
        System.out.println("Llenando taza de cerámica con " + beverage);
    }
}
