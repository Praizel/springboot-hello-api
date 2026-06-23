package com.praise.springboothelloapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



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

}
