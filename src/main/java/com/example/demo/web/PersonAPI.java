package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.enttities.Person;

@RestController
@RequestMapping("/api/persons")
public class PersonAPI {

	private List<Person> persons;
	
	@GetMapping
	public List<Person> getPersons() {
		
		persons = new ArrayList<>();
		
		persons.add(new Person(1L, "walid", 12));
		persons.add(new Person(2L, "hassan", 12));
		persons.add(new Person(3L, "khadija", 12));
		
		return persons;
	}
	
}
