package com.stackroute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainTest {

    public List<Student> sortedList(List<Student> studentList)
    {
        Collections.sort(studentList,new StudentSorter());

        return studentList;
    }

}
