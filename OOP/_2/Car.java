package JavaAdvanced.OOP._2;

public class Car implements Movable{
    @Override
    public void moveForward() {
        System.out.println("The car moves forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("The car moves backward");
    }
}
