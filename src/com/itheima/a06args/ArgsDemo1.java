package com.itheima.a06args;

public class ArgsDemo1 {
    public static void main(String[] args) {
        //JDK5
        //可变参数
        //作用：在形参中接收多个数据
        //格式：数据类型...参数名称
        //int...args
        //注意事项：
        //1.在方法的形参中最多只能写一个可变参数
        //可变参数，理解为一个大胖子，有多少吃多少
        //2.在方法当中，如果除了可变参数以外，还有其他的形参，那么可变参数要写在最后
        int sum = getSum(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(sum);
    }

    //底层：
    //可变参数底层就是一个数组
    //只不过不需要我们自己创建了，Java会帮我们创建好
    public static int getSum(int... args) {
        System.out.println(args);//[I@776ec8df
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
