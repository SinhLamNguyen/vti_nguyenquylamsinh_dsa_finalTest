package org.example;

import java.util.Arrays;

public class Bai4_1 {
    public static void main(String[] args) {
        int A[] = {100, 2130, 3, 123, 3, 54, 6, 1, 2111, 1, 1, 1, 1, 1, 1, 45, 5, 465, 46, 1234, 54353};
        System.out.print(sapXep(A));

    }

    static String sapXep(int[] a) {
        for(int i=0; i<a.length-1; i ++) {
            for (int j=i+1; j<a.length-1; j++) {
                if (a[i] % 2 == 0 && a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return Arrays.toString(a);
        // do phuc tap cua thuat toan: O(n^2)
    }
}
