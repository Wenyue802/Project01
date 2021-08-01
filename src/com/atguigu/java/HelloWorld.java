package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

public class HelloWorld {
    private static final Customer CUSTOMER = new Customer();
    public static final  int NUM = 1;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] arr = new String[]{"Alice", "Barbara", "Claire"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        //未声明泛型，默认为Object
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("CUSTOMER = " + CUSTOMER);
        System.out.println(NUM);
    }
}
