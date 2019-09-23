package ivan.vatlin.entity;

public class Device {
    private String type;
    private String brand;
    private String model;

    public Device(String type, String brand, String model) {
        this.type = type;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Device{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
