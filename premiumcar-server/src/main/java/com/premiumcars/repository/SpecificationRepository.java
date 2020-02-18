package com.premiumcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.premiumcars.entities.Specification;

@Repository
public interface SpecificationRepository extends JpaRepository<Specification, Long>{

}
