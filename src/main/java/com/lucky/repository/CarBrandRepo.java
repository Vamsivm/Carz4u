/**
 * 
 */
package com.lucky.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucky.models.CarBrand;

/**
 * @author Lakshya
 *
 */
@Repository
public interface CarBrandRepo extends JpaRepository<CarBrand, Integer> {
	
	public Optional<CarBrand> findByBname(String name);

}
