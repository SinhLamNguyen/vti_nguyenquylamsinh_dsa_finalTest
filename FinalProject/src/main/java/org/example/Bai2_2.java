package org.example;

import java.util.Stack;

public class Bai2_2 {
    public static void main(String[] args) {
        int n = 123432;
        System.out.println(n);
        inChuSo(n);
    }
    static void inChuSo (int a) {
        Stack<Integer> stack = new Stack<>();
        while (a>0) {
            int d = a%10;
            a = a/10;
            stack.push(d);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
