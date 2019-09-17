package com.stackroute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfCounts {
    public Map<String ,Integer> getCount(String str)
    {
        String[] splitted=str.split("[ |,|_|\\*|\\?|\\-|@|;]+");

        Map<String,Integer> map=new HashMap<>();
        for(String i:splitted)
        {
            Integer occur=map.get(i);
            if(occur==null)
            {
                occur=1;
            }
            else
                occur++;
            map.put(i,occur);
        }


        return map;
    }
}
