package com.lti.projectgladiator.service;

import java.io.File;
import java.io.IOException;





import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.projectgladiator.dao.BidderInfoDAO;
import com.lti.projectgladiator.dto.BidderInfoDTO;
import com.lti.projectgladiator.dto.BidderRequestDTO;
import com.lti.projectgladiator.dto.BidderStatusDTO;
import com.lti.projectgladiator.entity.BidderInfo;
import com.lti.projectgladiator.entity.BidderRequest;
import com.lti.projectgladiator.entity.SetBid;


@Service
public class RegisterService {
	
	@Autowired
	private BidderInfoDAO dao;

	public BidderStatusDTO addBidder(BidderInfoDTO bidderDTO) {
		
		System.out.println("Service");
		/*
		 * String path = "d:/AadharCard/"; String filename=bidderDTO.getUsername()
		 * +"-"+bidderDTO.getBtnaadhar().getOriginalFilename(); String finalpath = path
		 * +filename; try { bidderDTO.getBtnaadhar().transferTo(new File(finalpath)); }
		 * catch (IOException e) { e.printStackTrace(); }
		 * 
		 * 
		 * String path1 = "d:/PanCard/"; String filename1=bidderDTO.getUsername()
		 * +"-"+bidderDTO.getBtnpan().getOriginalFilename(); String finalpath1 = path1
		 * +filename1; try { bidderDTO.getBtnpan().transferTo(new File(finalpath1)); }
		 * catch (IOException e) { e.printStackTrace(); }
		 * 
		 * String path2 = "d:/TradersLicense/"; String filename2=bidderDTO.getUsername()
		 * +"-"+bidderDTO.getBtntrade().getOriginalFilename(); String finalpath2 = path2
		 * +filename2; try { bidderDTO.getBtntrade().transferTo(new File(finalpath2)); }
		 * catch (IOException e) { e.printStackTrace(); }
		 */
		 
		 
		
		BidderInfo bidder=new BidderInfo();
		bidder.setBname(bidderDTO.getUsername());
		bidder.setBcontactno(bidderDTO.getContactno());
		bidder.setBemail(bidderDTO.getEmail());
		bidder.setBaddress(bidderDTO.getAddressline());
		bidder.setBcity(bidderDTO.getCity());
		bidder.setBstate(bidderDTO.getState());
		bidder.setBpincode(bidderDTO.getPincode());
		bidder.setBaccno(bidderDTO.getAccountno());
		bidder.setBifsc(bidderDTO.getIfsccode());
		bidder.setBpassword(bidderDTO.getPassword());
		
		bidder.setBaadhaar(bidderDTO.getBtnaadhar());
		bidder.setBpan(bidderDTO.getBtnpan());
		bidder.setBtraderlicense(bidderDTO.getBtntrade());
		 
		 
		
       int id= dao.addBidder(bidder);
       
       BidderStatusDTO status = new BidderStatusDTO();
		status.setId(id);
		status.setMessage("Registered Successfully");
		return status;		
	}
	
}
