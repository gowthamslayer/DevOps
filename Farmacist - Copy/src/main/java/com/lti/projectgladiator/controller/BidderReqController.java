package com.lti.projectgladiator.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.projectgladiator.dao.BidderInfoDAO;
import com.lti.projectgladiator.dto.BidderRequestDTO;
import com.lti.projectgladiator.dto.BiddingDTO;
import com.lti.projectgladiator.dto.BiddingStatusDTO;
import com.lti.projectgladiator.dto.CurrentBidDTO;
import com.lti.projectgladiator.entity.BidderRequest;
import com.lti.projectgladiator.entity.SetBid;
import com.lti.projectgladiator.service.BidderService;
import com.lti.projectgladiator.service.RegisterService;

@RestController
public class BidderReqController {

	@Autowired
	private BidderService service;
	
	@RequestMapping(path="/BidderRequest" ,method =RequestMethod.POST)
	public SetBid add(@RequestBody BidderRequestDTO dto/*Map<String,Object> model*/) {
	
		System.out.println("controller");
		SetBid reqq=service.fetch(dto);
	/*	model.put("biddingid", reqq.getId());
		model.put("cropname", reqq.getCropname());
		model.put("cropvariety", reqq.getCropvariety());
		model.put("croptype", reqq.getCroptype());
		model.put("cropquantity", reqq.getCropquantity());*/
		return reqq;
	}
	
	@RequestMapping(path="/bidview" ,method =RequestMethod.POST)
	public BidderRequest viewBid(@RequestBody CurrentBidDTO dto/*Map<String,Object> model*/) {
	
		System.out.println("controller");
		BidderRequest reqq=service.bidAmount(dto);
	/*	model.put("biddingid", reqq.getId());
		model.put("cropname", reqq.getCropname());
		model.put("cropvariety", reqq.getCropvariety());
		model.put("croptype", reqq.getCroptype());
		model.put("cropquantity", reqq.getCropquantity());*/
		return reqq;
	}
	
	
	@RequestMapping(path="/BiddingInsert" ,method =RequestMethod.POST)
	public BiddingStatusDTO biddingInsert(@RequestBody BiddingDTO dto/*Map<String,Object> model*/) {
	
		System.out.println("controller");
		BiddingStatusDTO reqq=service.bidderPut(dto);
	/*	model.put("biddingid", reqq.getId());
		model.put("cropname", reqq.getCropname());
		model.put("cropvariety", reqq.getCropvariety());
		model.put("croptype", reqq.getCroptype());
		model.put("cropquantity", reqq.getCropquantity());*/
		return reqq;
	}
}
