package Static_Property;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Vin Fast", "VF6");
        System.out.println("number one: " + car1.getName() + " " + car1.getEngine() + " " + Car.numberOfCars);
        Car car2 = new Car("Vin Fast new", "VF8");
        car2.setName("alo");
        car2.setEngine("123");
        System.out.println("number two: " + car2.getName() + " " + car2.getEngine() + " " + Car.numberOfCars);

    }
}
