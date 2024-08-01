package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.registration;
import com.example.demo.services.registrationservice;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:4200")

public class registrationcontroller {
	
	@Autowired
	registrationservice service;
	
	@PostMapping("/adding")
	public registration insertion(@RequestBody registration reg) {
		return service.insertion(reg);
	}
	@PostMapping("/multiadding")
	public Iterable<registration> multiinsertion(@RequestBody List<registration>reg) {
		return service.multiinsertion(reg);
	}
	@GetMapping("/multifetch")
	public List<registration> multifetch() {
		return service.multifetch();
	}
	@GetMapping("/fetch/{id}")
	public Optional<registration> fetch(@PathVariable int id) {
		return service.fetch(id);
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return service.delete(id);
	}
}
