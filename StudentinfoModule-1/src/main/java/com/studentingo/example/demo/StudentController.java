package com.studentingo.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	//retrieve all
	//REST API method for retrieve all
	@GetMapping("/student")
	public List<Student>list()
	{
		return service.listAll();
	}
	//create
	//REST API method for retrieve all
	@PostMapping("student")
	public void insert(@RequestBody Student student)
	{
		service.add(student);
	}
	//delete
	//REST API method for retrieve all
	@DeleteMapping("student/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	//retrieve by id
	//REST API method for retrieve all
	@GetMapping("student/{id}")
	public ResponseEntity<Student> get(@PathVariable Integer id)
	{
		try {
		Student student=service.get(id);	
		return new ResponseEntity<Student>(student, HttpStatus.OK);
		}catch(NoSuchElementException e)
		{
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	
	//update
	//REST API method for retrieve all
	@PutMapping("student/{id}")
	public ResponseEntity<?> update(@RequestBody Student student , @PathVariable Integer id)
	{
		try {
		Student existstudent=service.get(id);
		service.add(student);
		return new ResponseEntity<Student>(existstudent,HttpStatus.OK);
		}catch(NoSuchElementException e)
		{
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
}
