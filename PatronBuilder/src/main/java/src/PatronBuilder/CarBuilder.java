/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.PatronBuilder;

import src.PatronBuilder.Builder;
import src.PatronBuilder.Car;

/**
 *
 * @author josem
 */
  public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }
    
    @Override
    public void reset() {
        this.car = new Car();    
    }

    public void setSeats(int number) {
        this.car.setSeats(number);
    }

    public void setEngine(String engine) {
        this.car.setEngine(engine);
    }

    public void setTripComputer() {
        this.car.setTripComputer();
    }

    public void setGPS() {
        this.car.setGPS();
    }

    public Car getResult() {
        return this.car;
    }
}