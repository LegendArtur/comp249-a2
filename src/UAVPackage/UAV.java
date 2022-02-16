// -----------------------------------------------------
// Assignment #2
// Question: Part 1 and 2
// Written by: Artur Gubaidullin 40208924
// -----------------------------------------------------


package UAVPackage;

public class UAV {

    protected double weight;
    protected double price;

    public UAV() {
        weight = 50;
        price = 1000;
    }

    public UAV(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    public UAV(UAV uav) {
        weight = uav.weight;
        price = uav.price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "This UAV has the following info:" +
                "\n- weight (in pounds)= " + weight +
                ",\n- price=" + price;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        UAV uav = (UAV) o;
        return Double.compare(uav.weight, weight) == 0 && Double.compare(uav.price, price) == 0;
    }

}
