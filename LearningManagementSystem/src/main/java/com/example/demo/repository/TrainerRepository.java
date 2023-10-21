package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Long> {

}
