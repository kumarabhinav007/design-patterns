package org.design.pattern.strategy;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    public void display() {
        System.out.println("I am a Rubber Duck");
    }
}
