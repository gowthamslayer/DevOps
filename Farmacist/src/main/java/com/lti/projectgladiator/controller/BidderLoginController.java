package com.lti.projectgladiator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.projectgladiator.dto.BidderLoginDTO;
import com.lti.projectgladiator.service.BidderLoginService;

@RestController
public class BidderLoginController {

	@Autowired
	private BidderLoginService service;
	
	@RequestMapping(path="/bidderLogin", method=RequestMethod.POST)
	public String BidderValidation(@RequestBody BidderLoginDTO LoginDTO){
		return service.bidderValid(LoginDTO);
	}
}
