package com.stackroute;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {
    public int compare(Student st1,Student st2)
    {
      //  return st1.getAge()-st2.getAge();
        if(st1.getAge()==st2.getAge() )
        {
            if(st1.getName()==st2.getName())
                return st2.getId()-st1.getId();
            else
                return st2.getName().compareTo(st1.getName());
        }
        else
            return st2.getAge()-st1.getAge();
    }

}
