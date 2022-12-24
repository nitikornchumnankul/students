package com.students.students.members.repository;

import com.students.students.members.entity.Schools;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<Schools,Long> {
}
