package com.lti.projectgladiator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.projectgladiator.dao.BidderInfoDAO;
import com.lti.projectgladiator.dto.BidderInfoDTO;
import com.lti.projectgladiator.dto.BidderStatusDTO;
import com.lti.projectgladiator.entity.BidderInfo;
import com.lti.projectgladiator.entity.Bid;
import com.lti.projectgladiator.service.RegisterService;

@RestController
public class BidderInfoController {
	
	
	  @Autowired 
	  private RegisterService service;
	 
	
	
		
		@RequestMapping(path="/Register" ,method =RequestMethod.POST)
		public BidderStatusDTO register(@RequestBody BidderInfoDTO bidderDTO) {
		
		  System.out.println("hello"); 
		  BidderStatusDTO
		  status=service.addBidder(bidderDTO); 
		  return status;
		 
			
		}
		
}
