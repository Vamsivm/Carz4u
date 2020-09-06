package com.lucky.models;

public class CarSpecificationPojo {

	private int csid;
	
	private String color;
	private String engine;
	private int seatCapacity;
	private String transmission;
	private int cylinderNO;
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
