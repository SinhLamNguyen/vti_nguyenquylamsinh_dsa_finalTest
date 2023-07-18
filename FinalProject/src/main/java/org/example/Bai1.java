package org.example;

public class Bai1 {
    public static void main(String[] args) {
        String s = "Abcd1131234@#($@&^@%";
        System.out.println("Mảng gốc: " + s);
        System.out.println("Mảng đã bỏ kí tự đặc biệt: " + loaiBoKiTuDacBiet(s));
    }

    static String loaiBoKiTuDacBiet(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
        if (Character.isLetterOrDigit(c)) {
            result += c;
        }
    }
        return result;
}
}
