package com.students.students.members.repository;

import com.students.students.members.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Students,Long> {

    @Query("SELECT s FROM Students s where s.email=?1")
    Optional<Students> findStudentsBy(String email);
}
