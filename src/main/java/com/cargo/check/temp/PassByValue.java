package com.cargo.check.temp;

/**
 * @author DYB
 * @date 2020年05月28日 15:17
 */
public class PassByValue {

    public static void main(String[] args) {

        int intA = 10 ;
        String str ="string";
        StringBuffer strBF = new StringBuffer("stringbuffer");
        StringBuffer strNewBF = new StringBuffer("stringbufferNew");
        StringBuilder strNewBD = new StringBuilder("");

        System.out.println("原始值:intA="+intA+"; str="+str+"; strBF="+strBF+"; strNewBF"+strNewBF);

        changeInt(intA);
        changeStr(str);
        changeStr(strBF);
        changeNewStr(strNewBF);
        System.out.println("方法改变值:intA="+intA+"; str="+str+"; strBF="+strBF+"; strNewBF"+strNewBF);
    }
    //此处传递的是基本数据类型,传的是该值得一个副本,副本改变不影响原值
    static  void changeInt(int oringin){
        oringin=1;
    }
    //此处传递的是引用数据类型,传递的是该对象的地址,但string是不可变字符串,改变的时候会new一个string,并指向它.原值不变
    static void changeStr(String oringinStr){
        oringinStr+="#";
    }
    //此处传递的是引用数据类型,传递的是该对象的地址,方法会根据地址,找到对象,并改变它
    static void changeStr(StringBuffer oringinStrB){
        oringinStrB=oringinStrB.append("#");
    }
    //此处说明的Java是值传递而不是引用传递,因为方法内改变了指向,但外面的值说明指向没变.
    static void changeNewStr(StringBuffer oringinStr){
        oringinStr = new StringBuffer("stringbuffer#");
    }













}
