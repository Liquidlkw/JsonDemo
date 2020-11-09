package com.example.jsondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Student student1 = new Student("Liquid",20);
//        Gson gson = new Gson();
//        String json = gson.toJson(student1);
//
//        String jsonString ="{\"age\":20,\"name\":\"Liquid\"}";
//        Student student2 = gson.fromJson(jsonString,Student.class);


//        Gson gson = new Gson();
//        Student student = new Student("Tom",19,new Score(11,22,33));
//        String jsonString = gson.toJson(student,Student.class);

//        Gson gson = new Gson();
//        Student student1 = new Student("Tom",19,new Score(11,22,33));
//        Student student2 = new Student("liquid",19,new Score(11,22,33));
//        Student student3 = new Student("猴哥",19,new Score(11,22,33));
//        Student[] students = {student1,student2,student3};
//        String jsonString = gson.toJson(students);

        Gson gson = new Gson();
        String jsonString = "[{\"age\":19,\"name\":\"Tom\",\"score\":{\"Chinese\":33,\"English\":22,\"math\":11}},{\"age\":19,\"name\":\"liquid\",\"score\":{\"Chinese\":33,\"English\":22,\"math\":11}},{\"age\":19,\"name\":\"猴哥\",\"score\":{\"Chinese\":33,\"English\":22,\"math\":11}}]";
        Student[] students = gson.fromJson(jsonString,Student[].class);
        List<Student> list = Arrays.asList(students);



    }
}