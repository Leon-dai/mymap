package com.itheima.a04mytreemap;

import java.util.Map;
import java.util.TreeMap;

public class A02_TreeMapDemo2 {
    public static void main(String[] args) {
        /*
            TreeMap集合：基本应用
            需求2：
                键：学生对象
                值：籍贯
                要求：按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。
         */
        TreeMap<Student, String> tm = new TreeMap<>();

        Student s1 = new Student("zhangsan", 22);
        Student s2 = new Student("lisi", 22);
        Student s3 = new Student("wangwu", 22);
        Student s4 = new Student("zhaoliu", 20);

        tm.put(s1, "北京");
        tm.put(s2, "上海");
        tm.put(s3, "成都");
        tm.put(s4, "武汉");

        for (Map.Entry<Student, String> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }

    }
}
