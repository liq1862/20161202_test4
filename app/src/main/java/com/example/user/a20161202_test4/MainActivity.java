package com.example.user.a20161202_test4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.user.a20161202_test4.data.Student;
import com.example.user.a20161202_test4.data.StudentDAO;
import com.example.user.a20161202_test4.data.StudentDAOMemoryImpl;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> data;
    ListView lv;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.listView);
        data = new ArrayList<>();

        StudentDAO dao = new StudentDAOMemoryImpl();
        dao.add(new Student(1, "Bob", "123", "aa123"));
        dao.add(new Student(2, "Mary", "345", "bb345"));
        List<Student> lst = dao.getList();
        for (Student s : lst)
        {
            Log.d("DATA", s.toString());
        }

        adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, data);
        lv.setAdapter(adapter);
    }
}
