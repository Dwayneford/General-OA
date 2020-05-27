package com.cargo.check.DesignPattern.StructuralDesigMode.BuilderPattern;

/**
 * @author DYB
 * @date 2020年05月12日 19:40
 */
public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal ;
    }

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();


        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("vegMeal:");
        vegMeal.showItems();
        System.out.println("Total cost :"+vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("nonVegMeal:");
        nonVegMeal.showItems();
        System.out.println("Total cost :"+nonVegMeal.getCost());


    }


}
