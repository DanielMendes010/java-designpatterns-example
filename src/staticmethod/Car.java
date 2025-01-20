package staticmethod;

public class Car {
    private String name;

    private Car(String name) {
        this.name = name;
    }

    public static Car createCityCar(String name) {
        return name == null ? null : new Car(name);
    }
}
