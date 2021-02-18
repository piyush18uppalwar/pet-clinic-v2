package piyush.springframework.petclinicv2.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Speciality")
public class Speciality extends BaseEntity {

	@Column(name="speciality_type")
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
