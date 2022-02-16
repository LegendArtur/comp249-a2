// -----------------------------------------------------
// Assignment #2
// Question: Part 1 and 2
// Written by: Artur Gubaidullin 40208924
// -----------------------------------------------------

package AgriculturalMAVPackages;

import UAVPackage.UAV;

import java.util.Objects;

public class AgriculturalDrone extends UAV {

    private String brand;
    private int carryCapacity;

    public AgriculturalDrone() {
        brand = "DJI";
        carryCapacity = 40;
    }

    public AgriculturalDrone(double weight, double price, String brand, int carryCapacity) {
        super(weight, price);
        this.brand = brand;
        this.carryCapacity = carryCapacity;
    }

    public AgriculturalDrone(String brand, int carryCapacity) {
        this.brand = brand;
        this.carryCapacity = carryCapacity;
    }

    public AgriculturalDrone(AgriculturalDrone agriculturalDrone) {
        super(agriculturalDrone);
        brand = agriculturalDrone.getBrand();
        carryCapacity = agriculturalDrone.getCarryCapacity();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCarryCapacity() {
        return carryCapacity;
    }

    public void setCarryCapacity(int carryCapacity) {
        this.carryCapacity = carryCapacity;
    }

    public String toString() {
        return super.toString() +
                ",\n- brand='" + brand +
                ",\n- carryCapacity=" + carryCapacity;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AgriculturalDrone that = (AgriculturalDrone) o;
        return carryCapacity == that.carryCapacity && Objects.equals(brand, that.brand);
    }

}
