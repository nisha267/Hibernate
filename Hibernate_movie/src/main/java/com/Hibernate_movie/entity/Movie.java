package com.Hibernate_movie.entity;

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


	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@Entity
	@Table(name="MovieShowTime")
	public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column (length =30,nullable =false, unique = true)
	private String name;
	@Column(length =20,nullable =false)
	private String genre;
	@Column(length =20,nullable =false)
	private String showtiming;
	@Column(length =11,nullable =false)
	private double price;

	}


