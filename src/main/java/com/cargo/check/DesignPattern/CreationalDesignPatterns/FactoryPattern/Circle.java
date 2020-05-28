package com.cargo.check.DesignPattern.CreationalDesignPatterns.FactoryPattern;

/**
 * @author DYB
 * @date 2020年05月12日 18:26
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle method : draw()");
    }
}
