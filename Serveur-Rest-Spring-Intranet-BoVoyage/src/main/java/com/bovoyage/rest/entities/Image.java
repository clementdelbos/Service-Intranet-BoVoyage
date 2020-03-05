package com.bovoyage.rest.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Embeddable
@Access(AccessType.FIELD)
public class Image implements Serializable{

	private String image;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@Column (name="fk_destination")
	private Destination destination;
	
}
