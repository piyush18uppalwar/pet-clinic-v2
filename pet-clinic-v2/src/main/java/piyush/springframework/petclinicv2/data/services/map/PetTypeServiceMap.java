package piyush.springframework.petclinicv2.data.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import piyush.springframework.petclinicv2.data.model.BaseEntity;
import piyush.springframework.petclinicv2.data.model.PetType;
import piyush.springframework.petclinicv2.data.services.PetTypeService;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {

	@Override
	public Set<PetType> findAll() {
		return super.findAll();
	}

	@Override
	public PetType findById(Long id) {
		return super.findById(id);
	}

	@Override
	public PetType save(PetType object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void delete(PetType object) {
		super.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	
}
