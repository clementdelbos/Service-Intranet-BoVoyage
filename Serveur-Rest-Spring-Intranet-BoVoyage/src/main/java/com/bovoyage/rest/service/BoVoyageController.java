package com.bovoyage.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bovoyage.rest.dto.DestinationDto;
import com.bovoyage.rest.entities.DatesVoyages;


import com.bovoyage.rest.repository.DatesVoyagesRepository;
import com.bovoyage.rest.repository.DestinationDtoRepository;


@RestController
@RequestMapping("/bovoyage")
public class BoVoyageController {


	@Autowired DatesVoyagesRepository repoDatesVoyages;
	@Autowired DestinationDtoRepository repoDestinationDto;

	
	
	//////////////////////////////////GET ALL////////////////////////////////////
	
		/////DESTINATIONS/////
	@GetMapping("/destinations/all")
	public List<DestinationDto> getAllDestinations(){
		return repoDestinationDto.findAll();
	}
	
	//BONUS/////REGIONS/////
	@GetMapping("/destination/region/all")
	List <String> findAllRegions(){
		
		return repoDestinationDto.findAllRegions();
	}

	
	//////////////////////////////////GET BY ID////////////////////////////////////
	
		/////DATESVOYAGES BY ID/////
	@GetMapping("/datesvoyages/id/{id}")
	public DatesVoyages getDatesVoyagesById(@PathVariable("id") Long id) {
		
		Optional<DatesVoyages> datesvoyages = repoDatesVoyages.findById(id);
		if(!datesvoyages.isPresent())
		{
			throw new RuntimeException("id non trouvé : "+id);
		}		
		return datesvoyages.get();
	}
//		/////DATESVOYAGES BY DESTINATION ID/////
//	@GetMapping("/datesvoyages/destinationid/{id}")
//	public List<DatesVoyages> getDatesVoyagesByDestinationId(@PathVariable("id") Long id){
//		
//		return repoDatesVoyages.findDatesVoyagesByDestinationId(id);
//	}
		/////DESTINATION BY ID/////			
	@GetMapping("/destination/id/{id}")
	public DestinationDto getDestinationById(@PathVariable("id") Long id) {
		
		Optional<DestinationDto> destinationdto = repoDestinationDto.findById(id);
		if(!destinationdto.isPresent())
		{
			throw new RuntimeException("id non trouvé : "+id);
		}		
		return destinationdto.get();
	}


	 
	//////////////////////////////////CREATE AND UPDATE////////////////////////////////////
	
	/////CREATE DESTINATION/////
	@PostMapping("/destination/new")
	public void createDestination(@RequestBody DestinationDto destinationdto) {
		
		repoDestinationDto.save(destinationdto);
	}
	
	/////CREATE OR UPDATE CLIENT/////
//	@PostMapping("/client/new")
//	public void createClient(@RequestParam(name="nom") String nom, @RequestParam(name = "mdp") String mdp) {
//		repoClient.saveClient(nom,mdp);
//	} 

	
	
	//////////////////////////////////DELETE BY ID////////////////////////////////////

}