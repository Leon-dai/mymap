package com.itheima.a04mytreemap;

import java.util.Comparator;
import java.util.TreeMap;

public class A01_TreeMapDemo1 {
    public static void main(String[] args) {
        /*
            TreeMap集合：基本应用
            需求1:
                键：整数表示id
                值：字符串表示商品名称
                要求：按照id的升序排列、按照id的降序排列
         */
        TreeMap<Integer, String> tm = new TreeMap<>((a, b) -> b - a);//a表示当前要添加的元素，b表示已经在红黑树中存在的元素
        tm.put(5, "娃哈哈");
        tm.put(1, "康师傅");
        tm.put(2, "白象");
        tm.put(4, "健力宝");
        tm.put(3, "冰露");


        System.out.println(tm);
    }
}
