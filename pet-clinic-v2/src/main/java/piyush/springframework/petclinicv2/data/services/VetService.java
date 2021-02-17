package piyush.springframework.petclinicv2.data.services;

import java.util.Set;

import piyush.springframework.petclinicv2.data.model.Vet;

public interface VetService extends CRUDService<Vet, Long> {

	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
	
}
