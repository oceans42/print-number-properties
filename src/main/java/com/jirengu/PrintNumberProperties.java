package com.jirengu;

public class PrintNumberProperties {
    public static void main(String[] args) {
        System.out.println(printNumberProperties(10));
        System.out.println(printNumberProperties(7));
        System.out.println(printNumberProperties(10001));
        System.out.println(printNumberProperties(2));
    }

    public static String printNumberProperties(int num) {
        // 请利用运算符相关知识按下列要求补全代码：
        // 1. 如果该数是偶数，则返回"Even"
        // 2. 如果该数是奇数，则返回"Odd"
        // 3. 如果该数同时是偶数并且大于10，返回"Even and Large"
        // 4. 如果该数同时是奇数并且大于10，返回"Odd and Large"
        return num % 2 == 0 ? (num > 10 ? "Even and Large" : "Even")
                : (num > 10 ? "Odd and Large" : "Odd");
    }
}
