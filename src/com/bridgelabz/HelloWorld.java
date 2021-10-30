package com.bridgelabz;

public class HelloWorld {
    public static int addNum(int num1, int num2){
        return num1 + num2;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        int addResult = addNum(3, 2);
        System.out.println("addition result--->" + addResult);
    }
}
