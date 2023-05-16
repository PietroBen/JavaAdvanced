package JavaAdvanced.OOP._1;

class Animal {
    private static double height;
    private static double weight;

    public Animal(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public static double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
