package com.example.demo.dto;

import com.example.demo.entity.Vendor;

public class VendorDTO {
	
	
	private int id;

	private String vendor_company;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVendor_company() {
		return vendor_company;
	}

	public void setVendor_company(String vendor_company) {
		this.vendor_company = vendor_company;
	}
	
	public VendorDTO(Vendor vendor) {
		this.id = vendor.getId();
		this.vendor_company = vendor.getVendor_company();
		
		
	}

}
