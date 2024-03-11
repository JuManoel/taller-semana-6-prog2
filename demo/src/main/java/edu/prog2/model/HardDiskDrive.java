package edu.prog2.model;

public class HardDiskDrive extends StorageDevice {

    private int rmp; // 7200 
    private double inches;

    public HardDiskDrive() {}

    public HardDiskDrive(String model, boolean wireless, double precio,int usedCapacity, int freeCapacity, int speed, int rmp, double inches) {
        super(model, wireless, precio,usedCapacity, freeCapacity, speed);
        this.rmp = rmp;
        this.inches = inches;
    }

    public int getRmp() {
        return this.rmp;
    }

    public void setRmp(int rmp) {
        this.rmp = rmp;
    }

    public double getInches() {
        return this.inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

}
