package com.bovoyage.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bovoyage.rest.entities.DatesVoyages;

public interface DatesVoyagesRepository extends JpaRepository<DatesVoyages, Long>{

	@Query("SELECT dv FROM DatesVoyages dv INNER JOIN dv.destination d WHERE d.id = ?1")
	List<DatesVoyages> findDatesVoyagesByDestinationId(Long id);
	
}
