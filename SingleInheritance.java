class Vehicle {
    void vehicle() {
        System.out.println("Vehicle is running");
}
class Car extends Vehicle {
    void car() {
        System.out.println("This vehicle is a car");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.vehicle();   
        obj.car();      
}