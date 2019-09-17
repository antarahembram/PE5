package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TwoOrMoreOccurrenceTest {
    private static TwoOrMoreOccurrence twoOrMoreOccurrence;
    @BeforeClass
    public static void create()
    {
        twoOrMoreOccurrence=new TwoOrMoreOccurrence();
    }
    @AfterClass
    public static void destroy()
    {
        twoOrMoreOccurrence=null;
    }
    @Test
    public void getTwoOrMoreOccurrenceTest_StringArray_MapOfStringAndBoolean()
    {
        Map<String, Boolean> output= new HashMap<>();
        output.put("a",true);
        output.put("b",false);
        output.put("c",true);
        output.put("d",false);
        String[] inputList={"a","b","c","d","a","c","c"};
        String[] inputList1={};

        assertEquals("Return true if a  word occurs more than 2 times",output,twoOrMoreOccurrence.getTwoOrMorOccurrence(inputList));
        assertNull("return null",twoOrMoreOccurrence.getTwoOrMorOccurrence(inputList1));
    }
    @Test
    public void getTwoOrMoreOccurrenceTest_StringArray_MapOfStringAndBooleanFailure()
    {
        Map<String, Boolean> output= new HashMap<>();
        output.put("a",true);
        output.put("b",false);
        output.put("c",true);
        output.put("d",false);
        String[] inputList={"a","b","c","d","a","cc"};
        String[] inputList1={"a","b","c","d","a","c","c"};
        assertNotEquals("Consider the input as String Array",output,twoOrMoreOccurrence.getTwoOrMorOccurrence(inputList));
        assertNotNull("Should not return null",twoOrMoreOccurrence.getTwoOrMorOccurrence(inputList1));
    }
}
