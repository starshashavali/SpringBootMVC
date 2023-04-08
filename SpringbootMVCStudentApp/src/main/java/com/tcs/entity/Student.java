package com.tcs.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;

@EntityScan
@Data
public class Student {
	
	private String name;
	private String email;
	private String gender;
	private String course;
	private String[] timings;

}
