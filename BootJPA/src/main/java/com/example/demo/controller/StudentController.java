package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.StudentRepo;
import com.example.demo.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
	return "home.jsp";
	}
	
	@RequestMapping("/addStud")
	public String addStudent(Student student)
	{
		repo.save(student);
		return "home.jsp";
	}
	
	@RequestMapping("/getStudent")
	public ModelAndView getStudent(@RequestParam int sid)
	{
		ModelAndView mv=new ModelAndView("show.jsp");
	Student student=repo.findById(sid).orElse(new Student());
	//System.out.println(repo.findByTech("java"));
	//System.out.println(repo.findBySidGreaterThan(102));
	
	System.out.println(repo.findByTechSorted("AI"));
	
	mv.addObject(student);
	
		return mv;	
	}
	
	@RequestMapping("/removeStudent")
	public String removeStudent(Student s)
	{	
	repo.delete(s);
	return "show.jsp";	
	}
	
	/*
	 * @RequestMapping("/students")
	 * 
	 * @ResponseBody public String getStudents() { return repo.findAll().toString();
	 * }
	 * 
	 * @RequestMapping("/student/{sid}")
	 * 
	 * @ResponseBody public String getStud(@PathVariable int sid) { return
	 * repo.findById(sid).toString(); }
	 */
	
	@RequestMapping(path = "/students" /* ,produces= {"application/xml"} */)
	@ResponseBody
	public List<Student> getStudents()
	{
		return repo.findAll();
	}
	
	@RequestMapping("/student/{sid}")
	@ResponseBody
	public Optional<Student> getStud(@PathVariable int sid)
	{
		return repo.findById(sid);
	}
}
