package edu.prog2.model;

import java.util.ArrayList;

import org.json.JSONObject;

public class Computer {

    private TypeComputer type;
    private ArrayList<ComputerDevice> devices;

    public Computer() {
        devices = new ArrayList<>();
    }

    public Computer(TypeComputer type, ArrayList<ComputerDevice> devices) {
        this.type = type;
        this.devices = devices;
    }

    public ArrayList<ComputerDevice> getDevices() {
        return devices;
    }

    public void setDevices(ArrayList<ComputerDevice> devices) {
        this.devices = devices;
    }

    public TypeComputer getType() {
        return type;
    }

    public void setType(TypeComputer type) {
        this.type = type;
    }

    public int getFullFreeCapacity() {
        int freeCapacity = 0;

        for (ComputerDevice device : devices) {
            if(device instanceof StorageDevice){
                freeCapacity+=((StorageDevice)device).getFreeCapacity();
            }
        }

        return freeCapacity;
    }

    public int getFullUsedCapacity() {
        int usedCapacity = 0;

        for (ComputerDevice device : devices) {
            if(device instanceof StorageDevice){
                usedCapacity+=((StorageDevice)device).getUsedCapacity();
            }
        }
        return usedCapacity;
    }

    public int getFullCapacity() {
        int fullCapacity = 0;

        fullCapacity+=this.getFullFreeCapacity();
        fullCapacity+=this.getFullUsedCapacity();

        return fullCapacity;
    }

    /**
     * retornar true si this tiene:
     * solo un disco de estado sólido y una memoria flash como únicos medios de
     * almacenamiento,
     * al menos un monitor y no tienen mouse.
     * 
     * @return
     */
    public boolean okRestrictions() {
        int disco=0;
        int flash=0;
        int monitor=0;
        int mouse=0;
        for (ComputerDevice device : devices) {
            if(device instanceof HardDiskDrive){
                disco++;
            }else if(device instanceof FlashMemory){
                flash++;
            }else if(device instanceof Monitor){
                monitor++;
            }else if(device instanceof Mouse){
                mouse++;
            }
            
        }
        return (disco==1 && flash==1) && (monitor>=1 && mouse==0) ;
    }

    public double costoTotal(){
        double costo=0;
        for (ComputerDevice computerDevice : devices) {
            costo+=computerDevice.getPrecio();
        }
        return costo;
    }

    @Override
    public String toString() {
        return (new JSONObject(this)).toString(2);
    }

}
