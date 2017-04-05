package com.priyabrat.mytests;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Created by PriyabratP on 05-04-2017.
 */

@RunWith(value = Parameterized.class)
public class ParameterizedTest {

    private int num1;
    private int num2;
    private int expected;

    public ParameterizedTest(int num1,int num2,int expected){
        this.num1 = num1;
        this.num2 = num2;
        this.expected = expected;
    }
}
