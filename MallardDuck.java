package com.designpattern.tutorial;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("mallard duck");
    }

}
