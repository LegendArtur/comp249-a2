// -----------------------------------------------------
// Assignment #2
// Question: Part 1 and 2
// Written by: Artur Gubaidullin 40208924
// -----------------------------------------------------


package AirplanePackage;

import driver.FlyingObjects;

import java.util.Objects;

public class Airplane extends FlyingObjects {

    protected String brand;
    protected double price;
    protected int horsepower;

    public Airplane() {
        brand = "Boeing";
        price = 200000000;
        horsepower = 30000;
    }

    public Airplane(String brand, double price, int horsepower) {
        this.brand = brand;
        this.price = price;
        this.horsepower = horsepower;
    }

    public Airplane(Airplane airplane) {
        brand = airplane.brand;
        price = airplane.price;
        horsepower = airplane.horsepower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String toString() {
        return "This " + this.getClass().getSimpleName() + " has the following description:\n" +
                "- brand= " + brand +
                ",\n- price= " + price +
                ",\n- horsepower= " + horsepower;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;
        return Double.compare(airplane.price, price) == 0 && horsepower == airplane.horsepower && Objects.equals(brand, airplane.brand);
    }
}
