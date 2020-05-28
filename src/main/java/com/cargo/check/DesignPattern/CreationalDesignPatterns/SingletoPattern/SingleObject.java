package com.cargo.check.DesignPattern.CreationalDesignPatterns.SingletoPattern;

/**
 * @author DYB
 * @date 2020年05月12日 18:45
 */
public class SingleObject {
    private static SingleObject singleObject = new SingleObject();
    private SingleObject() {
    }
    public static SingleObject getSingleObject(){
        return singleObject;
    }

}

/**
 * 懒汉模式,线程不安全
 */
class LanHan {
    private static LanHan lanHan ;
    private LanHan (){}

    public static LanHan getLanHan(){
        if (lanHan == null) {
            return new LanHan();
        }
        return lanHan ;
    }

}

/**
 * 懒汉模式,线程安全
 */
class LanHanThread {
    private static LanHanThread lanHanThread ;
    private LanHanThread(){}
    public static synchronized LanHanThread getLanHanThread (){
        if (lanHanThread == null) {
            lanHanThread =  new LanHanThread();
        }
        return lanHanThread ;

    }
}

//饿汉式,多线程安全
class EHan {
    private static EHan eHan =new EHan();
    private EHan(){}
    public static EHan getEHan(){
        return eHan;
    }
}


//双重校验锁double-checked locking,多线程依然保持高性能
class DCL {
    private volatile static DCL dcl ;
    private DCL(){}
    public static DCL getDcl(){
        if (dcl == null) {
            synchronized (DCL.class){
                if (dcl == null) {
                    dcl = new DCL();
                }
            }
        }
        return dcl ;
    }
}











