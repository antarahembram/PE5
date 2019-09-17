package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyMapValueTest {
    private static ModifyMapValue modifyMapValue;
    @BeforeClass
    public static void create()
    {
        modifyMapValue=new ModifyMapValue();
    }
    @AfterClass
    public static void destroy()
    {
        modifyMapValue=null;
    }
    @Test
    public void getModifiedTest_Map_ModifiedMap()
    {
        Map<String,String> map=new HashMap<>();
        map.put("Val1","Java");
        map.put("Val2","C++");
        Map<String,String> map2=new HashMap<>();
        map2.put("Val1","");
        map2.put("Val2","Java");
        assertEquals("Error in getModifiedMap() ",map2,modifyMapValue.getModifiedMap(map));
    }
    @Test
    public void getModifiedTest_Map_ModifiedMapFailure()
    {
        Map<String,String> map=new HashMap<>();
        map.put("Val1","");
        map.put("Val2","C++");
        Map<String,String> map2=new HashMap<>();
        map2.put("Val1","");
        map2.put("Val2","");
        assertNotEquals("Error in getModifiedMap():There is no value in Val1",map2,modifyMapValue.getModifiedMap(map));
        assertNotNull("Error in getModifiedMap():Should not return Null",modifyMapValue.getModifiedMap(map));
    }
}
