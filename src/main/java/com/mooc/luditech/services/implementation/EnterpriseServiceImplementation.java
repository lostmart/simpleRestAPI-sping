package com.mooc.luditech.services.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mooc.luditech.models.Enterprise;
import com.mooc.luditech.services.EnterpriseService;

@Service
public class EnterpriseServiceImplementation implements EnterpriseService {

	@Override
	public List<Enterprise> getAll() {
	List<Enterprise> enterprises = new ArrayList<Enterprise>();
		
		Enterprise enterprise1 = new Enterprise();
		enterprise1.setId(1);
		enterprise1.setName("microsoft");
		enterprise1.setCity("New York ssss");
		
		
		
		Enterprise enterprise2 = new Enterprise();
		enterprise2.setId(2);
		enterprise2.setName("oracle");
		enterprise2.setCity("Washinton");
		
		enterprises.add(enterprise1);
		enterprises.add(enterprise2);
		
		return enterprises;
	}

}
