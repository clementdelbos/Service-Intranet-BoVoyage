package com.bovoyage.rest.entities;



import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * 
 * @author Cl�ment
 *
 */
@Getter
@Setter
@Entity
@ToString
@Table(name="dates_voyages")
@NamedQuery(name="DatesVoyages.findAll", query="SELECT dv FROM DatesVoyages dv")
@NamedQuery(name="DatesVoyages.byIdDestination", query="SELECT d FROM DatesVoyages d WHERE d.destination.id = :pk_destination")

public class DatesVoyages implements Serializable{



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="pk_date_voyage")
	private long id;
	
	@Column (name="date_depart")
	private Date dateAller;
	
	@Column (name="date_retour")
	private Date dateRetour;
	
	@Column (name="prixHT")
	private double tarifUnitaireHT;
	
	@Column (name="nb_places")
	private int nbPlaces;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fk_destination")
	private Destination destination;
	
	private int promotion;
	
	private int deleted;
	
	public DatesVoyages() {}

	public DatesVoyages(Date dateAller, Date dateRetour) {
		this.dateAller = dateAller;
		this.dateRetour = dateRetour;
	}

	public DatesVoyages(long id, Date dateAller, Date dateRetour, double tarifUnitaireHT, int nbPlaces) {
		super();
		this.id = id;
		this.dateAller = dateAller;
		this.dateRetour = dateRetour;
		this.tarifUnitaireHT = tarifUnitaireHT;
		this.nbPlaces = nbPlaces;
	}
	
	public DatesVoyages(Date dateAller, Date dateRetour, double tarifUnitaireHT, int nbPlaces) {
		this.dateAller = dateAller;
		this.dateRetour = dateRetour;
		this.tarifUnitaireHT = tarifUnitaireHT;
		this.nbPlaces = nbPlaces;
	}

	
}
