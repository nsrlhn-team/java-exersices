package academy.learnprogramming;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.engine = true;
        this.cylinders = cylinder;
        this.name = name;
        this.wheels = 4;
    }
    public String startEngine(){
        return "The car's engine is starting";
    }

    public String accelerate(){
        return "The car is accelerating";
    }

    public String brake(){
        return "The car is braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
