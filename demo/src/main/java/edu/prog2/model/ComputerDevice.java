package edu.prog2.model;

import org.json.JSONObject;

public abstract class ComputerDevice {

    protected String model;
    protected boolean wireless;
    protected String type;
    protected double precio;

    public ComputerDevice() {
    }

    public ComputerDevice(String model, boolean wireless,double precio) {
        this.model = model;
        this.wireless = wireless;
        this.precio=precio;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isWireless() {
        return this.wireless;
    }

    public boolean getWireless() {
        return this.wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getType() {
        // OJO
        return this.getClass().getSimpleName();
    }
    
    @Override
    public String toString() {
        return (new JSONObject(this)).toString(2);
    }

}
