// Abstract class
abstract class Vehicle {
    // Abstract method (does not have a body)
    abstract void start();

    // Concrete method (has a body)
    void stop() {
        System.out.println("Vehicle is stopping.");
    }
}

// Concrete class that extends the abstract class
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with a key.");
    }
}

// Another concrete class
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with a kick.");
    }
}

// Main class
public class Abstraction {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myCar.stop();

        myBike.start();
        myBike.stop();
    }
}
