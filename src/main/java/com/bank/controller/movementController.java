package com.bank.controller;

import java.util.Date;

import javax.ws.rs.Path;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Movement;
import com.bank.service.IMovementService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movement")
public class movementController {

	private final IMovementService serviceMovement;
	
	@PostMapping
	public Mono<Movement> save(@RequestBody Movement movement){
		
		return serviceMovement.create(movement);
	}
	
	@GetMapping
	public Flux<Movement> findAll(){
		
		return serviceMovement.findByAll();
	}
	
	@GetMapping("/findbydate")
	public Flux<Movement> findByStarDateAndEndDate(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startdate,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date enddate,@RequestParam String idproduct){
		 
		return serviceMovement.findByStarDateAndEndDate(startdate,enddate,idproduct);
	}
}
