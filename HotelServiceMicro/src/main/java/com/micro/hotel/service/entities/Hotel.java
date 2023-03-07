package com.micro.hotel.service.entities;

import javax.persistence.Entity;
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
@Table(name = "HOTELS")
public class Hotel {

	@Id
	private String hotelId;
	private String name;
	private String location;
	private String about;
	
}
