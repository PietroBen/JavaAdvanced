package JavaAdvanced.OOP._2;

public class Car implements Movable{
    @Override
    public int moveForward() {
        return 5;
    }

    @Override
    public int moveBackward() {
        return 1;
    }
}
