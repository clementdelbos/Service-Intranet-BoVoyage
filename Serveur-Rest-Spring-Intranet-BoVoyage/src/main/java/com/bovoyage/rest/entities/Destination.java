package com.bovoyage.rest.entities;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="destinations")
@NamedQuery(name="Destination.findAll", query= "SELECT d FROM Destination d")
@NamedQuery(name="Region.findAll", query= "SELECT distinct region FROM Destination")
public class Destination implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pk_destination")
	private Long id;
	
	private String region;
	
	@Column(name="description")
	private String descriptif;
	
	private int deleted;
	
	@OneToMany(cascade=CascadeType.ALL, fetch= FetchType.LAZY)
	@JoinColumn(name="fk_destination")
	private List<DatesVoyages> datesVoyages = new ArrayList<>();
	

	@Embedded
	@Basic(fetch = FetchType.LAZY)
	private List<Image> images = new ArrayList<>();
	
	public Destination() {}

	public Destination(Long id, String region, String descriptif) {
		this.id = id;
		this.region = region;
		this.descriptif = descriptif;
	
	}


	
}
