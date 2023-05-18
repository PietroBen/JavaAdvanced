package JavaAdvanced.OOP._2;

public class Boat implements Movable{

    @Override
    public void moveForward() {
        System.out.println("The boat moves forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("The boat moves backward");
    }
}
