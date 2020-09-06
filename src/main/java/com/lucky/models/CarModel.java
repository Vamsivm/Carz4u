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
@Table(name="CAR_MODEL")
public class CarModel {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
	private int cmid;
   @Column(name = "MODEL_NM")
	private String mdlName;
   @Column(name = "MODEL_BS")
	private String bodyStyle;
   @Column(name = "MODEL_YR")
	private int modelYear;
   @OneToOne()
   @JoinColumn(name = "CBID")
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
