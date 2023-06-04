package com.studentingo.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String city;
	private Integer age;
	private String course;
	
	//default constructor
	public Student() {
		super();
	}
	//parameterized constructor
	public Student(Integer id, String name, String city, Integer age, String course) {
		
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.course = course;
	}
	//getter and setter 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", course=" + course + "]";
	}
	
	
}
