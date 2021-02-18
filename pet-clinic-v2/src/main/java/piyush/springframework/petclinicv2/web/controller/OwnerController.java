package piyush.springframework.petclinicv2.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import piyush.springframework.petclinicv2.data.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {
	
	private static OwnerService ownerService;
	
	

	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}



	@RequestMapping({"","/","/index","/index.html"})
	public String listOwners(Model model) {
		model.addAttribute("owners",ownerService.findAll());
		return "owners/index";
	}
	
	@RequestMapping({"/find"})
	private String findOwner() {
		return "notImplemented";
	}
}
 