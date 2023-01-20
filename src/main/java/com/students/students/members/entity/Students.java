package com.students.students.members.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.time.LocalDate;
@Data
@Entity
@Table
@EnableAutoConfiguration
public class Students {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    private String email;
    private LocalDate dob;
    private Integer age;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "teachers_id")
//    private Teachers teachers;

    public Students(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }


    public Students() {

    }

}

