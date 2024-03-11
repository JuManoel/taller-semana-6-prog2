package edu.prog2.model;

public class Mouse extends ComputerDevice {

    private int dpi; // Dot Per Inch (puntos por pulgada)
    private int buttons;

    public Mouse() {}

    public Mouse(String model, boolean wireless, double precio,int dpi, int buttons) {
        // por derivarse de abstract tiene que utilizarse super(...)
        super(model, wireless,precio);
        this.dpi = dpi;
        this.buttons = buttons;
    }

    public int getDpi() {
        return this.dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getButtons() {
        return this.buttons;
    }

    public void setButtons(int buttons) {
        this.buttons = buttons;
    }

}
