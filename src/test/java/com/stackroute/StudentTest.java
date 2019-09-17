package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;

public class StudentTest {
    private static MainTest mainTest;
    @BeforeClass
    public static void create()
    {
        mainTest=new MainTest();
    }
    @AfterClass
    public static void destroy()
    {
        mainTest=null;
    }
    @Test
    public void sortedListTest_ListOfStudent_SortedListOfStudent()
    {
        Student student1=new Student(24,"Antara",20);
        Student student2=new Student(25,"Antara",32);
        Student student3=new Student(26,"Antara",20);
        Student student4=new Student(27,"Ants",41);
        Student student5=new Student(28,"Sahana",19);
        List<Student> studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        List<Student> sortedStudentList=new ArrayList<>();
        sortedStudentList.add(student4);
        sortedStudentList.add(student2);
        sortedStudentList.add(student3);
        sortedStudentList.add(student1);
        sortedStudentList.add(student5);
        assertEquals("Error in sortedList()",sortedStudentList,mainTest.sortedList(studentList));
    }
    @Test
    public void sortedListTest_ListOfStudent_SortedListOfStudentFailure()
    {
        Student student1=new Student(23,"Antara",20);
        Student student2=new Student(24,"Antara",20);
        Student student3=new Student(25,"Antara",22);
        Student student4=new Student(26,"Antara",50);
        Student student5=new Student(27,"Antara",10);
        List<Student> studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        List<Student> sortedStudentList=new ArrayList<>();
        sortedStudentList.add(student4);
        sortedStudentList.add(student3);
        sortedStudentList.add(student1);
        sortedStudentList.add(student2);
        sortedStudentList.add(student5);

        assertNotEquals("Not checking the Id for sorting",sortedStudentList,mainTest.sortedList(studentList));
        assertNotNull("Should not return Null",mainTest.sortedList(studentList));

    }
}
