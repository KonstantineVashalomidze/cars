package com.learning;

public class SportEngine implements Engine {

    @Override
    public int accelerate(int weight, int oldSpeed){
        return oldSpeed + (10_000 / weight) * 10;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }



}
