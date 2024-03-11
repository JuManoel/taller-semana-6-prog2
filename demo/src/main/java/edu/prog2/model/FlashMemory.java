package edu.prog2.model;


public class FlashMemory extends StorageDevice {

    private String portType; // usb1, usb2, usb3

    public FlashMemory() {}

    public FlashMemory(String model, boolean wireless, double precio,int usedCapacity, int freeCapacity, int speed, String portType) {
        super(model, wireless, precio,usedCapacity, freeCapacity, speed);
        this.portType = portType;
    }

    public String getPortType() {
        return this.portType;
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

}
