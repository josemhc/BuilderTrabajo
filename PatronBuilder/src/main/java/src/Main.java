/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;
import src.PatronBuilder.Builder;
import src.PatronBuilder.CarBuilder;
import src.PatronBuilder.Car;
import src.PatronBuilder.CarManualBuilder;
import src.PatronBuilder.Director;
import src.PatronBuilder.Manual;

/**
 *
 * @author josem
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        
        director.makeSUV(carBuilder);
        Car suv = carBuilder.getResult();
        // Utilizar el objeto SUV
        
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.makeSportsCar(carManualBuilder);
        Manual sportsCarManual = carManualBuilder.getResult();
        // Utilizar el manual del Sports Car
    }
}

