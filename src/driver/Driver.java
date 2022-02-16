package driver;

import AgriculturalMAVPackages.AgriculturalDrone;
import AgriculturalMAVPackages.MAV;
import AirplanePackage.Airplane;
import HelicopterQuadcopterPackage.*;
import MultirotorPackage.Multirotor;
import UAVPackage.UAV;


public class Driver
{
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Airplane airplane2 = new Airplane("Boeing", 10000000, 69);
        
        Helicopter helicopter = new Helicopter();
        Helicopter helicopter2 = new Helicopter(6,2002,4);
        Helicopter helicopter3 = new Helicopter(helicopter2);
        
        Quadcopter quadcopter = new Quadcopter();
        Quadcopter quadcopter2 = new Quadcopter(40);
        
        Multirotor multirotor = new Multirotor();
        Multirotor multirotor2 = new Multirotor(8);
        
        UAV uav = new UAV();
        UAV uav2 = new UAV(20,1000);
        
        AgriculturalDrone agriculturalDrone = new AgriculturalDrone();
        AgriculturalDrone agriculturalDrone2 = new AgriculturalDrone(agriculturalDrone);
        
        MAV mav = new MAV();
        MAV mav2 = new MAV("Mercedes Secret Project", 2);

        System.out.println("-------------------------------------------------------------\nWelcome to the Flying Object Equivalence program by Artur Gubaidullin\n-------------------------------------------------------------");


        findLeastExpensiveUAV();
    }

    private static void findLeastExpensiveUAV() {
    }


}
