package ivan.vatlin.entity;

public class Device {
    private long id;
    private String type;
    private String brand;
    private String model;

    public Device(long id, String type, String brand, String model) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
