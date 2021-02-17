package piyush.springframework.petclinicv2.data.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import piyush.springframework.petclinicv2.data.model.Vet;
import piyush.springframework.petclinicv2.data.services.VetService;



@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		return super.save(object);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}