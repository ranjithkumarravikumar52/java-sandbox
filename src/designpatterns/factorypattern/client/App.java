package designpatterns.factorypattern.client;

import designpatterns.factorypattern.vehiclefactory.VehicleFactory;
import designpatterns.factorypattern.vehiclefactory.VehicleType;
import designpatterns.factorypattern.vehicles.Vehicle;

public class App {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
//        Vehicle vehicle = vehicleFactory.getVehicle("CAR");
//        vehicle.startEngine();
//
//        vehicle = vehicleFactory.getVehicle("ELECTRIC");
//        vehicle.startEngine();
        Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.CAR);
        vehicle.startEngine();

    }
}