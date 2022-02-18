package com.seelam.restservice.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "VENDOR")
public class Vendor {
	
	@Id
	@Column(name = "VENDOR_CODE", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long vCode;
	@Column(name = "VENDOR_NAME", nullable = false)
	private String vName;
	@Column(name = "VENDOR_EMAIL", nullable = false)
	private String vEmail;
	@Column(name = "VENDOR_CONTACT", nullable = false)
	private String vContact;
	@Column(name = "VENDOR_WEBSITE", nullable = false)
	private String vWebsite;
	@Column(name = "VENDOR_ADDRESS", nullable = false)
	private String vAddress;
	@Column(name = "VENDOR_CREATEDAT", nullable = false)
	private Date vCreatedAt;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "VENDOR_ID",referencedColumnName ="VENDOR_CODE")
	List<Address> addresses;
	
	public Vendor() {
		
	}
	
	public Vendor(Long vCode, String vName, String vEmail, String vContact, String vWebsite, String vAddress,
			Date vCreatedAt, List<Address> addresses) {
		super();
		this.vCode = vCode;
		this.vName = vName;
		this.vEmail = vEmail;
		this.vContact = vContact;
		this.vWebsite = vWebsite;
		this.vAddress = vAddress;
		this.vCreatedAt = vCreatedAt;
		this.addresses = addresses;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public Long getvCode() {
		return vCode;
	}
	public void setvCode(Long vCode) {
		this.vCode = vCode;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public String getvEmail() {
		return vEmail;
	}
	public void setvEmail(String vEmail) {
		this.vEmail = vEmail;
	}
	public String getvContact() {
		return vContact;
	}
	public void setvContact(String vContact) {
		this.vContact = vContact;
	}
	public String getvWebsite() {
		return vWebsite;
	}
	public void setvWebsite(String vWebsite) {
		this.vWebsite = vWebsite;
	}
	public String getvAddress() {
		return vAddress;
	}
	public void setvAddress(String vAddress) {
		this.vAddress = vAddress;
	}
	public Date getvCreatedAt() {
		return vCreatedAt;
	}
	public void setvCreatedAt(Date vCreatedAt) {
		this.vCreatedAt = vCreatedAt;
	}
	
	

}
