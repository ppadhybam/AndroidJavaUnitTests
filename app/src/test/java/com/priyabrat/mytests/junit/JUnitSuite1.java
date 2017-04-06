package com.priyabrat.mytests.junit;

import com.priyabrat.mytests.Person;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.assertEquals;

/**
 * Created by PriyabratP on 06-04-2017.
 */

public class JUnitSuite1 {

    @BeforeClass
    public static void onBeforeClass(){
        System.out.println("BeforeClass1");
    }


    @AfterClass
    public static void onAfterClass(){
        System.out.println("AfterClass1");
    }

    @Before
    public void onBeforeTest() throws ParseException {
        System.out.println("Before1");

    }

    @After
    public void onAfterTest(){
        System.out.println("After1");
    }

    @Test
    public void onTest1(){
        System.out.println("Test1");
    }
}
