package com.lucky.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table( name = "car_details_vw")
public class CarDetailsPojo {
	@Id
	private int row_num;
	private int cbid;
	@Column(name ="brand_nm" )
	private String bname;
	@Column(name ="brand_ctr" )
	private String country;
	private int cmid;
	public int getRow_num() {
		return row_num;
	}
	public void setRow_num(int row_num) {
		this.row_num = row_num;
	}
	@Column(name ="model_nm" )
	private String mdlName;
	@Column(name ="model_bs" )
	private String bodyStyle;
	@Column(name ="model_yr" )
	private int modelYear;
	private int csid;
	private String color;
	private String engine;
	@Column(name ="seat_cap" )
	private int seatCapacity;
	@Column(name ="trans" )
	private String transmission;
	@Column(name ="cylinder_no" )
	private int cylinderNO;
	
	public int getCbid() {
		return cbid;
	}
	public void setCbid(int cbid) {
		this.cbid = cbid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
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
	
	

}
