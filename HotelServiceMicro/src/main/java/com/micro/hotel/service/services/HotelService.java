package com.micro.hotel.service.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micro.hotel.service.entities.Hotel;


public interface HotelService {

	//create
	Hotel create(Hotel hotel);
	
	
	//getall
	List<Hotel> getAllHotels();
	
	//getsingle 
	Hotel getHotel(String id);
	
}
