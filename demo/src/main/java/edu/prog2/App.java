package edu.prog2;

import java.util.ArrayList;
import java.util.Scanner;

import edu.prog2.model.Computer;
import edu.prog2.model.ComputerDevice;
import edu.prog2.model.FlashMemory;
import edu.prog2.model.HardDiskDrive;
import edu.prog2.model.Keyboard;
import edu.prog2.model.Language;
import edu.prog2.model.Monitor;
import edu.prog2.model.Mouse;
import edu.prog2.model.SolidStateDrive;
import edu.prog2.model.TypeComputer;

public class App {
    public static void main(String[] args) {

        Scanner pausa=new Scanner(System.in);

        Computer c1 = new Computer();
        Computer c2 = new Computer();
        Computer c3=new Computer();
        Computer c4=new Computer();

        c1.setType(TypeComputer.DESKTOP);
        c1.getDevices().add(new Keyboard("Logitech MK345", true, 100,Language.SPANISH, false, false));
        c1.getDevices().add(new Mouse("Genius DX-110", false, 100,1000, 2));
        c1.getDevices().add(new HardDiskDrive("Western Digital WD10EZEX", false, 100,300, 700, 6, 7200, 3.5));

        c2.setType(TypeComputer.LAPTOP);
        c2.getDevices().add(new Monitor("Pantalla FHD, IPS", false,100,15.6));
        c2.getDevices().add(new Keyboard("HP Premium retroiluminado",false,100,Language.SPANISH,false,true));
        c2.getDevices().add(new SolidStateDrive("Crucial CT1000BX500SSD1", false, 100,200, 800, 6, "SATA III"));
        c2.getDevices().add(new FlashMemory("ataTraveler G3 DT100G3", false, 100,10, 20, 10, "USB-A"));
        
        c3.setType(TypeComputer.LAPTOP);
        c3.getDevices().add(new Monitor("Viewsonic VX2776-SMH", false, 100,27));
        c3.getDevices().add(new Keyboard("Logitech MK330", true, 100,Language.SPANISH, false, true));
        c3.getDevices().add(new SolidStateDrive("Samsung 970 Evo Plus", false, 100,100, 250, 6, "PCIe Gen 3.0 x4, NVMe 1.3"));
        c3.getDevices().add(new FlashMemory("SanDisk Ultra Dual Drive ", false, 100,7, 16, 10, "USB-C"));

        c4.setType(TypeComputer.DESKTOP);
        c4.getDevices().add(new Monitor("Dell S3422DW\\t", false, 100,32));
        c4.getDevices().add(new Keyboard("Logitech G915 Lightspeed", false, 100,Language.ENGLISH, true, false));
        c4.getDevices().add(new SolidStateDrive("Samsung 970 Evo Plus", true, 100,150, 500, 3, "SATA 6 GB/s"));
        c4.getDevices().add(new FlashMemory("PNY Duo Link OTG", false, 100,10, 32, 130, "USB-A"));

        Computer c5 = new Computer();
        c5.setType(TypeComputer.LAPTOP);
        c5.getDevices().add(new Monitor("LG UltraFine 27UN83A-W", false, 100,27));
        c5.getDevices().add(new Keyboard("MSI Vigor GK50 Elite", false, 100,Language.SPANISH, true, false));
        c5.getDevices().add(new SolidStateDrive("Samsung 980 PRO", false, 100,150, 500, 7, "PCIe 4.0"));
        c5.getDevices().add(new FlashMemory("Toshiba TransMemory U365", false, 100,10, 32, 5, "USB-A"));

        Computer c6 = new Computer();
        c6.setType(TypeComputer.LAPTOP);
        c6.getDevices().add(new Monitor("Samsung S32BM702 ", true, 100,32));
        c6.getDevices().add(new Keyboard("Asus ROG Strix Scope RX", false, 100,Language.ENGLISH, false, false));
        c6.getDevices().add(new SolidStateDrive("Samsung 980 Pro", false, 100,250, 800, 6, "PCIe 4.0 x4"));
        c6.getDevices().add(new FlashMemory("Toshiba TransMemory U365 ", false, 100,5, 10, 6, "USB-C"));

        Computer c7 = new Computer();
        c7.setType(TypeComputer.DESKTOP);
        c7.getDevices().add(new Monitor("widescreen ultra extended graphics array", false, 100,16));
        c7.getDevices().add(new Keyboard("Asus", true, 100,Language.SPANISH, true, false));
        c7.getDevices().add(new SolidStateDrive("Crucial CT1000BX500SSD1", false, 100,200, 800, 6, "SATA III"));
        c7.getDevices().add(new FlashMemory("ataTraveler G3 DT100G3", false, 100,10, 20, 10, "USB-A"));
        c7.getDevices().add(new HardDiskDrive("st500lm012", false, 100,0, 500, 10, 0, 6));

        Computer c8 = new Computer();
        c8.setType(TypeComputer.LAPTOP);
        c8.getDevices().add(new Monitor("Alta definición (HD)", false, 100,18));
        c8.getDevices().add(new Monitor("2K", false, 100,14));
        c8.getDevices().add(new Keyboard("HP Premium retroiluminado", true, 100,Language.SPANISH, false, true));
        c8.getDevices().add(new SolidStateDrive("Crucial CT1000BX500SSD1", false, 100,200, 800, 6, "SATA III"));

        Computer c9 = new Computer();
        c9.setType(TypeComputer.DESKTOP);
        c9.getDevices().add(new Keyboard("Green Leaf", false, 100,Language.SPANISH, false, true));
        c9.getDevices().add(new HardDiskDrive("PATA", false, 100,200, 800, 6, 7, 7200.0));
        c9.getDevices().add(new FlashMemory("ataTraveler G3 DT100G3", false, 100,10, 20, 10, "USB-A"));

        Computer c10 = new Computer();
        c10.setType(TypeComputer.LAPTOP);
        c10.getDevices().add(new Monitor("ViewSonic VA2715-H", false, 100,15.6));
        c10.getDevices().add(new Keyboard("Logitech", false, 100,Language.FRENCH, false, true));
        c10.getDevices().add(new SolidStateDrive("Kingston A400", false, 100,200, 800, 6, "SATA III"));
        c10.getDevices().add(new FlashMemory("ataTraveler G3 DT100G3", false, 100,10, 20, 10, "USB-A"));

        Computer c11 = new Computer();
        c11.setType(TypeComputer.DESKTOP);
        c11.getDevices().add(new Keyboard("Macally", false, 100,Language.ENGLISH, true, true));
        c11.getDevices().add(new HardDiskDrive("SATA", false, 100,200, 800, 6, 7, 7200.0));
        c11.getDevices().add(new FlashMemory("ataTraveler G3 DT100G3", false, 100,10, 20, 10, "USB-A"));

        Computer c12 = new Computer();
        c12.setType(TypeComputer.LAPTOP);
        c12.getDevices().add(new Monitor("ASUS VZ279HE-W", false, 100,15.6));
        c12.getDevices().add(new Keyboard("Eagle Warrior", false, 100,Language.FRENCH, false, true));
        c12.getDevices().add(new SolidStateDrive("ADATA SU800", false, 100,200, 800, 6, "SATA III"));

        Computer c13 = new Computer();
        c13.setType(TypeComputer.DESKTOP);
        c13.getDevices().add(new Monitor("Samsung FHD, IPS LF22T350", false, 100,22));
        c13.getDevices().add(new Keyboard("Corsair Rapidfire K70", false, 100,Language.ENGLISH, true, false));
        c13.getDevices().add(new Mouse("Logitech Pebble M350", true, 100,1000, 2));
        c13.getDevices().add(new SolidStateDrive("Western Digital Green", false, 100,200, 400, 6, "SATA III"));

        Computer c14 = new Computer();
        c14.setType(TypeComputer.DESKTOP);
        c14.getDevices().add(new Monitor("HP M24 FHD", false, 100,23.8));
        c14.getDevices().add(new Keyboard("Logitech K400", true, 100,Language.ENGLISH, false, false));
        c14.getDevices().add(new Mouse("NGS FOG", true, 100,1000, 2));
        c14.getDevices().add(new HardDiskDrive("Seagate BarraCuda", false, 100,400, 600, 6, 7200, 2.5));

        Computer c15 = new Computer();
        c15.setType(TypeComputer.LAPTOP);
        c15.getDevices().add(new Monitor("LG 32GN650", false, 100,31.5));
        c15.getDevices().add(new Keyboard("HP NOTEBOOK", false, 100,Language.SPANISH, false, true));
        c15.getDevices().add(new HardDiskDrive("WD Blue", false, 100,200, 300, 6, 5400, 3.5));
        c15.getDevices().add(new FlashMemory(" Siemens 6AV2181-8AS20", false, 100,4, 4, 25, "USB-A"));

        Computer c16 = new Computer();
        c16.setType(TypeComputer.DESKTOP);
        c16.getDevices().add(new Monitor("Dell S2421NX", false, 100,24));
        c16.getDevices().add(new Keyboard("Razer Huntsman V2", false, 100,Language.SPANISH, false, false));
        c16.getDevices().add(new Mouse("Trust Verto", true, 100,1600, 6));
        c16.getDevices().add(new SolidStateDrive("Samsung 870 QVO", false, 100,200, 800, 6, "SATA III"));

        Computer c17 = new Computer();
        c17.setType(TypeComputer.LAPTOP);
        c17.getDevices().add(new Monitor("ASUS VZ279HE-W", false, 100,27));
        c17.getDevices().add(new Keyboard("MSI Vigor GK50 ", false, 100,Language.SPANISH, false, true));
        c17.getDevices().add(new SolidStateDrive("Crucial MX500", false, 100,300, 700, 6, "SATA III"));


        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(c1);
        computers.add(c2);
        computers.add(c3);
        computers.add(c4);
        computers.add(c5);
        computers.add(c6);
        computers.add(c7);
        computers.add(c8);
        computers.add(c9);
        computers.add(c10);
        computers.add(c11);
        computers.add(c12);
        computers.add(c13);
        computers.add(c14);
        computers.add(c15);
        computers.add(c16);
        computers.add(c17);

        soutComputes(computers);
        pausa.nextLine();
        System.out.println("*********************************************************************************");
        System.out.println("Capacidad Libre Total del Centro de Computo: "+capacidadLibreComputos(computers));
        pausa.nextLine();
        System.out.println("*********************************************************************************");
        listaRestricto(computers);
        pausa.nextLine();
        System.out.println("*********************************************************************************");
        listadoCambiarHD(computers);
        pausa.nextLine();
        System.out.println("*********************************************************************************");
        costoComputador(computers);
        pausa.nextLine();
        System.out.println("*********************************************************************************");
        pausa.close();

    }

    public static void soutComputes(ArrayList<Computer> Array){
        for (Computer computer : Array) {
            System.out.println(computer);
            System.out.println("");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("");
        }
    }

    public static double capacidadLibreComputos(ArrayList<Computer> Array){
        double capacidadLibre=0;
        for (Computer computer : Array) {
            capacidadLibre+=computer.getFullFreeCapacity();
        }
        return capacidadLibre;
    }

    public static void listaRestricto(ArrayList<Computer> Array){
        for (Computer computer : Array) {
            if(computer.okRestrictions()){
                System.out.println(computer);
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("");

            }
        }
    }

    public static void listadoCambiarHD(ArrayList<Computer> Array){
        System.out.println("Se nescesita cambiar el disco duro para un solido en estes computadores:");
        for (Computer computer : Array) {
            for (ComputerDevice device : computer.getDevices()) {
                if(device instanceof HardDiskDrive){
                    System.out.println(computer);
                    System.out.println("---------------------------------------------------------------------");
                }
                
            }
        }
    }

    public static void costoComputador(ArrayList<Computer> Array){
        for (int i = 0; i < Array.size(); i++) {
            System.out.println("el computador: "+(i+1)+" cuesta: "+Array.get(i).costoTotal());
            for (ComputerDevice device : Array.get(i).getDevices()) {
                System.out.println("El divice: "+device.getModel()+" cuesta: "+device.getPrecio());
            }
        }
    }
}
