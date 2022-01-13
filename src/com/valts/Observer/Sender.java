package com.valts.Observer;

import java.util.ArrayList;

public class Sender {
    private ArrayList<Receiver> receivers = new ArrayList();

    public Sender() {
    }

    public void insertReciever(Receiver reciever) {
        this.receivers.add(reciever);
    }

    public void send(){
        for (Receiver receiver : this.receivers) {
            receiver.receive();
        }
    }
}
