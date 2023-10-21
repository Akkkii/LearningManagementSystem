package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Trainer;
import com.example.demo.repository.TrainerRepository;

@Service
public class TrainerService {

	@Autowired
	TrainerRepository repository;

	public Trainer addTrainer(Trainer trainer) {
		return repository.save(trainer);
	}

	public Trainer getTrainerById(Long id) {
		return repository.findById(id).get();
	}
	
	public List<Trainer> getAllTrainers(){
		List<Trainer> trainers = new ArrayList<Trainer>();
		repository.findAll().forEach(trainer1 -> trainers.add(trainer1));
		return trainers;
	}

	public void deleteTrainer(Long id) {
		repository.deleteById(id);
	}
	
	public Trainer updateTrainer(Trainer t, Long id) {
		
		Trainer trainer = repository.findById(id).get();
		
		if(trainer.getName() != null) {
			trainer.setName(t.getName());
		}
		if(trainer.getDepartment() != null) {
			trainer.setDepartment(t.getDepartment());
		}
		return repository.save(trainer);
	}

}
