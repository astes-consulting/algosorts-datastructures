package com.jaypeesoft.dp.client;

import java.util.Scanner;

import com.jaypeesoft.dp.abstractfactory.Engine;
import com.jaypeesoft.dp.abstractfactory.Factory;
import com.jaypeesoft.dp.abstractfactory.Tyre;
import com.jaypeesoft.dp.abstractfactory.UnknownVehicleException;

public class AbstractFactoryClient {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String vehicleType = in.nextLine().toLowerCase();

        Factory factory;

        try {
            factory = Factory.getFactory(vehicleType);
            Engine engine = factory.getEngine();

            engine.design();
            engine.manufacture();
            engine.test();

            Tyre tyre = factory.getTyre();
            tyre.design();
            tyre.manufacture();

        } catch (UnknownVehicleException e) {
            System.out.println("Invalid vehicle type entered");
        }
    }

}
