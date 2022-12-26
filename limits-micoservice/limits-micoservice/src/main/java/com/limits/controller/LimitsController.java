package com.limits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limits.configration.PropertiesVariable;
import com.limits.entity.Limits;

@RestController
public class LimitsController {
	@Autowired
	private PropertiesVariable configration;
	
	@GetMapping("/limits")
	public Limits retriveLimit() {
		return new Limits(configration.getMinLimit(),configration.getMaxLimit());
	}

}
