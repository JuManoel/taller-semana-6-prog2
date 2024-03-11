package edu.prog2.model;

public class Keyboard extends ComputerDevice {

    private Language language;
    private boolean gamer;
    private boolean integrated; // sólo en los portátiles

    public Keyboard() {}

    public Keyboard(String model, boolean wireless, double precio,Language language, boolean gamer, boolean integrated) {
        // una clase que deriva de una clase abstracta TIENE que utilizar super(...)
        super(model, wireless,precio);
        this.language = language;
        this.gamer = gamer;
        this.integrated = integrated;
    }

    public Language getLanguage() {
        return this.language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public boolean isGamer() {
        return this.gamer;
    }

    public boolean getGamer() {
        return this.gamer;
    }

    public void setGamer(boolean gamer) {
        this.gamer = gamer;
    }

    public boolean isIntegrated() {
        return this.integrated;
    }

    public boolean getIntegrated() {
        return this.integrated;
    }

    public void setIntegrated(boolean integrated) {
        this.integrated = integrated;
    }

}
