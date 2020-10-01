package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	/*
	 * @RequestMapping("home") public String home(HttpServletRequest req) {
	 * HttpSession session=req.getSession(); String name=req.getParameter("name");
	 * System.out.println("hi..."+name); session.setAttribute("name", name); return
	 * "home"; }
	 */
	
	/*
	 * @RequestMapping("home") public ModelAndView home(@RequestParam("name") String
	 * myname) { ModelAndView mv=new ModelAndView(); mv.addObject("name",myname);
	 * mv.setViewName("home");
	 * 
	 * return mv; }
	 */
	
	@RequestMapping("home")
	public ModelAndView home(Student student)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",student);
		mv.setViewName("home");
		return mv;
	}

}
