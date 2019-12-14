package com.zeroten.javales.demo.array;

import org.testng.annotations.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

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
    @Test
    public void test遍历数组(){
        //用三种方式遍历数组 Integer[] arr = {1, 2, 3, 4, 5}
        Integer[] arr = {1, 2, 3, 4, 5};
        //for 循环
        for(int i = 0;i < arr.length;i++){
            //System.out.println("下标：" + i + " , 存放的值是：" + arr[i]);
            System.out.println(String.format("下标：%d , 存放的值是：%d", i , arr[i]));
        }
        //for each
        int i = 0;
        for (int val : arr){
            System.out.println("第" + i + "次取到" + arr[i]);
            i++;
        }
        Arrays.asList(arr).forEach(val -> {
            System.out.println("值是：" + val);
        });
    }
    @Test
    public void test数组拷贝(){
        //工具类：copyOf  copyOfRange
        //底层方法：system.arraycopy
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {6, 7, 8, 9,10};
        //拷贝数组 arr1 的前 3 个元素生成一个新的数组
        Integer[] arr3 = new Integer[3];
        arr3[0] = arr1[0];
        arr3[1] = arr1[1];
        arr3[2] = arr1[2];
        System.out.println("arr3 = " + Arrays.toString(arr3));

        //copyOf(数组,要拷贝的长度); 数组的长度从0开始
        Integer arr4[] = Arrays.copyOf(arr1,3);
        System.out.println("arr4 = " + Arrays.toString(arr4));

        // 拷贝数组 arr1 的后 3 位元素
        //copyOfRange(要拷贝的数组,从哪里开始,到哪里);
        Integer arr5[] = Arrays.copyOfRange(arr1,arr1.length-3,arr1.length);
        System.out.println("arr5 = " + Arrays.toString(arr5));

        // 拷贝数组 arr1 的第 1 位到第 3 位的元素（不包括第 3 位）
        Integer arr6[] = Arrays.copyOfRange(arr1,0,2);
        System.out.println("arr6 = " + Arrays.toString(arr6));

        // 拷贝数组 arr2 的后 3 位到 arr1 到后 3 位
        System.arraycopy(arr2,arr2.length-3, arr1,arr1.length-3,3);
        System.out.println("arr1 = " + Arrays.toString(arr1));
    }
    @Test
    public void testFill数组填充(){
        // Arrays.fill
        // 定义⼀个⼤⼩为 10 的 int 数组，
        // 并将数组全部初始化为指定的值 5，打印数组；
        // 然后将数组后 3 为赋值为 3，再次打印数组
        int[] arr = new int[10];
//        for (int i = 0;i < arr.length;i++){
//            arr[i] = 5;
//        }
        Arrays.fill(arr,5);
        System.out.println(Arrays.toString(arr));
//        for(int  i = arr.length -3;i < arr.length;i++  ){
//            arr[i] = 3;
//        }
        Arrays.fill(arr,arr.length - 3,arr.length,3);
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void testSort数组排序(){
        // Arrays.sort
        // 定义一个大小为 100 的 int 数组，
        // 随机给每⼀位赋值⼀个 0 ~ 100 之间的数值，
        // 然后对该数组进⾏排序并打印排序结果
        int[] arr = new int[100];
        for(int i = 0;i < arr.length;i++){
            arr[i] = new Random().nextInt(100);
        }
        System.out.println("排序前：" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));
    }
}

