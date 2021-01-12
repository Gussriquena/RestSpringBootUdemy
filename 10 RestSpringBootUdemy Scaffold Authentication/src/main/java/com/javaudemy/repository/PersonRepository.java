package com.javaudemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaudemy.data.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

	
	
}
