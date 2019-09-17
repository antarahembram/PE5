package com.stackroute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpdateArrayElement {
    public List<String> getUpdatedArray(List<String> arr, String modify,String modifyTo)
    {
        List<String> updatedArray=new ArrayList<String>();
        //Pattern pattern=Pattern.compile(modifyBy);
        Iterator<String> itr=arr.iterator();
        while(itr.hasNext())
        {
            String ele=itr.next();
            System.out.println(ele);
            if(ele.equals(modify))
            {
                updatedArray.add(modifyTo);
            }
            else
            {
                updatedArray.add(ele);
            }
            itr.remove();
        }
        return updatedArray;
    }
}
