package telran.drones.dto;

import  jakarta.validation.constraints.*;


import static telran.drones.api.ValidationConstants.*;

public record DroneMedication(@NotEmpty(message=MISSING_DRONE_NUMBER_MESSAGE)String droneNumber,
								@NotEmpty(message=MISSING_MEDICATION_CODE_MESSAGE)@Pattern(regexp=MEDICATION_CODE_REGEXP,message= WRONG_MEDICATION_CODE)
								 String medicationCode) {

}
