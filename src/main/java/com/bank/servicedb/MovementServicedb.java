package com.bank.servicedb;

import org.springframework.stereotype.Service;
import com.bank.entity.Movement;
import com.bank.repository.MovementRepository;
import com.bank.service.IMovementService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class MovementServicedb implements IMovementService{

	private final MovementRepository repoMovement;
	
	@Override
	public Mono<Movement> create(Movement movement) {
		// TODO Auto-generated method stub
		return repoMovement.save(movement);
	}

	@Override
	public Flux<Movement> findByAll() {
		// TODO Auto-generated method stub
		return repoMovement.findAll();
	}
}
