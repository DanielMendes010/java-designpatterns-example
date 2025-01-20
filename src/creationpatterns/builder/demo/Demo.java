package creationpatterns.builder.demo;

import creationpatterns.builder.builders.CarBuilder;
import creationpatterns.builder.builders.CarManualBuilder;
import creationpatterns.builder.cars.Car;
import creationpatterns.builder.cars.Manual;
import creationpatterns.builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.construcSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.construcSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
