package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.registration;
import com.example.demo.repository.registrationrepository;

@Service
public class registrationservice {
	
	@Autowired
	registrationrepository repo;
	
	public registration insertion(registration reg) {
		return repo.save(reg);
	}
	
	public Iterable<registration> multiinsertion(List<registration> reg) {
		return repo.saveAll(reg);
		
	}
	
	public List<registration> multifetch(){
		return (List<registration>) repo.findAll();
	}
	
	public Optional<registration> fetch(int id) {
		return repo.findById(id);
	}
	
	public String delete(int id) {
		repo.deleteById(id);
		return "sucessfully deleted "+id;
	}
	
	public registration update(registration reg) {
		return repo.save(reg);
	}
}
