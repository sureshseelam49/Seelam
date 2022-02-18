package com.seelam.restservice.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.seelam.restservice.entity.Vendor;

@Component
public interface IVendor extends JpaRepository<Vendor, Long> {

}
