package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Lead;
import com.zohocrm.repositories.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
private LeadRepository leadRepo;
	@Override
	public void saveOneLead(Lead lead) {
		
		leadRepo.save(lead);
		// TODO Auto-generated method stub

	}
	@Override
	public Lead findLeadById(long id) {
		// TODO Auto-generated method stub
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	@Override
	public void deleteLeadById(long id) {
		// TODO Auto-generated method stub
		leadRepo.deleteById(id);
		
	}
	@Override
	public List<Lead> getAllLeads() {
		// TODO Auto-generated method stub
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

}
