package com.lucky.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lucky.models.CarModel;
import com.lucky.models.CarModelPojo;
import com.lucky.repository.CarModelRepo;

@RestController
@RequestMapping("/model")
public class CarModelController {
	
	@Autowired
	private CarModelRepo repo;
	
	@PutMapping(path = "/insert",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	private List<CarModelPojo> inserModel(@RequestBody CarModelPojo brandPojo) {
		
		ModelMapper mapper = new ModelMapper();
		CarModel model = mapper.map(brandPojo, CarModel.class);
		this.repo.save(model);
		List<CarModel> list = this.repo.findAll();
		List<CarModelPojo> brandPojos = list.stream().map(model1->mapper.map(model1, CarModelPojo.class)).collect(Collectors.toList());
			
		return brandPojos;
	}
	
	@GetMapping(path="/getModel",produces = MediaType.APPLICATION_JSON_VALUE)
	private CarModelPojo getModel(@RequestParam("cmid") String cmid) {
		
		CarModelPojo brandPojo = null ;
			
			Optional<CarModel> cb =this.repo.findById(Integer.parseInt(cmid));
			if(cb.isPresent()) {
				CarModel model = cb.get();
				ModelMapper modelMapper = new ModelMapper();
				brandPojo = modelMapper.map(model,CarModelPojo.class);
			}
				
		return brandPojo;

}
}
