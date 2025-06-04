package day3;

public class Warehouse {
    private String name;
    private String location;

    public Warehouse(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void printInfo() {
        System.out.println("Warehouse: " + name + ", Location: " + location);
    }
}

