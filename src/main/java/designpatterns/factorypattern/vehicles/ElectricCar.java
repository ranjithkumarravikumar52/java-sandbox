package designpatterns.factorypattern.vehicles;

public class ElectricCar implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Started Electric car engine");
    }
}
