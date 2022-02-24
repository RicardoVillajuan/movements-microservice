package com.bank.service;

import java.util.Date;

import com.bank.entity.Movement;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IMovementService {
	
	Mono<Movement> create (Movement movement);
	
	Flux<Movement> findByAll();
	
	Flux<Movement> findByStarDateAndEndDate(Date startdate, Date enddate, String idproduct);
}
