package com.restapi.controller;

import com.restapi.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController
// http://localhost:8080/student
{
    @GetMapping("student")
   public Student getStudent(){

        Student student = new Student(
              1,
                "Imon",
                "Bhuiya"

       );
       return student;
    }
    // http://localhost:8080/students
    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Imon","Bhuiya"));
        students.add(new Student(2,"Imon1","Bhuiya"));
        students.add(new Student(3,"Imon2","Bhuiya"));
        students.add(new Student(3,"Imon3","Bhuiya"));
        return students;


    }


}
