package com.priyabrat.mytests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.assertEquals;

/**
 * Created by PriyabratP on 05-04-2017.
 * Ignore Annotation
 */

public class UnitTest3 {

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
    @Ignore("Not Now")
    public void onTestOne(){
        System.out.println("onTestOne");
    }

    @Test
    public void onTestAnother(){
        System.out.println("onTestAnother");
    }
}
