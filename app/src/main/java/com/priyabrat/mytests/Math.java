package com.priyabrat.mytests;

/**
 * Created by PriyabratP on 05-04-2017.
 */

public class Math {

    public int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
