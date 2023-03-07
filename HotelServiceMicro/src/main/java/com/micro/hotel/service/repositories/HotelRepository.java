package com.micro.hotel.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.micro.hotel.service.entities.Hotel;

@RequestMapping
public interface HotelRepository extends JpaRepository<Hotel, String>{
	
}
