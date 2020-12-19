package com.company;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int sum() {
        return a + b;
    }

    public int subtraction() {
        return a - b;
    }

    public int multiplication() {

        if (b < 0) {
            b=Math.abs(b);
            int total = 0;
            for (int i = 0; i < b; i++) {
                total -= a;
            }
            return total;
        }else if (b>0){
            int total = 0;
            for (int i = 0; i < b; i++) {
                total += a;
            }
            return total;
        }else{
            return 0;
        }
    }

    public double division() {
        double result;
        result = (double)a / b;
        return result;
    }
}