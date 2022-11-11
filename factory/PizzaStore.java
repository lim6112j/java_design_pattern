package com.designpattern.tutorial.factory;

public abstract class PizzaStore {
    Pizza pizza;

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    };

    abstract Pizza createPizza(String type);
}
