package org.example;

public class Bai3_2 {
    public static void main(String[] args) {
        int A[] = {1,23,4,5,6,78,8,2,32,2,32,432,32,234,432,1,432,324};
        daoNguocsoChan(A);
    }
    static void daoNguocsoChan (int[] a) {
        int j = a.length-1;
        for (int i=0; i<a.length/2; i++) {
            if (a[i]%2==0 || a[j]%2==0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = a[i];
                j--;
            }
        }
        System.out.println("Đảo ngược: ");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
