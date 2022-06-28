package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.policy.Policy;
import com.example.crud.repository.PolicyRepository;

@Service
public class PolicyService {
	
	@Autowired 
	PolicyRepository repo;
	
	
	public List<Policy> getPolicyService(){
		return this.repo.findAll();	
	}
	
	public Policy savePolicy(Policy pol) {
		return repo.save(pol);
	}
	
	public List<Policy> savePolicies(List<Policy> pols) {
		return repo.saveAll(pols);
	}

	public Policy getPolicyService(int policyId) {
		return repo.findById(policyId).orElse(null);
	}

	public Policy updatePolicy(Policy pol) {
		Policy existingpolicy=repo.findById(pol.getId()).orElse(null);
		
		existingpolicy.setEmail(pol.getEmail());
		existingpolicy.setName(pol.getName());
		existingpolicy.setPolicyNumber(pol.getPolicyNumber());
		existingpolicy.setPremiumAmount(pol.getPremiumAmount());
		
		return repo.save(existingpolicy);
		//return repo.save(pol);
	}
	
	public String deletePolicy(int id) {
		repo.deleteById(id);
		return "Policy deleted";
	}
	
	
	
	

}
