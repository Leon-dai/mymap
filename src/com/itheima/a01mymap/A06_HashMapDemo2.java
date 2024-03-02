package com.itheima.a01mymap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class A06_HashMapDemo2 {
    public static void main(String[] args) {
        /*
            统计投票人数
            某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是（A、B、C、D）,
            每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
         */
        //1.需要先让同学们投票

        //定义一个数组，存储4个景点
        String[] arr = {"A", "B", "C", "D"};
        //利用随机数模拟80个同学的投票，并把投票的结果存储起来
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
//            System.out.println(arr[index]);
            list.add(arr[index]);
        }

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }
        int max = 0;
        String res = "";
        for (String key : map.keySet()) {
            if(map.get(key) > max){
                max = map.get(key);
                res = key;
            }
        }
        System.out.println(map);
        System.out.println(res);
    }
}
