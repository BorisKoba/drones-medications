package telran.drones.service;

import java.util.*;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import telran.drones.dto.DroneDto;
import telran.drones.dto.DroneMedication;
import telran.drones.exceptions.DroneIllegalStateException;
import telran.drones.model.Drone;
@Service("droneService")
@Slf4j
public class DroneServiceImpl implements DronesService {
	HashMap<String, Drone> drone = new HashMap<>();
	@Override
	synchronized public DroneDto registerDrone(DroneDto droneDto) {
			String number = droneDto.number();
			if(drone.containsKey(number)) {
				throw new DroneIllegalStateException();
			}
			drone.put(number, new Drone());
			log.debug("register drone with number {}", number);
			return droneDto;
		}

	@Override
	public DroneMedication loadDrone(DroneMedication droneMedication) {
		// TODO Auto-generated method stub
		return null;
	}

}
