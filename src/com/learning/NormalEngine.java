package com.learning;

public class NormalEngine implements Engine {


    @Override
    public int accelerate(int weight, int oldSpeed){
        return oldSpeed + (10_000 / weight) * 5;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }

}

