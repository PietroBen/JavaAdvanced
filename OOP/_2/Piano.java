package JavaAdvanced.OOP._2;

public class Piano extends Instrument {
    public Piano(String name, String brand) {
        super(name, brand);
    }
    @Override
    public void play() {
        System.out.println("River flow in you played with " + getBrand());
    }
}
