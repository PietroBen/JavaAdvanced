package JavaAdvanced.OOP._3;

public class Person {

    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name = "+ name +
                ", age = " + age +
                ", address = " + address +
                "}";
    }

    @Override
    public int hashCode() {
        return name.hashCode() +
                age +
                address.hashCode();
    }
}
