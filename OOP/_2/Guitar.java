package JavaAdvanced.OOP._2;

public class Guitar extends Instrument implements Playable {

    @Override
    public String play() {
        return "Rock'n'roll!";
    }

}
