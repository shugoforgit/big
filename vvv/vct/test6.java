package vct;

import java.util.Arrays;
import java.util.Random;


public class test6 {
    public static void main(String[] args) {
        // ����10���������������������
        Random random = new Random();
        int[] array1 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = random.nextInt(100);
        }
        System.out.print("Array1:");
        Arrays.stream(array1).forEach(i -> System.out.print(i + " "));
        System.out.println();

        // ʹ������ʵ���ิ�Ƶ���һ������
        int[] array2 = new int[10];
        System.arraycopy(array1, 0, array2, 0, array1.length);
        System.out.print("Array2:");
        Arrays.stream(array2).forEach(i -> System.out.print(i + " "));
        System.out.println();

        // ����
        Arrays.parallelSort(array2);
        System.out.print("������Array2:");
        Arrays.stream(array2).forEach(i -> System.out.print(i + " "));
        System.out.println();

        // ����������Ҫ������
        System.out.println(array1[5] + "��Array2�е�λ�ã�" + Arrays.binarySearch(array2, array1[5]));


    }
}