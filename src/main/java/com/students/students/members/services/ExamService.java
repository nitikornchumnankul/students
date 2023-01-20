package com.students.students.members.services;

import com.students.students.members.entity.Exam;
import com.students.students.members.entity.Students;
import com.students.students.members.entity.Teachers;
import com.students.students.members.repository.ExamRepository;
import com.students.students.members.repository.StudentRepository;
import com.students.students.members.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ExamService {
    private final ExamRepository examRepository;
    private final StudentRepository studentRepository;
    private final TeacherRepository teacherRepository;

    public ExamService(ExamRepository examRepository, StudentRepository studentRepository, TeacherRepository teacherRepository){
        this.examRepository = examRepository;
        this.studentRepository = studentRepository;
        this.teacherRepository = teacherRepository;
    }
    public List<Exam> getExams(){
        return  this.examRepository.findAll();
    }
    public void addNewExam(Exam exam){
        examRepository.save(exam);
    }

    public Optional<Exam> findExamById(Long id){

        return examRepository.findExamById(id);
    }
    public Optional<Exam> updateExam(Exam exam){
        Optional<Exam> optionalExam = examRepository.findExamById(exam.getId());
        Optional<Teachers> optionalTeachers = teacherRepository.findTeachersById(exam.getId());
        Optional<Students> optionalStudents = studentRepository.findStudentsById(exam.getId());
        Teachers exitingTeachers = optionalTeachers.get();
        Students exitingStudent = optionalStudents.get();
        Exam exitingExam = optionalExam.get();


        System.out.println(exam.getStudents());
        exitingExam.setTeachers(exitingTeachers);
        exitingExam.setStudents(exitingStudent);

        examRepository.save(exitingExam);
        teacherRepository.save(exitingTeachers);
        studentRepository.save(exitingStudent);

        return null;
    }
}
