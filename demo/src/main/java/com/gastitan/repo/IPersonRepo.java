package com.gastitan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gastitan.model.Person;

public interface IPersonRepo extends JpaRepository <Person, Integer>{

	
}
