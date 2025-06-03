package day2.W3Resourse_VechileClass;

public class Truck extends Vehicle {
    private double distanceTraveled;
    private double fuelUsed;
    private double loadWeight;

    public Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double distanceTraveled, double fuelUsed, double loadWeight) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.distanceTraveled = distanceTraveled;
        this.fuelUsed = fuelUsed;
        this.loadWeight = loadWeight;
    }

    @Override
    public double calculateFuelEfficiency() {
        if (fuelUsed == 0) return 0;
        return (distanceTraveled / fuelUsed) * (1000 / (1000 + loadWeight));
    }

    @Override
    public double calculateDistanceTraveled() {
        return distanceTraveled;
    }

    @Override
    public double getMaxSpeed() {
        return 160.0;
    }
}
