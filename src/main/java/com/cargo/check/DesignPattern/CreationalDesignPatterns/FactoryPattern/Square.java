package com.cargo.check.DesignPattern.CreationalDesignPatterns.FactoryPattern;

/**
 * @author DYB
 * @date 2020年05月12日 18:23
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square method : draw()");
    }
}
