package org.example;

public class Bai3_3 {
    public static void main(String[] args) {
        int A[] = {1,23,4,5,6,78,8,2,32,2,32,432,32,234,432,1,432,324};
        for (int i=0; i< A.length; i++) {
            if (isSoNguyenTo(A[i])) {
                System.out.println("Số nguyên tố " + A[i] + " ở vị trí " + (i+1));
            }
        }
    }
    static boolean isSoNguyenTo (int a) {
        if (a<2)
            return false;
        for (int i=2; i<=Math.sqrt(a); i++) {
            if (a%i==0)
                return false;
        }
        return true;
    }
}

