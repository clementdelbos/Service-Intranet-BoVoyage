package com.bovoyage.rest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="commerciaux")
public class Commercial {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pk_commercial")
	private Long id;
	
	private String username;
	
	private String password;
	
}
