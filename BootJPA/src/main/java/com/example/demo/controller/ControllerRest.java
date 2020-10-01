package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentRepo;
import com.example.demo.model.Student;

@RestController
public class ControllerRest 
{
	@Autowired
	StudentRepo repo;

@PostMapping(path ="/student",consumes= {"application/json"})
public Student addStudent(@RequestBody Student student)
{
	repo.save(student);
	
	return student;
}

@PutMapping("/student")
public Student saveOrupdate(@RequestBody Student student)
{
	repo.save(student);
	return student;
}

@DeleteMapping("/student/{sid}")
public String deleteStudent(@PathVariable int sid)
{
	Student s=repo.getOne(sid);
	repo.delete(s);
	return "deleted";
}

}
