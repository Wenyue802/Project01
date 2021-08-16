package com.atguigu.bean;

public class PrimeNumberTest2 {
    public static void main(String[] args) {
        int count = 0; //计算质数的个数
        boolean isPrime = true; //标识i是否被j除尽
        long start = System.currentTimeMillis(); //开始时间
        for (int i = 2; i <= 100000; i++) { //遍历100000以内的自然数（1既不是质数也不是合数）
            //优化二：对是质数的自然数有效
            for (int j = 2; j <= Math.sqrt(i); j++) { //j拿去除i
                if(i % j == 0) { //i被j除尽
                    isPrime = false;
                    break; //优化一：对非质数的自然数有效
                }
            }
            if(isPrime) {
                count++;
            }
            isPrime = true;
        }
        long end = System.currentTimeMillis(); //结束时间
        System.out.println("100000以内的质数个数为；" + count);
        System.out.println("所花费的时间为：" + (end - start));
    }
}
