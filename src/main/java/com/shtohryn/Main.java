package com.shtohryn;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);
        concreteCommand.execute();
    }
}
