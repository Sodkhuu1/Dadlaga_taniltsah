package day2.W3Resourse_VechileClass;

public class Car extends Vehicle {
    private double distanceTraveled;
    private double fuelUsed;

    public Car(String make, String model, int year, String fuelType, double fuelEfficiency, double distanceTraveled, double fuelUsed) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.distanceTraveled = distanceTraveled;
        this.fuelUsed = fuelUsed;
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelUsed == 0 ? 0 : distanceTraveled / fuelUsed;
    }

    @Override
    public double calculateDistanceTraveled() {
        return distanceTraveled;
    }

    @Override
    public double getMaxSpeed() {
        return 220.0;
    }
}
