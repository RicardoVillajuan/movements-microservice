package com.bank.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.bank.entity.Movement;

public interface MovementRepository extends ReactiveMongoRepository<Movement, String>{
	
}
