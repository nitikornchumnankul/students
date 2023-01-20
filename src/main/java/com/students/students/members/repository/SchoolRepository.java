package com.students.students.members.repository;

import com.students.students.members.entity.Schools;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface SchoolRepository extends JpaRepository<Schools,Long> {
    @Query("SELECT s FROM Schools s where s.id= :id")
    Optional<Schools> findSchoolsById(@Param("id") Long id);
}
