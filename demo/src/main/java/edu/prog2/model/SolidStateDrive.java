package edu.prog2.model;

public class SolidStateDrive extends StorageDevice {

    private String interfaceType; // SATA 6Gb/s - PCIe Gen3x2 - 3D TLC

    public SolidStateDrive() {}

    public SolidStateDrive(String model, boolean wireless, double precio,int usedCapacity, int freeCapacity, int speed,
            String interfaceType) {
        super(model, wireless, precio,usedCapacity, freeCapacity, speed);
        this.interfaceType = interfaceType;
    }

    public String getInterfaceType() {
        return this.interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

}
