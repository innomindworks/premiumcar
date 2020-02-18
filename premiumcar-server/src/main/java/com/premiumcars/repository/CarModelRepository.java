package com.premiumcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.premiumcars.entities.CarModel;
import com.premiumcars.entities.City;
import com.premiumcars.entities.OwnerType;
import com.premiumcars.entities.Ownership;
import com.premiumcars.modal.DropDown;

@Repository
public interface CarModelRepository extends JpaRepository<CarModel, Long>{

	@Query("select distinct(carMaker) from CarModel")
	List<String> findDistinctByCarMaker();
	
	@Query("select DISTINCT new com.premiumcars.modal.DropDown(c.modelName) from CarModel c where c.carMaker in :carMaker")
	List<DropDown> findDistinctModelNameByCarMaker(String carMaker);
	
	@Query("select DISTINCT new com.premiumcars.entities.Ownership(o.ownerType) from Ownership o")
	List<Ownership> findDistinctOwnership();
	
	@Query("select DISTINCT new com.premiumcars.entities.City(c.cityName) from City c")
	List<City> findDistinctCities();
}

