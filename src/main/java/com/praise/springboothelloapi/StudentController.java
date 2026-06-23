package com.praise.springboothelloapi;

import com.praise.springboothelloapi.Student;
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

}

