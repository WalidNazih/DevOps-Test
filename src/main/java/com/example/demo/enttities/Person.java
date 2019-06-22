package com.example.demo.enttities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	
	protected Long id;
	protected String name;
	protected int age;
	

}
