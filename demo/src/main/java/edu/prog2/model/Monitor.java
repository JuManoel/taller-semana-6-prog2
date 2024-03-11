package edu.prog2.model;

public class Monitor extends ComputerDevice {

    private double inches;

    public Monitor(String model, boolean wireless, double precio,double inches) {
        super(model, wireless,precio);
        this.inches = inches;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

}
