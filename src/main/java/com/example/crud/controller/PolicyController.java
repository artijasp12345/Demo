package com.example.crud.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.policy.Policy;
import com.example.crud.service.PolicyService;

@RestController
@RequestMapping("/policy")
public class PolicyController {

	
	@Autowired 
	PolicyService service;
	
	
	@GetMapping("/getPolicies")
	public List<Policy> getPolicyCon(){
		return service.getPolicyService();
	}
	
	@GetMapping("/getPolicy/{PolicyId}")
	public Policy getPolicyC(@PathVariable int PolicyId){
		return service.getPolicyService(PolicyId);
	}
	
	
	@PostMapping("/savePolicy")
	public  Policy addPolicy (@RequestBody Policy pol) {
		return service.savePolicy(pol);
		
	}
	@PostMapping("/savePolicies")
	public  List<Policy> addPolicies (@RequestBody List<Policy> pols) {
		return service.savePolicies(pols);
	
	}
	
	@PutMapping("/UpdatePolicy")
	public  Policy updatePolicy (@RequestBody Policy pol) {
		return service.updatePolicy(pol);
	
	}
	
	@DeleteMapping("/DeletePolicy/{PolicyId}")
	public String deletePolicy(@PathVariable int PolicyId) {
		return service.deletePolicy(PolicyId);
	}
}
