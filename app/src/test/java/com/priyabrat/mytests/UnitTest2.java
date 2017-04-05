package com.priyabrat.mytests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.assertEquals;

/**
 * Created by PriyabratP on 05-04-2017.
 * Expected Exception Test
 */

public class UnitTest2 {

    @BeforeClass
    public static void onBeforeClass(){
        System.out.println("BeforeClass");
    }


    @AfterClass
    public static void onAfterClass(){
        System.out.println("AfterClass");
    }

    @Before
    public void onBeforeTest() {
        System.out.println("Before");
    }

    @After
    public void onAfterTest(){
        System.out.println("After");
    }

    @Test
    public void onTest1(){
        System.out.println("Test1");
    }

    @Test
    public void onTest2(){
        System.out.println("Test2");
    }
}
