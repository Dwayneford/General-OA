package com.cargo.check.DesignPattern.CreationalDesignPatterns.FactoryPattern;

/**
 *
 * 工厂模式,通过输入类名返回与之对应的对象
 * @author DYB
 * @date 2020年05月12日 18:13
 */
public class ShapeFactory {
    /**
     *
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType){
        if (shapeType == null) {
            return null ;
        }else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();
    }


}
