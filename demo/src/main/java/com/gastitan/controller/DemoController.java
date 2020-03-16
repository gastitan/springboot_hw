package com.gastitan.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gastitan.model.Person;
import com.gastitan.repo.IPersonRepo;

@Controller
public class DemoController {

	@Autowired
	IPersonRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="id", required=false, defaultValue="1") String id, Model model) {
		
		Optional<Person> p = repo.findById(Integer.valueOf(id));
		
		model.addAttribute("name", p.get().getName());		
		
		return "greeting";
	}
}
