/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.PatronBuilder;

/**
 *
 * @author josem
 */
public class CarManualBuilder {
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    public void reset() {
        this.manual = new Manual();
    }

    public void setSeats(int number) {
        this.manual.setSeats(number);
    }

    public void setEngine(String engine) {
        this.manual.setEngine(engine);
    }

    public void setTripComputer() {
        this.manual.setTripComputer();
    }

    public void setGPS() {
        this.manual.setGPS();
    }

    public Manual getResult() {
        return this.manual;
    }
}
