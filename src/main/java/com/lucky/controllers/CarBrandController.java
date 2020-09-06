package com.lucky.controllers;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lucky.models.CarBrand;
import com.lucky.models.CarBrandPojo;
import com.lucky.repository.CarBrandRepo;

@RestController
@RequestMapping("/brand")
public class CarBrandController {

	@Autowired
	private CarBrandRepo repo;
	@GetMapping("/test")
	private String test() {
		
		return "Welcome!";
	}
	
	@PostMapping(path ="/insert",consumes = MediaType.APPLICATION_JSON_VALUE)
	private String insertBrand(@RequestBody CarBrandPojo pojo) {
		
		String resposne="not ok!";
		try {
		ModelMapper modelMapper = new ModelMapper();
		CarBrand cb =modelMapper.map(pojo, CarBrand.class);
		this.repo.save(cb);
		resposne="ok!";
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return resposne;
		
	}
	
	@GetMapping(path="/getBrand",produces = MediaType.APPLICATION_JSON_VALUE)
	private CarBrandPojo getBrand(@RequestParam("cbid") String cbid) {
		
		CarBrandPojo brandPojo = null ;
			
			Optional<CarBrand> cb =this.repo.findById(Integer.parseInt(cbid));
			if(cb.isPresent()) {
				CarBrand brand = cb.get();
				ModelMapper modelMapper = new ModelMapper();
				brandPojo = modelMapper.map(brand,CarBrandPojo.class);
			}
				
		return brandPojo;
		
		
}
	
	@GetMapping(path="/getBrandByName",produces = MediaType.APPLICATION_JSON_VALUE)
	private CarBrandPojo getBrandByName(@RequestParam("name") String name) {
		
		CarBrandPojo brandPojo = null ;
			
			Optional<CarBrand> cb =this.repo.findByBname(name);
			if(cb.isPresent()) {
				CarBrand brand = cb.get();
				ModelMapper modelMapper = new ModelMapper();
				brandPojo = modelMapper.map(brand,CarBrandPojo.class);
			}
				
		return brandPojo;
		
		
}
	
	@DeleteMapping(path="/deleteByName",produces = MediaType.APPLICATION_JSON_VALUE)
	private List<CarBrandPojo> deleteByName(@RequestParam("name") String name) {
		
		List<CarBrandPojo> brandPojos = null ;
			
			Optional<CarBrand> cb =this.repo.findByBname(name);
			if(cb.isPresent()) {
				this.repo.deleteById(cb.get().getCbid());
				List<CarBrand> brands = this.repo.findAll();
				ModelMapper modelMapper = new ModelMapper();
				brandPojos = brands.stream()
						.map(brand->
				modelMapper.map(brand, CarBrandPojo.class))
						.collect(Collectors.toList());
			}
				
		return brandPojos;
		
		
}	
	
}
