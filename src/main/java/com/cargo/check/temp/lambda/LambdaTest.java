package com.cargo.check.temp.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author DYB
 * @date 2020年05月14日 14:29
 */
public class LambdaTest {


    public static void main(String[] args) {

        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);

        // 以前的循环方式
        for (String player : players) {
            System.out.print(player + " ; ");
        }

        //lambda表达式
        System.out.println("\n使用lambda表达式:");
        players.forEach((player) -> System.out.print(player + " ; "));

        //使用双冒号操作
        System.out.println("\n使用双冒号:");
        players.forEach(System.out::print);

    }





}
