package com.students.students;

import com.students.students.members.entity.Students;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentsApplication {

	public static void main(String[] args) {
		Students beam = new Students();
		Students pun = new Students();




		SpringApplication.run(StudentsApplication.class, args);

		System.out.println("H");
	}

}
