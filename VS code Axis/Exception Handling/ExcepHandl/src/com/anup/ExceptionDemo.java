package com.anup;

public class ExceptionDemo {
    
    public void demo1(){
        System.out.println("Hello, World!");

        int op1 = 10;
        int op2 = 0;

        // addition op
        int res1 = op1 + op2;
        System.out.println("Addition "+ res1);

        // subtraction
        int res2 = op1 - op2;
        System.out.println("Subtraction "+ res2);

        // multiplication
        int res3 = op1 * op2;
        System.out.println("Multiplication "+ res3);

        // division
        int res4 = op1 / op2; // 10/0
        System.out.println("Division "+ res4);
    }
    public void demo2(){
        int[] arr={23,75,84};
        System.out.println(arr[5]);
    }
    public void demo3(){
        String str=null;
        str.length();
    }
    public void demo4(){
        // Class.forName("abc");
    }
}
