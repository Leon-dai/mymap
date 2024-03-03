package com.itheima.a01mymap;

import java.util.LinkedHashMap;

public class A07_LinkedHashMapDemo3 {
    public static void main(String[] args) {
        //1.创建集合
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        //2.添加元素
        lhm.put("a", 123);
        lhm.put("a", 111);
        lhm.put("b", 456);
        lhm.put("c", 789);

        //3.打印集合
        System.out.println(lhm);
    }
}
