package com.cargo.check.DesignPattern.StructuralDesigMode.BuilderPattern;

/**
 * @author DYB
 * @date 2020年05月12日 19:29
 */
public class ChickenBurger extends Burger {
    @Override
    public double price() {
        return 30.00;
    }

    @Override
    public String name() {
        return "ChickenBurger";
    }
}
