package com.demo.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.app.Repository.HotelRepository;
import com.demo.app.model.Hotel;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	@GetMapping("/all")
	public List<Hotel> getAll(){
		List<Hotel> hotels = this.hotelRepository.findAll();
		return hotels;
	}
}
