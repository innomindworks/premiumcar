package com.premiumcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.premiumcars.entities.City;
import com.premiumcars.entities.Ownership;

@Repository
public interface OwnershipRepository extends JpaRepository<Ownership, Long>{

	
}
