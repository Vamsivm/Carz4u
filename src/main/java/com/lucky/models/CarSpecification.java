package com.lucky.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CAR_SPEC")
public class CarSpecification {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int csid;
	@Column(name = "COLOR")
	
	private String color;
	@Column(name = "ENGINE")
	private String engine;
	@Column(name = "SEAT_CAP")
	private int seatCapacity;
	@Column(name = "TRANSMISSION")
	private String transmission;
	@Column(name = "CYLINDER_NO")
	private int cylinderNO;
	@OneToOne()
	@JoinColumn(name = "cmid")
	private CarModel carModel;
	public int getCsid() {
		return csid;
	}
	public void setCsid(int csid) {
		this.csid = csid;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public int getCylinderNO() {
		return cylinderNO;
	}
	public void setCylinderNO(int cylinderNO) {
		this.cylinderNO = cylinderNO;
	}
	public CarModel getCarModel() {
		return carModel;
	}
	public void setCarModel(CarModel carModel) {
		this.carModel = carModel;
	}
	
}
