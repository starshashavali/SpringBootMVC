package com.tcs.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class StudentService {
	public List<String>getCourses(){
		return Arrays.asList("java","Pytho","C","C++","AWS","Devops");
	}
	//hard code values
	public List<String>getTiming(){
		return Arrays.asList("Morning","Afternoon","Evening");
	}

}
