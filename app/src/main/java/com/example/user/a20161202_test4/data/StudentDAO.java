package com.example.user.a20161202_test4.data;

import java.util.List;

/**
 * Created by user on 2016/12/5.
 */

public interface StudentDAO {
    public List<Student> getList();
    public void add(Student s);
    public Student getItem(int ID);
    public void delete(int ID);
    public void update(Student s);
}

