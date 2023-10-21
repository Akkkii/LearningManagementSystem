package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Trainer;
import com.example.demo.service.TrainerService;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

	@Autowired
	TrainerService service;
	
	@PostMapping("/save")
	private Trainer saveTrainer(@RequestBody Trainer trainer) {
		return service.addTrainer(trainer);
	}
	
	@GetMapping("/findAll")
	private List<Trainer> getAllTrainers(){
		return service.getAllTrainers();
	}
	
	@GetMapping("/findById/{id}")
	private Trainer getTrainerById(@PathVariable Long id) {
		return service.getTrainerById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	private void deleteEmployee(@PathVariable Long id) {
		service.deleteTrainer(id);
	}
	
	@PutMapping("/update/{id}")
	private Trainer updateTrainer(@RequestBody Trainer trainer, @PathVariable Long id) {
		return service.updateTrainer(trainer, id);
	}
}
