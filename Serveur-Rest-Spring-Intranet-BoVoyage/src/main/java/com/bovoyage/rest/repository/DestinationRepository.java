package com.bovoyage.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bovoyage.rest.dto.DestinationDto;
import com.bovoyage.rest.entities.Destination;


public interface DestinationRepository extends JpaRepository<Destination, Long>{

//	@Query("SELECT distinct region FROM DestinationDto")
//	List<String> findAllRegions();
	
	
}
