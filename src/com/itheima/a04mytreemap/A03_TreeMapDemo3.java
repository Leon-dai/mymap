package com.itheima.a04mytreemap;

import java.util.*;
import java.util.function.BiConsumer;

public class A03_TreeMapDemo3 {
    public static void main(String[] args) {
        String str = "aababcabcdabcbbde";
        TreeMap<Character, Integer> tm = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            tm.put(c, tm.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
//        tm.forEach((key, value) -> sb.append(key).append("(").append(value).append(")"));
        StringJoiner sj = new StringJoiner("", "", "");
        tm.forEach((key, value) -> sj.add(key + "").add("(").add(value + "").add(")"));
        System.out.println(sj.toString());
    }
}