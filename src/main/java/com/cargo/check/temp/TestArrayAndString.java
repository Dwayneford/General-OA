package com.cargo.check.temp;

/**
 * @author DYB
 * @date 2020年05月26日 16:36
 */
public class TestArrayAndString {

    public static void main(String[] args) {
        boolean flag = true ;
        String boxNo[] = {"asdfasdfas","asdfasdfas"};


//        if(boxNo.length>=2){
//            for (int i = 0; i < boxNo.length; i++) {
//                for (int j = i+1; j < boxNo.length ;j++) {
//                    System.out.println(i+"个boxNo[i]="+boxNo[i]+","+j+"个boxNo[j]="+boxNo[j]);
//                    if(!boxNo[i].equals(boxNo[j])){
//                        System.out.println("不相等");
//                        flag = false ;
//
//                    }else {
//                        System.out.println("相等");
//                    }
//                }
//            }
//        }
//        System.out.println("flag="+flag);
//        if(true){
//
//        }
        System.out.println("asdfasdfas"=="asdfasdfas");
        System.out.println("==:"+boxNo[0]==boxNo[1]);
        System.out.println("equals:"+boxNo[0].equals(boxNo[1]));
//数组是引用数据类型!!!
    }







}
