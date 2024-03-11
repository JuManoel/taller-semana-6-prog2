package edu.prog2.model;

public abstract class StorageDevice extends ComputerDevice {

    protected int usedCapacity; // Gb
    protected int freeCapacity; // Gb
    protected int speed; // MBxS

    public StorageDevice() {
    }

    public StorageDevice(String model, boolean wireless, double precio,int usedCapacity, int freeCapacity, int speed) {
        super(model, wireless,precio);
        this.usedCapacity = usedCapacity;
        this.freeCapacity = freeCapacity;
        this.speed = speed;
    }

    public int getUsedCapacity() {
        return this.usedCapacity;
    }

    public void setUsedCapacity(int usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public int getFreeCapacity() {
        return this.freeCapacity;
    }

    public void setFreeCapacity(int freeCapacity) {
        this.freeCapacity = freeCapacity;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return getFreeCapacity()+getUsedCapacity();
    }

}
