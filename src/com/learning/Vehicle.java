package com.learning;

public class Vehicle {
    Engine engine;
    int weight;
    int speed;

    String name;

    public Vehicle(String name, Engine engine, int speed, int weight){
        this.engine = engine;
        this.name = name;
        this.speed = speed;
        this.weight = weight;

    }

    public void test(){
        var seconds = 0;

        while (true){
            this.speed = this.engine.accelerate(this.weight, this.speed);
            seconds++;
            if (this.speed >= 100){
                System.out.println("Engine " + this.engine.toString() + "took " + seconds + " to accelerate 0-100");
                break;
            }

        }

    }

}
