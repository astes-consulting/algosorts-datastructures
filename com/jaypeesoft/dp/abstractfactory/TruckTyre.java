package com.jaypeesoft.dp.abstractfactory;

public class TruckTyre implements Tyre {
    @Override
    public void design() {
        System.out.println("Designing truck Tyre");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing truck Tyre");
    }
}
