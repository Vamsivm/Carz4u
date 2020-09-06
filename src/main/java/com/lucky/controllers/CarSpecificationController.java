
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
import com.lucky.models.CarSpecification;
import com.lucky.models.CarSpecificationPojo;
import com.lucky.repository.CarSpecRepo;

@RestController
@RequestMapping("/spec")
public class CarSpecificationController {
	@Autowired
	private CarSpecRepo repo;
	
	@PutMapping(path = "/insert",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	private List<CarSpecificationPojo> inserModel(@RequestBody CarSpecificationPojo pojo ) {
		
		ModelMapper mapper = new ModelMapper();
		CarSpecification spec = mapper.map(pojo, CarSpecification.class);
		this.repo.save(spec);
		List<CarSpecification> list = this.repo.findAll();
		List<CarSpecificationPojo> brandPojos = list.stream().map(model1->mapper.map(model1, CarSpecificationPojo.class)).collect(Collectors.toList());
			
		return brandPojos;
	}

	@GetMapping(path="/getModelSpec",produces = MediaType.APPLICATION_JSON_VALUE)
	private CarSpecificationPojo getModelSpec(@RequestParam("csid") String csid) {
		
		CarSpecificationPojo brandPojo = null ;
			
			Optional<CarSpecification> cb =this.repo.findById(Integer.parseInt(csid));
			if(cb.isPresent()) {
				CarSpecification model = cb.get();
				ModelMapper modelMapper = new ModelMapper();
				brandPojo = modelMapper.map(model,CarSpecificationPojo.class);
			}
				
		return brandPojo;

}
}
