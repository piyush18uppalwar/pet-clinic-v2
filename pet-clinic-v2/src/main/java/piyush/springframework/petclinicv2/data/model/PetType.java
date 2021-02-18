package piyush.springframework.petclinicv2.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Pet_types")
public class PetType extends BaseEntity {

	@Column(name="Pet_type")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
