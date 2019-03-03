package com.javatechdeveloper.student.v1.service.endpoints;

import java.util.List;
import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechdeveloper.student.v1.service.cargo.Student;

@RestController
@RequestMapping(value="/student", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentControllerService {

	@GetMapping
	public List<Student> getStudents(){
		return null;	
	}
	
	@GetMapping("/{studentId}")
	public List<Student> getStudent(@PathVariable("studentId") int id ){
		return null;	
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public int addStudent(@RequestBody Optional<Student> student) {
		return 1;
	}
}
