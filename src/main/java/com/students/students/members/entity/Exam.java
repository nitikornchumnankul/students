package com.students.students.members.entity;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Data
@Entity
@Table
@EnableAutoConfiguration
public class  Exam {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teachers_id")
    private Teachers teachers;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "students_id")
    private Students students;
}