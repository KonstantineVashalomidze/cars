package com.learning;

public class Bus extends Vehicle {



    public Bus(String name, Engine engine, int speed, int weight){
        super(name, engine, speed, weight);
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }

}
