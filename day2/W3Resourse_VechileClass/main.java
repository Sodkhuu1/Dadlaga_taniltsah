package day2.W3Resourse_VechileClass;
class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020, "Petrol", 15.0, 300.0, 20.0);
        Truck truck = new Truck("Volvo", "FH16", 2018, "Diesel", 6.0, 500.0, 60.0, 2000.0);

        System.out.println("=== Car Info ===");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance Traveled: " + car.calculateDistanceTraveled() + " km");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h");

        System.out.println("\n=== Truck Info ===");
        System.out.println("Make: " + truck.getMake());
        System.out.println("Model: " + truck.getModel());
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance Traveled: " + truck.calculateDistanceTraveled() + " km");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " km/h");
    }
}
