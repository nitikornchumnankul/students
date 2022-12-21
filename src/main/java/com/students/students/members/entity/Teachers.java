package com.students.students.members.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.time.LocalDate;

@Data
@Entity
@Table
@EnableAutoConfiguration
public class Teachers {
    @Id
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

}
