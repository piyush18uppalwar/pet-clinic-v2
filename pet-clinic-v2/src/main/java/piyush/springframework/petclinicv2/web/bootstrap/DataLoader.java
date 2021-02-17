package piyush.springframework.petclinicv2.web.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import piyush.springframework.petclinicv2.data.model.Owner;
import piyush.springframework.petclinicv2.data.model.Vet;
import piyush.springframework.petclinicv2.data.services.OwnerService;
import piyush.springframework.petclinicv2.data.services.VetService;



@Component
public class DataLoader implements CommandLineRunner {
	private final OwnerService ownerService ;
	private final VetService vetService;
	
	
	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}



	@Override
	public void run(String... args) throws Exception {
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Piyush");
		owner1.setLastName("Uppalwar");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Piyush 1");
		owner2.setLastName("Uppalwar 1");
		
		ownerService.save(owner2);
		
		System.out.println("###  Owner Data Loaded");
		
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Lana");
		vet1.setLastName("Rhodes");
		vetService.save(vet1);

		Vet vet2= new Vet();
		vet2.setFirstName("Leah");
		vet2.setLastName("Gotti");
		vetService.save(vet2);
		
		System.out.println("###  Vet Data Loaded");
	}

}
