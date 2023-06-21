package com.learning;

public class Car extends Vehicle{


    public Car(String name, Engine engine, int speed, int weight){
        super(name, engine, speed, weight);
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }



}
