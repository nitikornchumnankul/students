package com.students.students.members;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {


//    @Bean
//    CommandLineRunner commandLineRunner(
//            StudentRepository repository){
//        this.repository = repository;
//        return args -> {
//            Students nitikorn = new Students(
//                    "Nitikorn",
//                    "Nitikornchumnankul@gmail.com",
//                    LocalDate.of(2000, Month.APRIL,5),
//                    25
//            );
//            repository.saveAll(List.of(nitikorn));
//        };
//    }
}
