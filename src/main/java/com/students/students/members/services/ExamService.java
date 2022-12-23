package com.students.students.members.services;

import com.students.students.members.entity.Exam;
import com.students.students.members.repository.ExamRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExamService {
    private final ExamRepository examRepository;

    public ExamService(ExamRepository examRepository){
        this.examRepository = examRepository;
    }
    public List<Exam> getExams(){
        return  this.examRepository.findAll();
    }
    public void addNewExam(Exam exam){

        examRepository.save(exam);

    }
}
