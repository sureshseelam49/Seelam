package com.seelam.restservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.seelam.restservice.Service.VendorService;
import com.seelam.restservice.entity.Vendor;


@RestController
public class VendorServiceController {
	
	@Autowired
	VendorService vendorService;
	
	@RequestMapping(path = "/getAllVendors",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vendor> getAllVendors(){
	return vendorService.getAllVendors();	
	}
	
	@RequestMapping(path = "/createVendor",method = RequestMethod.POST)
	public Vendor createVendor(@RequestBody Vendor vendor) {
		return vendorService.createVendor(vendor);
	}
	
	@RequestMapping(path = "/findByVendorId/{vendor_code}")
	public Optional<Vendor> findByVendorId(@PathVariable("vendor_code") Long Id) {
		return vendorService.findVendorById(Id);
	}
	@RequestMapping(path = "/updateVendor",method = RequestMethod.POST)
	public Vendor updateVendor(@RequestBody Vendor vendor) {
		return vendorService.updateVendor(vendor);
	}

}
