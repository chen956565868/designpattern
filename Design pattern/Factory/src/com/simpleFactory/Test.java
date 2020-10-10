package com.simpleFactory;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字A");
        int numA = scanner.nextInt();
//        System.out.println("请输+ — * /");
//        String opera = scanner.next();
        System.out.println("请输入数字B");
        int numB = scanner.nextInt();
        Operation operation = OperationFactory.createOperate("/");
        double result = operation.GetResult(numA, numB);
        System.out.println("结果是："+result);
    }
}
