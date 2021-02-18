package piyush.springframework.petclinicv2.web.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import piyush.springframework.petclinicv2.data.model.Owner;
import piyush.springframework.petclinicv2.data.model.Pet;
import piyush.springframework.petclinicv2.data.model.PetType;
import piyush.springframework.petclinicv2.data.model.Speciality;
import piyush.springframework.petclinicv2.data.model.Vet;
import piyush.springframework.petclinicv2.data.services.OwnerService;
import piyush.springframework.petclinicv2.data.services.PetService;
import piyush.springframework.petclinicv2.data.services.PetTypeService;
import piyush.springframework.petclinicv2.data.services.SpecialityService;
import piyush.springframework.petclinicv2.data.services.VetService;



@Component
public class DataLoader implements CommandLineRunner {
	private final OwnerService ownerService ;
	private final VetService vetService;
	private final PetTypeService petTypeService ;
	private final SpecialityService specialityService;
	
	
	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialityService = specialityService;
	}



	@Override
	public void run(String... args) throws Exception {
		
		localData();
	}

	private void localData() {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedPetType1 = petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedPetType2 = petTypeService.save(cat);
		
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Piyush");
		owner1.setLastName("Uppalwar");
		owner1.setAddress("A");
		owner1.setCity("W");
		owner1.setTelephone("12");
		
		Pet pet1 = new Pet();
		pet1.setName("Simba");
		pet1.setBirthDate(LocalDate.now());
		pet1.setPetType(savedPetType1);
		pet1.setOwner(owner1);
		
		ownerService.save(owner1);
		
		
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Piyush 1");
		owner2.setLastName("Uppalwar 1");
		owner1.setAddress("B");
		owner1.setCity("N");
		owner1.setTelephone("23");
		
		Pet pet2 = new Pet();
		pet2.setName("Tommy");
		pet2.setBirthDate(LocalDate.now());
		pet2.setPetType(savedPetType2);
		pet2.setOwner(owner2);
		
		ownerService.save(owner2);
		
		System.out.println("###  Owner Data Loaded");
		
		
		Speciality surgery = new Speciality();
		surgery.setDescription("Surgery");
		Speciality savedSurgery= specialityService.save(surgery);
		
		Speciality dentistry = new Speciality();
		surgery.setDescription("dentistry");
		Speciality savedDentistry = specialityService.save(dentistry);
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Lana");
		vet1.setLastName("Rhodes");
		vet1.getSpecialities().add(savedDentistry);
		
		
		vetService.save(vet1);

		Vet vet2= new Vet();
		vet2.setFirstName("Leah");
		vet2.setLastName("Gotti");
		vet1.getSpecialities().add(savedSurgery);
		
		vetService.save(vet2);
		
		System.out.println("###  Vet Data Loaded");
	}

}
