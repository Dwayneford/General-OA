package com.cargo.check.DesignPattern.StructuralDesigMode.BuilderPattern;

/**
 * @author DYB
 * @date 2020年05月12日 19:28
 */
public class VegBurger extends Burger {
    @Override
    public double price() {
        return 25.00;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
