
package com.designpattern.tutorial.decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }

    public double cost() {
        return 2.44;
    }
}
