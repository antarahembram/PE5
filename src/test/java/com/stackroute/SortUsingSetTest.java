package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SortUsingSetTest {
    private static SortUsingSet sortUsingSet;
    @BeforeClass
    public static void create()
    {
       sortUsingSet=new SortUsingSet();
    }
    @AfterClass
    public static void destroy()
    {
        sortUsingSet=null;
    }
    @Test
    public void getSortedSetTest_ArrayOfString_ArrayList()
    {
        String[] input={"Harry","Olive","Alice","Bluto","Eugene"};
        String[] input2={};
        List<String> sortedOutput=new ArrayList<>();
        sortedOutput.add("Alice");
        sortedOutput.add("Bluto");
        sortedOutput.add("Eugene");
        sortedOutput.add("Harry");
        sortedOutput.add("Olive");
        assertEquals("Error in getSortedSet():",sortedOutput,sortUsingSet.getsortedSet(input));
        assertNull("Error in getSortedSet():Should return Null",sortUsingSet.getsortedSet(input2));

    }
    @Test
    public void getSortedSetTest_ArrayOfString_ArrayList_Failure()
    {
        String[] input={"Harry","Olive","Alice","Bluto","Alice","Eugene"};
        List<String> sortedOutput=new ArrayList<>();
        sortedOutput.add("Alice");
        sortedOutput.add("Alice");
        sortedOutput.add("Bluto");
        sortedOutput.add("Eugene");
        sortedOutput.add("Harry");
        sortedOutput.add("Olive");
        assertNotEquals("Error in getSortedSet(): in Set no repeatation ",sortedOutput,sortUsingSet.getsortedSet(input));
        assertNotNull("Error in getSortedSet(): Should not return null ",sortUsingSet.getsortedSet(input));

    }
}
