package aspa.intership.dr.patterns.factory.app;

import aspa.intership.dr.patterns.factory.transport.Car;
import aspa.intership.dr.patterns.factory.transport.Motorcycle;

public class FactoryMain {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        System.out.println(car.createVehicle());
        System.out.println(motorcycle.createVehicle());
    }
}
