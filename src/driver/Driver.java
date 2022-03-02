package driver;

import AgriculturalMAVPackages.AgriculturalDrone;
import AgriculturalMAVPackages.MAV;
import AirplanePackage.Airplane;
import HelicopterQuadcopterPackage.*;
import MultirotorPackage.Multirotor;
import UAVPackage.UAV;

import javax.sound.midi.Soundbank;


public class Driver
{
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------\nWelcome to the Flying Object Equivalence program by Artur Gubaidullin\n-------------------------------------------------------------");

        Airplane airplane = new Airplane();
        Airplane airplane2 = new Airplane("Boeing", 10000000, 69);
        
        Helicopter helicopter = new Helicopter();
        Helicopter helicopter2 = new Helicopter("WhooHooAir", 1241244, 700,6,2002,4);
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

        FlyingObjects[] flyingObjects1 = new FlyingObjects[]{
                airplane, airplane2, helicopter, helicopter2, helicopter3, quadcopter, quadcopter2, multirotor, multirotor2,  uav, uav2, agriculturalDrone, agriculturalDrone2, mav, mav2
        };
        FlyingObjects[] flyingObjects2 = new FlyingObjects[]{
                airplane, airplane2, helicopter, helicopter2, helicopter3, quadcopter, quadcopter2, multirotor, multirotor2
        };

        for (FlyingObjects flyingObjects : flyingObjects1) {
            System.out.println(flyingObjects.toString() + "\n");
        }

        System.out.println("-------------------------------------------------------------");



        System.out.println("Testing equals() method of two objects of helicopter and uav2:");
        if ((helicopter.equals(uav))) {
            System.out.println("-helicopter equals uav2");
        } else {
            System.out.println("-helicopter doesn't equal uav2");
        }

        System.out.println("-------------------------------------------------------------");

        System.out.println("Testing equals() method for mav and mav2:");
        if ((mav.equals(mav2))) {
            System.out.println("-mav equals mav2");
        } else {
            System.out.println("-mav doesn't equal mav2");
        }

        System.out.println("-------------------------------------------------------------");

        System.out.println("Testing equals() method for agriculturalDrone and agriculturalDrone2:");
        if ((agriculturalDrone.equals(agriculturalDrone2))) {
            System.out.println("-agriculturalDrone equals agriculturalDrone2");
        } else {
            System.out.println("-agriculturalDrone doesn't equal agriculturalDrone2");
        }
        System.out.println("-------------------------------------------------------------");

        findLeastExpensiveUAV(flyingObjects1);

        System.out.println("-------------------------------------------------------------");

        findLeastExpensiveUAV(flyingObjects2);

        System.out.println("-------------------------------------------------------------");
        System.out.println("Thank you for using my program.");
    }

    private static void findLeastExpensiveUAV(FlyingObjects[] flyingObjects) {

        UAV[] UAVs = new UAV[]{};

        for (FlyingObjects flyingObject : flyingObjects) {
            if (flyingObject instanceof UAV) {
                UAV[] newArray = new UAV[UAVs.length+1];

                for (int i = 0; i < UAVs.length; i++) {
                    newArray[i] = UAVs[i];
                }

                newArray[UAVs.length] = (UAV)flyingObject;
                UAVs = newArray;
            }
        }

        double[] UAVprices = new double[UAVs.length];

        for (int i = 0; i < UAVs.length; i++) {
            UAVprices[i] = UAVs[i].getPrice();
        }

        //UAVs are then sorted from highest to smallest value.
        double temp; int counter; UAV tempUAV;
        for (int i = 0; i < UAVprices.length; i++) {
            counter = 0;
            while (counter < UAVprices.length-1) {
                if (UAVprices[counter] < UAVprices[counter + 1]) {
                    temp = UAVprices[counter + 1];
                    UAVprices[counter + 1] = UAVprices[counter];
                    UAVprices[counter] = temp;

                    //The same permutations that are done on the dice values array are done on the Player array.
                    // (therefore players are also sorted descending)
                    tempUAV = UAVs[counter + 1];
                    UAVs[counter + 1] = UAVs[counter];
                    UAVs[counter] = tempUAV;
                }
                counter++;
            }
        }

        if (UAVs.length == 0) {
            System.out.println("There are no UAVs in the given Array");
        } else if (UAVs.length == 1) {
            System.out.println("There is only one UAV and here is the information about it:\n" + UAVs[0].toString());
        } else {
            System.out.println("Here is the information about the most expensive UAV:\n" + UAVs[0].toString());
            System.out.println("And, here is the information about the cheapest UAV:\n" + UAVs[UAVs.length - 1].toString());
        }
    }


}
