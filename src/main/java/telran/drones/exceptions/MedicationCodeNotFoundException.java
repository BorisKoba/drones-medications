package telran.drones.exceptions;

import telran.drones.api.ServiceExceptionMessages;

@SuppressWarnings("serial")
public class MedicationCodeNotFoundException extends NotFoundException {

	public MedicationCodeNotFoundException(String message) {
		super(ServiceExceptionMessages.MEDICATION_CODE_NOT_FOUND);
		
	}

}
