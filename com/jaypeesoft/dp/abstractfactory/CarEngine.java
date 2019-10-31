package com.jaypeesoft.dp.abstractfactory;

public class CarEngine implements Engine {
    @Override
    public void design() {
        System.out.println("Designing car Engine");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing car Engine");
    }

    @Override
    public void test() {
        System.out.println("Testing car Engine");
    }
}
