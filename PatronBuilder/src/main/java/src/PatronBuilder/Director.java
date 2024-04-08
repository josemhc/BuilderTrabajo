/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.PatronBuilder;

/**
 *
 * @author josem
 */
public class Director {
     public void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(5);
        builder.setEngine("V8");
        builder.setGPS();
    }

    public void makeSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("V12");
        builder.setTripComputer();
    }
}
