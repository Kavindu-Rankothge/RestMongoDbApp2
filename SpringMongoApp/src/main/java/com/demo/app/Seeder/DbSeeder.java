package com.demo.app.Seeder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.app.Repository.HotelRepository;
import com.demo.app.model.Address;
import com.demo.app.model.Hotel;
import com.demo.app.model.Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner{
	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public void run(String...strings) throws Exception {
		Hotel marriot = new Hotel(
				"marriot",
				130,
				new Address("Paris","France"),
				Arrays.asList(
						new Review("Jon",8,false),
						new Review("Mary",5,true)
				)
		);
		
		Hotel kingsbury = new Hotel(
				"Kingsbury",
				200,
				new Address("Colombo","Sri Lanka"),
				Arrays.asList(
						new Review("Kavindu",9,false)
				)
		);
		
		Hotel sofie = new Hotel(
				"Sofie",
				231,
				new Address("Berlin","Germany"),
				new ArrayList<>()
		);
		List<Hotel> hotels = Arrays.asList(marriot,kingsbury,sofie);
		
		//drop these tables if they exist
		this.hotelRepository.deleteAll();
		
		//add our hotels to the db;		
		this.hotelRepository.saveAll(hotels);		
	}

}
