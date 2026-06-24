package com.praise.springboothelloapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class StudentController {
    @GetMapping("/student")
    public String student(){
        Student student = new Student(1, "Ally", "Software Engineer");
        return "Student Name:  " + student.getName() +
        "<br>Course: " + student.getCourse();
    }

    @GetMapping("/student-json")
    public Student studentJson(){
        Student student = new Student(1, "Ally", "Software Engineer");

        return  student;
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Ally", "Software Engineer"));
        students.add(new Student(2, "Ally", "Software Engineer"));
        students.add(new Student(3, "Ally", "Software Engineer"));
        return students;

    }


}
