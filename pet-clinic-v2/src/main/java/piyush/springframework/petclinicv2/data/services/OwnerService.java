package piyush.springframework.petclinicv2.data.services;

import piyush.springframework.petclinicv2.data.model.Owner;

public interface OwnerService extends CRUDService<Owner, Long> {
	
	Owner findByLastName(String lastName);
	

}
