// -----------------------------------------------------
// Assignment #2
// Question: Part 1 and 2
// Written by: Artur Gubaidullin 40208924
// -----------------------------------------------------

package HelicopterQuadcopterPackage;

import AirplanePackage.Airplane;

import java.util.Objects;

public class Helicopter extends Airplane{

    protected int numberOfCylinders;
    protected int creationYear;
    protected int passengerCapacity;

    public Helicopter() {
        super();
        numberOfCylinders = 4;
        creationYear = 2020;
        passengerCapacity = 8;
    }

    public Helicopter(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity) {
        super(brand, price, horsepower);
        this.numberOfCylinders = numberOfCylinders;
        this.creationYear = creationYear;
        this.passengerCapacity = passengerCapacity;
    }

    public Helicopter(int numberOfCylinders, int creationYear, int passengerCapacity) {
        this.numberOfCylinders = numberOfCylinders;
        this.creationYear = creationYear;
        this.passengerCapacity = passengerCapacity;
    }

    public Helicopter(Helicopter helicopter) {
        super(helicopter);
        numberOfCylinders = helicopter.numberOfCylinders;
        creationYear = helicopter.creationYear;
        passengerCapacity = helicopter.passengerCapacity;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String toString() {
        return super.toString() +
                ",\n- numberOfCylinders= " + numberOfCylinders +
                ",\n- creationYear= " + creationYear +
                ",\n- passengerCapacity= " + passengerCapacity;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Helicopter that = (Helicopter) o;
        return numberOfCylinders == that.numberOfCylinders && creationYear == that.creationYear && passengerCapacity == that.passengerCapacity;
    }

}
