package com.lucky.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAR_BRAND")
public class CarBrand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cbid;
	@Column(name = "BRAND_NM")
	private String bname;
	@Column(name = "BRAND_CTR")
	private String country;
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
	
	

}
