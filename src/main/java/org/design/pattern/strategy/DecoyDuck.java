package org.design.pattern.strategy;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    public void display() {
        System.out.println("I am a Decoy Duck");
    }
}
