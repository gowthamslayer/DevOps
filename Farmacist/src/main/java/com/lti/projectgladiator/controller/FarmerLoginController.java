package com.lti.projectgladiator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.projectgladiator.dto.BidderLoginDTO;
import com.lti.projectgladiator.dto.FarmerLoginDTO;
import com.lti.projectgladiator.service.BidderLoginService;
import com.lti.projectgladiator.service.FarmerLoginService;

@RestController
public class FarmerLoginController {

	@Autowired
	private FarmerLoginService service;
	
	@RequestMapping(path="/farmerLogin", method=RequestMethod.POST)
	public String FarmerValidation(@RequestBody FarmerLoginDTO LoginDTO){
		return service.farmerValid(LoginDTO);
	}
}
