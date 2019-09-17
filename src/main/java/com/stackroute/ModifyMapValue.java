package com.stackroute;

import java.util.Iterator;
import java.util.Map;

public class ModifyMapValue {
    public Map<String,String> getModifiedMap(Map<String,String> map)
    {
        Iterator itr=map.entrySet().iterator();
       // while(itr.hasNext())
        //{
        Map.Entry mEnty1=(Map.Entry)itr.next();
        Map.Entry mEnty2=(Map.Entry)itr.next();

        String strKey1=(String)mEnty1.getKey();
        String strVal1=(String)mEnty1.getValue();
        if(strVal1!="")
        {
            mEnty2.setValue(strVal1);
            mEnty1.setValue("");
        }
        return map;
        //}
    }
}
