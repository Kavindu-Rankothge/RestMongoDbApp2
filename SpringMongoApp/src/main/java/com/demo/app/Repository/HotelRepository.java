package com.demo.app.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.app.model.Hotel;

@Repository
public interface HotelRepository extends MongoRepository<Hotel,String>{
	

}
