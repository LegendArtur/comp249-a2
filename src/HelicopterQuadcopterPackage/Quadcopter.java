// -----------------------------------------------------
// Assignment #2
// Question: Part 1 and 2
// Written by: Artur Gubaidullin 40208924
// -----------------------------------------------------


package HelicopterQuadcopterPackage;
/**
 * Quadcopter class.
 * @author Artur Gubaidullin
 * @see <P>COMP249
 * <P>Assignment #2
 * <P>Due Date 04/03/2022
 */
public class Quadcopter extends Helicopter {

    private int maxFlyingSpeed;

    public Quadcopter() {
        super();
        maxFlyingSpeed = 75;
    }

    public Quadcopter(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed) {
        super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    public Quadcopter(int maxFlyingSpeed) {
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    public Quadcopter(Quadcopter quadcopter) {
        super(quadcopter);
        maxFlyingSpeed = quadcopter.maxFlyingSpeed;
    }

    public int getMaxFlyingSpeed() {
        return maxFlyingSpeed;
    }

    public void setMaxFlyingSpeed(int maxFlyingSpeed) {
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    public String toString() {
        return super.toString() +
                ",\n- maxFlyingSpeed=" + maxFlyingSpeed;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Quadcopter that = (Quadcopter) o;
        return maxFlyingSpeed == that.maxFlyingSpeed;
    }

    public Quadcopter copy() {
        return new Quadcopter(this);
    }

}
