package com.mooc.luditech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mooc.luditech.models.Enterprise;
import com.mooc.luditech.services.EnterpriseService;

@RestController
public class EnterpriseControllers {
	
	@Autowired
	private EnterpriseService enterpriseService;
	
	@GetMapping("/enterprises")
	public List<Enterprise> getAll() {
		
		return enterpriseService.getAll();
	
	}
}
