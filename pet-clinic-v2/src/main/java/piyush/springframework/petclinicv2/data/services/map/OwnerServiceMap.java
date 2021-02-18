package piyush.springframework.petclinicv2.data.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import piyush.springframework.petclinicv2.data.model.Owner;
import piyush.springframework.petclinicv2.data.model.Pet;
import piyush.springframework.petclinicv2.data.services.OwnerService;
import piyush.springframework.petclinicv2.data.services.PetService;
import piyush.springframework.petclinicv2.data.services.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	private final PetService petService;
	private final PetTypeService petTypeService;
	
	
	
	public OwnerServiceMap(PetService petService,PetTypeService petTypeService) {
		this.petService = petService;
		this.petTypeService = petTypeService;
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		
		if(object!= null) {
			if(object.getPets() != null) {
				object.getPets().forEach(pet ->{
					
					if(pet.getPetType() != null) {
						if(pet.getPetType().getId() == null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					} else {
						throw new RuntimeException("Pet Type is required");
					}
					
					if(pet.getId() == null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			return super.save(object);
		} else {
			return null;
		}
		
		
		
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}

}
