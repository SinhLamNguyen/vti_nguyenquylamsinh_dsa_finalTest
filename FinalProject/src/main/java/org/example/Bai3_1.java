package org.example;

public class Bai3_1 {
    public static void main(String[] args) {
        int A[] = {1,23,4,5,6,78,8,2,32,2,32,432,32,234,432,1,432,324};
        // in mang goc
        System.out.println("A: ");
        for (int i=0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        // in mang dao nguoc
        daoNguoc(A);
    }
    static void daoNguoc (int[] a) {
        int j = a.length-1;
        for (int i=0; i<a.length/2; i++) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = a[i];
            j--;
        }
        System.out.println("Đảo ngược: ");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
