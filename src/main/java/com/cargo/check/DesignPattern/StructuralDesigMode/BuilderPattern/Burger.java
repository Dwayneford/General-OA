package com.cargo.check.DesignPattern.StructuralDesigMode.BuilderPattern;

/**
 * @author DYB
 * @date 2020年05月12日 19:24
 */
public abstract class Burger implements Item {
    @Override
    public abstract double price() ;

    @Override
    public Packing paching() {
        return new Wrapper();
    }
}
