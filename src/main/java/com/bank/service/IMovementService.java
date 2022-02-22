package com.bank.service;

import com.bank.entity.Movement;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IMovementService {
	
	Mono<Movement> create (Movement movement);
	
	Flux<Movement> findByAll();
}
