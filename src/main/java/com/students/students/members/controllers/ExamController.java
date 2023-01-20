package com.students.students.members.controllers;

import com.students.students.members.entity.Exam;
import com.students.students.members.services.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
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
        System.out.println("Show all information");


        return examService.getExams();
    }

    @GetMapping("/findExam")
    @ResponseBody
    public Optional<Exam> examFindbyId(@RequestParam(name = "id") long id){
        System.out.println("Hello GET Controller");
        return examService.findExamById(id);
    }
    @PutMapping("/update/")
    @ResponseBody
    public void updateExam(@RequestBody Exam exam){

          examService.updateExam(exam);
    }
}
