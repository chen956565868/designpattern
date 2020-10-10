package com.simpleFactory;

/*
    加法类
 */
public class OperationAdd extends Operation {
    @Override
    public double GetResult(int numA, int numB) {
        return numA+numB;
    }
}
