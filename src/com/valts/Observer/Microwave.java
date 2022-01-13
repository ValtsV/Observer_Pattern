package com.valts.Observer;

public class Microwave implements Receiver {
    public Microwave(){};

    @Override
    public void receive(){
        System.out.println("Microwave turns on");
    }
}
