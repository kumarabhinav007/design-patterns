package org.design.pattern.strategy;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I am a Red Head Duck");
    }
}
