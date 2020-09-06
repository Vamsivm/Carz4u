/**
 * 
 */
package com.lucky.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucky.models.CarBrand;
import com.lucky.models.CarSpecification;

/**
 * @author Lakshya
 *
 */
@Repository
public interface CarSpecRepo extends JpaRepository<CarSpecification, Integer> {
	

}
