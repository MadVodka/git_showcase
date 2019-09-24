package ivan.vatlin.services;

public interface DeviceService {
    void turnOn();

    void turnOff();

    void reboot();

    void setDefaultSettings();

    void turnRecoveryMode();
}
