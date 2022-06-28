package com.example.crud.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.policy.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy,Integer>{

	


}
