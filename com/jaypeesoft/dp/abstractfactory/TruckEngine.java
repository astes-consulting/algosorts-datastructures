package com.jaypeesoft.dp.abstractfactory;

public class TruckEngine implements Engine {
    @Override
    public void design() {
        System.out.println("Designing truck Engine");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing truck Engine");
    }

    @Override
    public void test() {
        System.out.println("Testing truck Engine");
    }
}
