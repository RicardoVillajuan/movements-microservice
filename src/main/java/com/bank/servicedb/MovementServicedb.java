package com.bank.servicedb;

import java.util.Date;

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

	@Override
	public Flux<Movement> findByStarDateAndEndDate(Date startdate, Date enddate,String idproduct) {
		// TODO Auto-generated method stub
		return repoMovement.findByDateBetween(startdate, enddate)
				.filter(e->{
					return e.getIdproduct().equals(idproduct);
				}).map(e->{
					return e;
				});
	}
}
