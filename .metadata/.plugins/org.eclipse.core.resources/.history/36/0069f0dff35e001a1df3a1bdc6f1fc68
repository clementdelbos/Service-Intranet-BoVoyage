package com.bovoyage.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bovoyage.rest.dto.DestinationDto;


public interface DestinationDtoRepository extends JpaRepository<DestinationDto, Long>{

	@Query("SELECT distinct region FROM DestinationDto")
	List<String> findAllRegions();
	
	
}
