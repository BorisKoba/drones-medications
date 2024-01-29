package telran.drones.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import static telran.drones.api.ValidationConstants.*;
@Entity
@Table(name="medications")
@NoArgsConstructor


public class Medication {
	
	@Id
	@Column(name="medication_name")
	String name;
	@Column(name="weight")
	int weight;
	@Column(name="medication_code")
	String code;
	
	public  Medication(@NotEmpty (message= MISSING_MEDICATION_NAME_MESSAGE)
	@Pattern(regexp = MEDICATION_NAME_REGEXP, message = WRONG_MEDICATION_NAME_MESSAGE)String name, 
			int weight,String code) {
		this.name = name;
		this.weight = weight;
		this.code = code;
	}
}
