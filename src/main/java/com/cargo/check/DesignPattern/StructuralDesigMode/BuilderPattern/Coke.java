package com.cargo.check.DesignPattern.StructuralDesigMode.BuilderPattern;

/**
 * @author DYB
 * @date 2020年05月12日 19:31
 */
public class Coke extends Drink {
    @Override
    public double price() {
        return 5;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
