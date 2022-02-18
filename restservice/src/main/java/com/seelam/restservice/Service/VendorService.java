package com.seelam.restservice.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seelam.restservice.entity.Address;
import com.seelam.restservice.entity.Vendor;
import com.seelam.restservice.interfaces.IVendor;

@Component
public class VendorService implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	IVendor vendorInterface;
	public List<Vendor> getAllVendors(){
		return vendorInterface.findAll();	
	}
	
	public Vendor createVendor(Vendor vendor) {
		return vendorInterface.saveAndFlush(vendor);
	}
	
	public Optional<Vendor> findVendorById(Long Id) {
		return vendorInterface.findById(Id);
	}
	
	public Vendor updateVendor(Vendor vendor) {
		if(vendorInterface.existsById(vendor.getvCode())) {
			return vendorInterface.save(vendor);
		}else {
			System.out.println("No vendor available with ID :"+vendor.getvCode());
		}
		return null;
		
		
	}

}
