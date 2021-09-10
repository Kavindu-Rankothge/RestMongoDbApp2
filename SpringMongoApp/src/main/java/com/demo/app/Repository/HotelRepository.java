package com.demo.app.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.app.model.Hotel;

@Repository
public interface HotelRepository extends MongoRepository<Hotel,String>{
	Hotel findByid(String id);
	List<Hotel> findByPricePerNightLessThan(int maxPrice);
	
	//monogDb query language
	@Query(value = "{'address.country':?0}")
	List<Hotel> findByCountry(String country);

}
