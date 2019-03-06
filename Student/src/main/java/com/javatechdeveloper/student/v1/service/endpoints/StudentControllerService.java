package com.javatechdeveloper.student.v1.service.endpoints;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechdeveloper.student.v1.service.cargo.Student;
import com.javatechdeveloper.student.v1.service.cargo.StudentList;

@RestController
@RequestMapping(value="/student", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentControllerService {

	@GetMapping
	public StudentList getStudents(){

		return new StudentList(Arrays.asList(new Student(1, "raj","kumar","7",12,LocalDate.of(16, 9, 23),5),
				new Student(2, "ram","kumar","8",11,LocalDate.of(16, 7, 23),5)));	
	}
	
	@GetMapping("/{studentId}")
	public Student getStudent(@PathVariable("studentId") int id ){
		return new Student(2, "ram","kumar","8",11,LocalDate.of(16, 7, 23),5);	
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public int addStudent(@RequestBody Optional<Student> student) {
		return 1;
	}
}
