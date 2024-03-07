package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.VendorDTO;
import com.example.demo.entity.Vendor;
import com.example.demo.repository.VendorRepository;

@Service
public class VendorService {

	
	@Autowired
    private VendorRepository vendorRepository;

    public List<VendorDTO> getAllVendors() {
         List<Vendor> vendorsList = vendorRepository.findAll();
         
         List<VendorDTO> vendors = new ArrayList<>();
         
         for(Vendor vendor:vendorsList) {
        	 vendors.add(new VendorDTO(vendor));
         }
         
         return vendors;
    }

    public Vendor getVendorById(Integer vendorId) {
        return vendorRepository.findById(vendorId).orElse(null);
    }

    public Vendor createVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }
}
