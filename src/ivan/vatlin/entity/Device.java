package ivan.vatlin.entity;

public class Device {
    private long id;

    public Device(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                '}';
    }
}
