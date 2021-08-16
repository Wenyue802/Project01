package com.atguigu.bean;

public class PrimeNumberTest3 {
    public static void main(String[] args) {
        int count = 0;
        long start = System.currentTimeMillis();
        label: for (int i = 2; i <= 100000; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    continue label;
                }
            }
            count++;
        }
        long end = System.currentTimeMillis(); //结束时间
        System.out.println("100000以内的质数个数为；" + count);
        System.out.println("所花费的时间为：" + (end - start));
    }
}
