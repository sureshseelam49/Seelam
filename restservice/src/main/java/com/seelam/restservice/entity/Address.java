package com.seelam.restservice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ADDRESS_ID", nullable = false)	
	private Long id;
	@Column(name = "ADDRESS_TYPE", nullable = false)
	private String addressType;
	@Column(name = "STREET", nullable = false)
	private String street;
	@Column(name = "BUILDING_NO", nullable = false)
	private String building;
	@Column(name = "AREA", nullable = false)
	private String area;
	@Column(name = "PINCODE", nullable = false)
	private String pincode;
	@Column(name = "CITY", nullable = false)
	private String city;
	@Column(name = "STATE", nullable = false)
	private String state;
	@Column(name = "CREATEDAT", nullable = false)
	private Date createdAt;
	
	public Address() {
		
	}
	
	public Address(Long id, String addressType, String street, String building, String area, String pincode,
			String city, String state, Date createdAt) {
		super();
		this.id = id;
		this.addressType = addressType;
		this.street = street;
		this.building = building;
		this.area = area;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.createdAt = createdAt;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
