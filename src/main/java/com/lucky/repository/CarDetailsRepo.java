/**
 * 
 */
package com.lucky.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucky.models.CarBrand;
import com.lucky.models.CarDetailsPojo;

/**
 * @author Lakshya
 *
 */
@Repository
public interface CarDetailsRepo extends JpaRepository<CarDetailsPojo, Integer> {
	
	public Optional<List<CarDetailsPojo>> findByBname(String name);

}
