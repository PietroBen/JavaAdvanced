package JavaAdvanced.JavaInProduction._1;

public record Person(String name, int age, String address) {
    @Override
    public String toString() {
        return name + " " + age + " " + address;
    }
}
