package org.design.pattern.strategy;

public class Demo {

    public static void main(String args[]) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();

        duck = new DecoyDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehaviour(new FlyRocketPowered());
        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}
