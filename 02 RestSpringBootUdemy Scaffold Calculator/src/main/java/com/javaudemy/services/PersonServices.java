package com.javaudemy.services;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.javaudemy.model.Person;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();
	
	public Person findById(String id) {
		Person person = new Person();
		
		person.setId(counter.incrementAndGet());
		person.setFirstName("Gustavo");
		person.setLastName("Riquena");
		person.setAddress("Jandira, SP, Brazil");
		person.setGenger("Male");
		
		return person;
	}
	
}
