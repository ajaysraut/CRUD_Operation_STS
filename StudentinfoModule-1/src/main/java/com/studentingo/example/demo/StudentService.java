package com.studentingo.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService {

	@Autowired
	private StudentRepository repo;
	
	//retrieve all
	public  List<Student> listAll()
	{
		return repo.findAll();
	}
	
	//create and update
	public void add(Student student)
	{
		repo.save(student);
	}
	//retrieve by id
	public Student get(Integer id)
	{
		return repo.findById(id).get();
	}
	
	//delete 
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
}
