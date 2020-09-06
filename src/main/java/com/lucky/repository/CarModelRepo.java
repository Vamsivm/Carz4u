/**
 * 
 */
package com.lucky.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucky.models.CarBrand;
import com.lucky.models.CarModel;

/**
 * @author Lakshya
 *
 */
@Repository
public interface CarModelRepo extends JpaRepository<CarModel, Integer> {
	
	public Optional<CarModel> findByMdlName(String name);

}
