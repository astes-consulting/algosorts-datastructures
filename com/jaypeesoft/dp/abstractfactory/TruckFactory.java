package com.jaypeesoft.dp.abstractfactory;

public class TruckFactory extends Factory {

    TruckFactory() {}

    @Override
    public Engine getEngine() {
        return new TruckEngine();
    }

    @Override
    public Tyre getTyre() {
        return new TruckTyre();
    }
}
