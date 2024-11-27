package com.mooc.luditech.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mooc.luditech.models.Enterprise;

@RestController
public class EnterpriseControllers {
	
	@GetMapping("/enterprises")
	public List<Enterprise> getAll() {
		List<Enterprise> enterprises = new ArrayList<Enterprise>();
		
		Enterprise enterprise1 = new Enterprise();
		enterprise1.setId(1);
		enterprise1.setName("microsoft");
		enterprise1.setCity("New York");
		
		Enterprise enterprise2 = new Enterprise();
		enterprise2.setId(2);
		enterprise2.setName("oracle");
		enterprise2.setCity("Washinton");
		
		enterprises.add(enterprise1);
		enterprises.add(enterprise2);
		
		return enterprises;
	}
}
