package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式

        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素
        map.put("尹志平", "小龙女");
        map.put("郭靖", "穆念慈");
        map.put("欧阳克", "黄蓉");

        //3.通过键找值
        //3.1获取所有的键，把这些键放到一个单列集合当中
        Set<String> keys = map.keySet();
        //3.2遍历单列集合，得到每一个键
        /*for (String key : keys) {
            System.out.println(key);
            //3.3 利用map集合中的键获取对应的值 get
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }*/

        /*Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key);
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }*/

        keys.forEach(key -> System.out.println(key + " = " + map.get(key)));



    }
}
