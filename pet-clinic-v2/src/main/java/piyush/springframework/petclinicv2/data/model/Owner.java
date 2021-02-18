package piyush.springframework.petclinicv2.data.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Owners")
public class Owner extends Person {
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "owner")
	private Set<Pet> pets = new HashSet<Pet>();

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
	
	

}
