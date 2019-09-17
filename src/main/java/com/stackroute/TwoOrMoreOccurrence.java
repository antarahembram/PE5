package com.stackroute;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TwoOrMoreOccurrence {
    public Map<String,Boolean> getTwoOrMorOccurrence(String[] list)
    {
        if(list.length==0)
        {
            return null;
        }
        Map<String,Boolean> occurrenceList=new HashMap<>();
        Map<String,Integer> map=new HashMap<>();
        for(String i:list)
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
      //  System.out.println(map.size());

        Iterator itr=map.entrySet().iterator();
        while (itr.hasNext())
        {
            Map.Entry mstr=(Map.Entry)itr.next();
            Integer count=(Integer)mstr.getValue();
            String strPart=(String)mstr.getKey();

            if(count>=2)
            {
                occurrenceList.put(strPart,true);
            }
            else
                occurrenceList.put(strPart,false);
        }

    return occurrenceList;
    }
}
