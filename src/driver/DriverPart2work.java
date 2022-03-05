// -----------------------------------------------------
// Assignment #2
// Question: Part 2 (that does work)
// Written by: Artur Gubaidullin 40208924
// -----------------------------------------------------


package driver;

import AgriculturalMAVPackages.AgriculturalDrone;
import AgriculturalMAVPackages.MAV;
import AirplanePackage.Airplane;
import HelicopterQuadcopterPackage.Helicopter;
import HelicopterQuadcopterPackage.Quadcopter;
import MultirotorPackage.Multirotor;
import UAVPackage.UAV;

/**
 * Driver for Part 2, but that actually works.
 * @author Artur Gubaidullin
 * @see <P>COMP249
 * <P>Assignment #2
 * <P>Due Date 04/03/2022
 */
public class DriverPart2work {

    /**
     * copies passed FlyingObjectsArray
     * @param flyingObjects an array of FlyingObjects
     * @return returns a copy of the passed array of FlyingObjects
     */
    public static FlyingObjects[] copyFlyingObjects(FlyingObjects[] flyingObjects) {

        FlyingObjects[] newFlyingObjects = new FlyingObjects[flyingObjects.length];

        for (int i = 0; i < flyingObjects.length; i++) {
            newFlyingObjects[i] = flyingObjects[i].copy();
        }

        return newFlyingObjects;
    }

    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------\nWelcome to the Flying Object Copying program by Artur Gubaidullin\n-------------------------------------------------------------");

        Airplane airplane = new Airplane();
        Airplane airplane2 = new Airplane("Boeing", 100000000, 42069);

        Helicopter helicopter = new Helicopter();
        Helicopter helicopter2 = new Helicopter("WooHooAir", 1241244, 700,6,2002,4);
        Helicopter helicopter3 = new Helicopter(helicopter2);

        Quadcopter quadcopter = new Quadcopter();
        Quadcopter quadcopter2 = new Quadcopter(40);

        Multirotor multirotor = new Multirotor();
        Multirotor multirotor2 = new Multirotor(8);

        UAV uav = new UAV();
        UAV uav2 = new UAV(20,10000);

        AgriculturalDrone agriculturalDrone = new AgriculturalDrone();
        AgriculturalDrone agriculturalDrone2 = new AgriculturalDrone(agriculturalDrone);

        MAV mav = new MAV(10,420,"Cool Model",3);
        MAV mav2 = new MAV("Mercedes Secret Project", 2);

        FlyingObjects[] flyingObjects = new FlyingObjects[]{
                airplane, airplane2, helicopter, helicopter2, helicopter3, quadcopter, quadcopter2, multirotor, multirotor2,  uav, uav2, agriculturalDrone, agriculturalDrone2, mav, mav2
        };

        System.out.println("-------------------------------------------------------------" +
                "\nCopying objects from flyingObjects array." +
                "\n-------------------------------------------------------------");

        FlyingObjects[] copyOfFlyingObjects = copyFlyingObjects(flyingObjects);

        System.out.println("\nThe original array contains: ");
        for (FlyingObjects flyingObject : flyingObjects) {
            System.out.print(flyingObject.getClass().getSimpleName() + ", ");
        }

        System.out.println("\nThe copied array contains: ");
        for (FlyingObjects flyingObject : copyOfFlyingObjects) {
            System.out.print(flyingObject.getClass().getSimpleName() + ", ");
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("Thank you for using my program.");

    }

}
