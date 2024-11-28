package com.mooc.luditech.services.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mooc.luditech.dao.EnterpriseRepository;
import com.mooc.luditech.models.Enterprise;
import com.mooc.luditech.services.EnterpriseService;

@Service
public class EnterpriseServiceImplementation implements EnterpriseService {
	
	@Autowired
	private EnterpriseRepository enterpriseRepository;

	@Override
	public List<Enterprise> getAll() {

		List<Enterprise> enterprises = new ArrayList<Enterprise>();
		
		enterpriseRepository.findAll().forEach(enterprises::add);
		
		return enterprises;

	}

}
