package com.stackroute;

import java.util.*;

public class Student {
    private String Name;
    private int Id;
    private int Age;

    public Student(int id, String name, int age)
    {
        this.Name=name;
        this.Id=id;
        this.Age=age;
    }
    public int getId() {
        return this.Id;
    }
    public int getAge()
    {
        return this.Age;
    }

    public String getName() {
        return this.Name;
    }

    public String getInfo()
    {
        return this.Id+" "+this.Name+" "+this.Age;
    }


}


