package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class NumberOfCountsTest {
    private static NumberOfCounts numberOfCounts;
    @BeforeClass
    public static void create()
    {
        numberOfCounts=new NumberOfCounts();
    }
    @AfterClass
    public static void destroy()
    {
        numberOfCounts=null;
    }
    @Test
    public void getCountTest_String_MapOfWordAndCount()
    {
        Map<String,Integer> output= new HashMap<>();
        output.put("one",5);
        output.put("two",2);
        output.put("three",2);
        assertEquals("Return occurrence of each word",output,numberOfCounts.getCount("one one -one___two,,three,one @three*one?two"));
    }
    @Test
    public void getCountTest_String_MapOfWordAndCount_Failure()
    {
        Map<String,Integer> output= new HashMap<>();
        output.put("-one",5);
        output.put("two*",2);
        output.put("three",2);
        assertNotEquals("Should not contain any special characters",output,numberOfCounts.getCount("one one -one___two,,three,one @three*one?two"));
        assertNotNull("Should not return null",numberOfCounts.getCount("one one -one___two,,three,one @three*one?two"));

    }
}
