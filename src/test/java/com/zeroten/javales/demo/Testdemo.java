package com.zeroten.javales.demo;

import com.sun.webkit.dom.DocumentImpl;
import org.testng.annotations.Test;

@Test
public class Testdemo {
    public void test(){
    System.out.println("helloWorld");
    }
    @Test
    public  void  test练习(){
        Integer num1 = 127;
        Integer num2 = 127;
        System.out.println(num1 == num2); //true

        Integer num3 = 128;
        Integer num4 = 128;
        System.out.println(num3 == num4);//false

        Integer num5 = 127;
        Integer num6 = new Integer(127);
        System.out.println(num5 == num6); //false

        int num7 = 127;
        Integer num8 =127;
        System.out.println(num7 == num8);//true

        int num9 = 128;
        Integer num10 = 128;
        System.out.println(num9 == num10);//true

        Double d1 = 127D;
        Double d2 = 127D;
        System.out.println(d1 == d2);//false

        Double d3 = 128D;
        Double d4 = 128D;
        System.out.println(d3 == d4);//false

        System.out.println(2 * 0.1 == 0.2);//true
        System.out.println(3 * 0.1 == 0.3);//false
    }
}


