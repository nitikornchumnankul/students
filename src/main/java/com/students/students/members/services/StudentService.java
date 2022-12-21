package com.students.students.members.services;

import com.students.students.members.entity.Students;
import com.students.students.members.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public List<Students> getStudents(){
        return  this.studentRepository.findAll();
    }
    public void addNewStudent(Students students){

        studentRepository.save(students);

    }
}
