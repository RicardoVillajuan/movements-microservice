package com.bank.repository;

import java.util.Date;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.bank.entity.Movement;
import reactor.core.publisher.Flux;

public interface MovementRepository extends ReactiveMongoRepository<Movement, String>{
	
	Flux<Movement> findByDateBetween(Date startdate, Date enddate);
}
