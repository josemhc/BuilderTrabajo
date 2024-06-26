/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.PatronBuilder;

/**
 *
 * @author josem
 */
public class Manual {
    private int seats;

    @Override
    public String toString() {
        return "Manual{" +
                "seats=" + seats +
                ", engine='" + engine + '\'' +
                ", tripComputer=" + tripComputer +
                ", GPS=" + GPS +
                '}';
    }

    private String engine;
    private boolean tripComputer;
    private boolean GPS;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTripComputer() {
        this.tripComputer = true;
    }

    public void setGPS() {
        this.GPS = true;
    }
}

