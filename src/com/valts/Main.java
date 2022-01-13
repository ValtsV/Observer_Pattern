package com.valts;

import com.valts.Observer.Microwave;
import com.valts.Observer.Sender;

public class Main {

    public static void main(String[] args) {
        Microwave microwave = new Microwave();

        Sender sender = new Sender();

        sender.insertReciever(microwave);

        sender.send();
    }
}
