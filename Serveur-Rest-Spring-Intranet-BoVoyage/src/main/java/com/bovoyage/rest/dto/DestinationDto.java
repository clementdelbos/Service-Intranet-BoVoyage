package com.bovoyage.rest.dto;


import com.bovoyage.rest.entities.Destination;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DestinationDto{

	private Long id;
	private String region;
	private String description;
	private int deleted;
	
	public DestinationDto(Destination destination) {
		this.id = destination.getId();
		this.region = destination.getRegion();
		this.description =destination.getDescriptif();
		this.deleted=destination.getDeleted();
	}
	
	
	
}
