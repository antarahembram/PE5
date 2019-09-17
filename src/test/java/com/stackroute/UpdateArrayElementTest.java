package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateArrayElementTest {
    private static UpdateArrayElement updateArrayElement;
    @BeforeClass
    public static void create()
    {
        updateArrayElement=new UpdateArrayElement();
    }
    @AfterClass
    public static void destroy()
    {
        updateArrayElement=null;
    }
    @Test
    public void getUpdatedArrayTest_ArrayToBeModifedModifyTo_UpdatedArrayList()
    {
        List<String> input=new ArrayList<String>();
        input.add("Apple");
        input.add("Kiwi");
        input.add("Grape");
        input.add("Berry");
        List<String> output=new ArrayList<String>();
        output.add("Apple");
        output.add("Kiwi");
        output.add("Mango");
        output.add("Berry");
        assertEquals("Update the array as per given Value",output,updateArrayElement.getUpdatedArray(input,"Grape","Mango"));
    }
    @Test
    public void getUpdatedArrayTest_ArrayToBeModifedModifyTo_UpdatedArrayList_Failure()
    {
        List<String> input=new ArrayList<String>();
        input.add("Apple");
        input.add("Kiwi");
        input.add("Grape");
        input.add("Berry");
        List<String> output=new ArrayList<String>();
        output.add("Apple");
        output.add("Kiwi");
        output.add("Grape");
        output.add("Berry");
        assertNotEquals("Array is not being modified",output,updateArrayElement.getUpdatedArray(input,"Grape","Mango"));
        assertNotNull("Should not retrun null",updateArrayElement.getUpdatedArray(input,"Grape","Mango"));

    }

}
