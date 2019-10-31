package com.jaypeesoft.dp.abstractfactory;

public class CarTyre implements Tyre {
    @Override
    public void design() {
        System.out.println("Designing car Tyre");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing car Tyre");
    }
}
