package org.design.pattern.strategy;

public class MuteQuack implements QuackBehaviour {

    public void quack() {
        System.out.println("I can't quack");
    }
}
