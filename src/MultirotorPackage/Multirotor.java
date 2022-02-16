// -----------------------------------------------------
// Assignment #2
// Question: Part 1 and 2
// Written by: Artur Gubaidullin 40208924
// -----------------------------------------------------

package MultirotorPackage;

import HelicopterQuadcopterPackage.Helicopter;

import java.util.Objects;

public class Multirotor extends Helicopter {

    private int numberOfRotors;

    public Multirotor() {
        super();
        this.numberOfRotors = 6;
    }

    public Multirotor(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity, int numberOfRotors) {
        super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
        this.numberOfRotors = numberOfRotors;
    }

    public Multirotor(int numberOfRotors) {
        this.numberOfRotors = numberOfRotors;
    }

    public Multirotor(Multirotor multirotor) {
        super(multirotor);
        numberOfRotors = multirotor.numberOfRotors;
    }

    public int getNumberOfRotors() {
        return numberOfRotors;
    }

    public void setNumberOfRotors(int numberOfRotors) {
        this.numberOfRotors = numberOfRotors;
    }

    public String toString() {
        return super.toString() +
                ",\n- numberOfRotors=" + numberOfRotors;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Multirotor that = (Multirotor) o;
        return numberOfRotors == that.numberOfRotors;
    }

}
