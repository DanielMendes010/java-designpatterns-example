package staticmethod;

public class CarCreationDemo {
    public static void main(String[] args) {
        Car car = Car.createCityCar("Honda");
        System.out.println(car);
    }
}
