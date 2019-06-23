package vct;

import java.util.Arrays;
import java.util.Random;


public class test6 {
    public static void main(String[] args) {
        // 生成10个随机数，保存在数组中
        Random random = new Random();
        int[] array1 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = random.nextInt(100);
        }
        System.out.print("Array1:");
        Arrays.stream(array1).forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 使用数组实用类复制到另一个数组
        int[] array2 = new int[10];
        System.arraycopy(array1, 0, array2, 0, array1.length);
        System.out.print("Array2:");
        Arrays.stream(array2).forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 排序
        Arrays.parallelSort(array2);
        System.out.print("排序后的Array2:");
        Arrays.stream(array2).forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 二叉搜索需要先排序
        System.out.println(array1[5] + "在Array2中的位置：" + Arrays.binarySearch(array2, array1[5]));


    }
}