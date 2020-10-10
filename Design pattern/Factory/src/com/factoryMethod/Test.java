package com.factoryMethod;

import com.simpleFactory.OperationFactory;

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
        AddFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        double result = operation.GetResult(numA, numB);
        System.out.println("结果是："+result);
    }
}
