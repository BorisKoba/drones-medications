package telran.drones.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import telran.drones.dto.DroneDto;
import telran.drones.service.DronesService;
@RestController
	@RequestMapping("drones")
	@RequiredArgsConstructor
	@Slf4j
public class DronesController {
	final DronesService dronesService;
	@PostMapping
	DroneDto registerDrone(@RequestBody @Valid DroneDto droneDto) {
		
		log.debug("registerDrone: register drone data: {}", droneDto);
		return dronesService.registerDrone(droneDto);
}}
