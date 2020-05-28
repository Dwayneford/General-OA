package com.cargo.check.DesignPattern.StructuralDesigMode.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DYB
 * @date 2020年05月12日 19:33
 */
public class Meal {
    private List<Item> items = new ArrayList<>();
    public void addItem(Item item){
        items.add(item);
    }

    public double getCost(){
        double cost =0.00;
        for (Item item : items) {
            cost+=item.price();
        }
        return cost;
    }

    public void showItems (){
        for (Item item : items) {
            System.out.println(item.name()+",Packing="+item.paching().pack()+",Price="+item.price());
        }

    }

}
