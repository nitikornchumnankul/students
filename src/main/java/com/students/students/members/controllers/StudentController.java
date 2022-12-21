package com.students.students.members.controllers;

import com.students.students.members.services.StudentService;
import com.students.students.members.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    private final StudentService studentService;


    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public List<Students> getStudents(){
        return studentService.getStudents();
    }
    @PostMapping
    public void registerNewStudents(@RequestBody Students students){
        System.out.println(students);
        studentService.addNewStudent(students);
    }
}
