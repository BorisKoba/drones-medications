package telran.drones.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="medications")
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)

public class Medication {
	@Id
	@Column(name="medication_name")
	String name;
	@Column(name="weight")
	int weight;
	@Column(name="medication_code")
	String code;
}
