package com.stackroute;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortUsingSet {

    public List<String> getsortedSet(String[] inputStr)
    {
        if(inputStr.length==0)
        {
            return null;
        }
        Set<String> sortedSet= new TreeSet<>();
        List<String> sortedList= new ArrayList<>();
        for(String i:inputStr)
        {
            sortedSet.add(i);
        }
        for(String i:sortedSet)
        {
            sortedList.add(i);
        }

        return sortedList;
    }

    @Override
    public String toString() {
        return "SortUsingSet{}";
    }
}
