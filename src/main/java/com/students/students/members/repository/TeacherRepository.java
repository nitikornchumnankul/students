package com.students.students.members.repository;

import com.students.students.members.entity.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teachers,Long> {
    @Query("SELECT t FROM Teachers t where t.id= :id")
    Optional<Teachers> findTeachersById(@Param("id") Long id);
}
