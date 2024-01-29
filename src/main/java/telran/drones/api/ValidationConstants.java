package telran.drones.api;


public interface ValidationConstants {
	String MISSING_DRONE_NUMBER_MESSAGE = "Missing drone number";
	String MISSING_DRONE_MODEL_TYPE_MESSAGE = "Missing model type";
	String MISSING_MEDICATION_CODE_MESSAGE ="Missing medication code";
	String MEDICATION_NAME_REGEXP = "(\\w+|-+)";
	String WRONG_MEDICATION_NAME_MESSAGE = "Incorrect medication name ";
	String MISSING_MEDICATION_NAME_MESSAGE = "Missing medication name";
	String MEDICATION_CODE_REGEXP = "(\\[A-Z0-9]+|-+)";
	String WRONG_MEDICATION_CODE = "Incorrect medication code ";
}