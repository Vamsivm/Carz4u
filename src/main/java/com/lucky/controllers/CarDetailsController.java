package com.lucky.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lucky.models.CarDetailsDTO;
import com.lucky.models.CarDetailsPojo;
import com.lucky.repository.CarDetailsRepo;

@RestController
@RequestMapping("/cardetails")
public class CarDetailsController {
	
	@Autowired
	private CarDetailsRepo repo;
	
	@GetMapping(path = "/byBrand",produces = MediaType.APPLICATION_JSON_VALUE)
 private List<CarDetailsDTO> getCarDetails(@RequestParam("bname")String name){
		List<CarDetailsDTO> carDetailsDTOs = null;
		Optional<List<CarDetailsPojo>>  o =this.repo.findByBname(name);
		
		if(o.isPresent()) {
			
			List<CarDetailsPojo> carDetailsPojos = o.get();	
			if(null!=carDetailsPojos) {
				ModelMapper mapper = new ModelMapper();
				List<CarDetailsDTO> list =carDetailsPojos.stream()
				.map(carDetails->mapper.map(carDetails, CarDetailsDTO.class)).
				collect(Collectors.toList());
				carDetailsDTOs = list;
			}
		}
	 
		return carDetailsDTOs;
 }
	
}
