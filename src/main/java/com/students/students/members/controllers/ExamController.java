package com.students.students.members.controllers;

import com.students.students.members.services.ExamService;
import com.students.students.members.entity.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping(path = "api/v1/exam")
public class ExamController {
    private final ExamService examService;


    @Autowired
    public ExamController(ExamService examService){
        this.examService = examService;
    }

    @GetMapping
    public List<Exam> getExam(){
        return examService.getExams();
    }

//    @PostMapping
//    public void registerNewStudents(@RequestBody Students students){
//        System.out.println(students);
//        studentService.addNewStudent(students);
//    }
}
