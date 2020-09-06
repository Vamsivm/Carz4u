package com.lucky.models;

public class CarModelPojo {
	private int cmid;
	private String mdlName;
	private String bodyStyle;
	private int modelYear;
	private CarBrand carBrand;
public int getCmid() {
	return cmid;
}
public void setCmid(int cmid) {
	this.cmid = cmid;
}
public String getMdlName() {
	return mdlName;
}
public void setMdlName(String mdlName) {
	this.mdlName = mdlName;
}
public String getBodyStyle() {
	return bodyStyle;
}
public void setBodyStyle(String bodyStyle) {
	this.bodyStyle = bodyStyle;
}
public int getModelYear() {
	return modelYear;
}
public void setModelYear(int modelYear) {
	this.modelYear = modelYear;
}
public CarBrand getCarBrand() {
	return carBrand;
}
public void setCarBrand(CarBrand carBrand) {
	this.carBrand = carBrand;
} 
   
   
}
