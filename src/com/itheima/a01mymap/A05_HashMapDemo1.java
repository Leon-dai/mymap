package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class A05_HashMapDemo1 {
    public static void main(String[] args) {
        /*
            需求：创建一个HashMap集合，键是学生对象（Student），值是籍贯（String）。
            存储三个键值对元素，并遍历
            要求：同姓名，同年龄认为是同一个学生
         */

        //1.创建HashMap的对象
        HashMap<Student, String> hm = new HashMap<>();

        //2.创建三个学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("wangwu", 25);

        hm.put(s1, "北京");
        hm.put(s2, "上海");
        hm.put(s3, "长沙");
        hm.put(s4, "成都");

        Set<Student> keys = hm.keySet();
        /*for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key + " = " + value);
        }*/

        /*Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }*/

        hm.forEach((key, value) -> System.out.println(key + " = " + value));

//        System.out.println(hm);
    }
}
