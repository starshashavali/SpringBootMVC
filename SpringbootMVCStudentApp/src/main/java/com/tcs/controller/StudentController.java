package com.tcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tcs.entity.Student;
import com.tcs.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;

	@GetMapping("/")
	// url:http://localhost:9098 this is empty url apttern
	public String loadIndexPage(Model model) {

		formInitBinding(model);

		return "index";
	}

	private void formInitBinding(Model model) {
		// model send data to controller to UI as key value format
		model.addAttribute("student", new Student());
		// get couses from services
		// List<String> courseslist = service.getCourses();
		model.addAttribute("courses", service.getCourses());
		// model send data to controller to UI as key and value
		model.addAttribute("prefTimings", service.getTiming());
	}

	@PostMapping("/save")
	public String saveStudent(Student s, Model model) {
		System.out.println(s);
		model.addAttribute("msg", "Data is saved.....");

		

		// get couses from services
		// List<String> courseslist = service.getCourses();

		formInitBinding(model);
		return "index";
		/*
		 * Student Info
Data is saved.....


Name:	
Email:	
Gender:	Male	Female
Course	
-Select-
Timings	MorningAfternoonEvening

		 */
	}

}
