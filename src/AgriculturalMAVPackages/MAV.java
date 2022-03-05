// -----------------------------------------------------
// Assignment #2
// Question: Part 1 and 2
// Written by: Artur Gubaidullin 40208924
// -----------------------------------------------------


package AgriculturalMAVPackages;

import UAVPackage.UAV;

import java.util.Objects;

/**
 * MAV class.
 * @author Artur Gubaidullin
 * @see <P>COMP249
 * <P>Assignment #2
 * <P>Due Date 04/03/2022
 */
public class MAV extends UAV {

    private String model;
    private double size; //millimeters

    public MAV() {
        super();
        model = "RQ-69 T-bird";
        size = 500;
    }

    public MAV(double weight, double price, String model, double size) {
        super(weight, price);
        this.model = model;
        this.size = size;
    }

    public MAV(String model, double size) {
        this.model = model;
        this.size = size;
    }

    public MAV(MAV mav) {
        super(mav);
        model = mav.getModel();
        size = mav.getSize();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String toString() {
        return super.toString() +
                ",\n- model= " + model +
                ",\n- size= " + size;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MAV mav = (MAV) o;
        return Double.compare(mav.size, size) == 0 && Objects.equals(model, mav.model);
    }

    public MAV copy() {
        return new MAV(this);
    }

}
