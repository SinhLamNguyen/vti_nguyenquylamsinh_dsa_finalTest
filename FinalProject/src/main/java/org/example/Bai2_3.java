package org.example;

import java.util.Stack;

public class Bai2_3 {
    public static void main(String[] args) {
        int n = 123432;
        System.out.println(n);
        System.out.println("Số nhị phân: " + decimal(n));

    }
    static String decimal (int n) {
        Stack<Integer> stack = new Stack<>();
        while (n>0) {
            int r = n%2;
            n = n/2;
            stack.push(r);
        }
        String result = "";
        while (!stack.isEmpty()) {
            int value = stack.pop();
            result = result + value;
        }
        return result;
    }
}
