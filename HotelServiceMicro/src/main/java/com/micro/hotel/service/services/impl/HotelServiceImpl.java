package com.micro.hotel.service.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.hotel.service.entities.Hotel;
import com.micro.hotel.service.exceptions.ResourceNotFoundException;
import com.micro.hotel.service.repositories.HotelRepository;
import com.micro.hotel.service.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel create(Hotel hotel) {
		// TODO Auto-generated method stub
		String uniqueRandomId = UUID.randomUUID().toString();
		hotel.setHotelId(uniqueRandomId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotel(String id) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Requested resource not Found Exception"+id));
	}

}
