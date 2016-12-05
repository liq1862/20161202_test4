package com.example.user.a20161202_test4.data;

/**
 * Created by user on 2016/12/5.
 */

public class Student {
    public int ID;
    public String name;
    public String tel;
    public String addr;

    public Student(int i, String n, String t, String a)
    {
        ID = i;
        name = n;
        tel = t;
        addr = a;
    }
    @Override
    public String toString()
    {
        return "" + ID + "," + name;
    }
}

