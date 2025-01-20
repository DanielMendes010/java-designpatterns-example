package creationpatterns.builder.builders;

import creationpatterns.builder.cars.CarType;
import creationpatterns.builder.components.Engine;
import creationpatterns.builder.components.GPSNavigator;
import creationpatterns.builder.components.Transmission;
import creationpatterns.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
