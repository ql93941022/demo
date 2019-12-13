package com.zeroten.javales.demo.array;

import org.testng.annotations.Test;

import java.util.Arrays;

@Test
public class arrayTest {
    public  void testArrayDeclare(){
        int[] arr1;//推荐写法
        String[] arr2;
        int arr3[];
        String arr4[];
    }
@Test
    public void testFuzhi() {
        int[] arr1 = new int[5];
        System.out.println(Arrays.toString(arr1));
        boolean[] arr2 = new boolean[3];
        System.out.println(Arrays.toString(arr2));
        String[] arr3 = new String[3];
        //System.out.println(arr3);
        System.out.println(Arrays.toString(arr3));
        String[] arr4 = new String[5];
        System.out.println(Arrays.toString(arr4));
        int[] arr5;
        System.out.println();
        arr5 = new int[2];
        System.out.println(Arrays.toString(arr5));
        int[] arr6 = new int[]{1, 2, 3};
        System.out.println("arr6 = " + Arrays.toString(arr6));
        int[] arr7 = {1, 2, 3};
        System.out.println("arr7 = " + Arrays.toString(arr7));
        String arr8[] = {"字符串1", null, "字符串2", " "};
        System.out.println("arr8 = " + Arrays.toString(arr8));
        Integer[] arr9 = {2, 9, 7, null, 0,5 };
        System.out.println("arr9 = " + Arrays.toString(arr9));
    }
}

