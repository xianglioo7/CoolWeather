package com.xiangli.coolweather;

/**
 * Created by Administrator on 2017/2/23.
 */

public class TestClass {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public TestClass(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
