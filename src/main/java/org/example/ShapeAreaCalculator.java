package org.example;


import java.util.ArrayList;
import java.util.List;

class GearBox {
    private int gear;


    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        if(gear > 5) {
            this.gear = 5;
        }
        if (gear < 0) {
            this.gear = 0;
        }
        this.gear = gear;
    }
}
class BmwEngine extends Engine {

}

class MercedesEngine extends Engine {

}
abstract class Car {
    Engine engine;

    GearBox gearBox;

    public Car(Engine engine, GearBox gearBox) {
        this.gearBox = gearBox;
        this.engine = engine;
    }

    public abstract void startEngine();

    public abstract void stopEngine();

    public void gearUp() {
        int newGear = this.gearBox.getGear() + 1;
        this.gearBox.setGear(newGear);
        System.out.println("Gear up to " + newGear);
    }

    public void gearDown() {
        int newGear = this.gearBox.getGear() - 1;
        this.gearBox.setGear(newGear);
        System.out.println("Gear down to " + newGear);
    }

}

abstract class Engine {

}


class Mercedes extends Car {

    private final String plateNumber;


    public Mercedes(String plateNumber) {
        super(new MercedesEngine(), new GearBox());

        this.plateNumber = plateNumber;
    }

    @Override
    public void startEngine() {
        System.out.println("Mercedes engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Mercedes engine stopped");
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "plateNumber='" + plateNumber + '\'' +
                '}';
    }
}

class BMW extends Car {

    private final String plateNumber;
    public BMW(String plateNumber) {
        super(new BmwEngine(), new GearBox());
        this.plateNumber = plateNumber;
    }

    @Override
    public void startEngine() {
        System.out.println("BMW engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("BMW engine stopped");
    }

    @Override
    public String toString() {
        return "BMW{" +
                "plateNumber='" + plateNumber + '\'' +
                '}';
    }
}



public class ShapeAreaCalculator {


    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new BMW("AZ001"));
        cars.add(new Mercedes("AZ002"));
        cars.add(new BMW("AZ003"));
        System.out.println("Found: " + cars.size());
        for (Car car : cars) {

            System.out.println(car);
        }
    }

}

