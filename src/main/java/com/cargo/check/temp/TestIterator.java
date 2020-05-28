package com.cargo.check.temp;

import java.util.*;

/**
 * @author DYB
 * @date 2020年05月28日 14:23
 */
public class TestIterator {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("banana");



        System.out.println("list.forEach(a-> System.out.println(a));=");
        list.forEach(a-> System.out.println(a));

        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()){
            System.out.println("it2.next()="+it2.next());
        }

        List<String> linkedlist = new LinkedList<String>();
        linkedlist.add("apple");
        linkedlist.add("pear");
        linkedlist.add("banana");

        for (String o : linkedlist) {
            System.out.println("linkedlist="+o);
        }

        for (Iterator<String> it3 = list.iterator(); it3.hasNext();) {
            System.out.println("it3.next()="+it3.next());
        }

        Set set = new HashSet();
        set.add("apple");
        set.add("pear");
        set.add("banana");


        for (Iterator itset =set.iterator(); itset.hasNext();) {
            System.out.println("itset.next()="+itset.next());
        }

        Map<String , Object> hashMap = new HashMap();
        hashMap.put("1", "zhangsan");
        hashMap.put("2", "list");
        hashMap.put("3", "ascvg");
        hashMap.put("4", "fhjfgnm");
        hashMap.put("5", "zh467yjsn");


        for (Map.Entry entry: hashMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }




    }



}
