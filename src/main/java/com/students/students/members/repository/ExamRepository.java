package com.students.students.members.repository;

import com.students.students.members.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExamRepository extends JpaRepository<Exam,Long> {
    @Query("SELECT e FROM Exam e where e.id= :id")
    Optional<Exam> findExamById(@Param("id") Long id);

}
