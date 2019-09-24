package ivan.vatlin.services;

public class DeviceServiceImpl implements DeviceService {
    @Override
    public void turnOn() {
        System.out.println("Device is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Device is turned off");
    }

    @Override
    public void reboot() {
        System.out.println("Device is rebooted");
    }

    @Override
    public void setDefaultSettings() {
        System.out.println("Device got default state");
    }

    @Override
    public void turnRecoveryMode() {
        System.out.println("Device in recovery mode");
    }
}
