package org.example;

public class Bai2_1 {
    public static void main(String[] args) {
        int n = 123432;
        System.out.println(laDoiXung(n));
    }
    static boolean laDoiXung (int n) {
        String s = n + "";
        // System.out.println(s);
        int j = s.length()-1;
        boolean check = true;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(j)) {
                check = false;
            }
            j--;
        }
        return check;
    }
}
