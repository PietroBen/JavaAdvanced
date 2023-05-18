package JavaAdvanced.OOP._2;

public class Guitar extends Instrument{

    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("Rock'n'roll! Is played with "+ getBrand());
    }

}
