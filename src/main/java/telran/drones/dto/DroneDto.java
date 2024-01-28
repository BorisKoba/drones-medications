package telran.drones.dto;

import  jakarta.validation.constraints.*;
import static telran.drones.api.ValidationConstants.*;

public record DroneDto(@NotEmpty (message= MISSING_DRONE_NUMBER_MESSAGE)String number, 
		@NotEmpty (message= MISSING_DRONE_MODEL_TYPE_MESSAGE)ModelType modelType) {

	

}
