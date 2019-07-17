package com.lti.projectgladiator.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.projectgladiator.dao.BidderInfoDAO;
import com.lti.projectgladiator.dto.BidderRequestDTO;
import com.lti.projectgladiator.dto.BidderStatusDTO;
import com.lti.projectgladiator.dto.BiddingDTO;
import com.lti.projectgladiator.dto.BiddingStatusDTO;
import com.lti.projectgladiator.dto.CurrentBidDTO;
import com.lti.projectgladiator.entity.BidderInfo;
import com.lti.projectgladiator.entity.BidderRequest;
import com.lti.projectgladiator.entity.SetBid;

import oracle.net.aso.b;

@Service
public class BidderService {

	@Autowired
	private BidderInfoDAO dao;
	
public SetBid fetch(BidderRequestDTO dto) {
		
		System.out.println("service");
		//int id=dto.getBidderid();
		int idd=dto.getCropId();
		SetBid dd=dao.display(idd);
		return dd;
		
	}

public BidderRequest bidAmount(CurrentBidDTO dto) {
	
	System.out.println("service");
	//int id=dto.getBidderid();
	int idd=dto.getCropId();
	BidderRequest dd=dao.viewCurrentBid(idd);
	return dd;
	
}

public BiddingStatusDTO bidderPut(BiddingDTO dto) {
	
		/*
		 * System.out.println("service"); //int id=dto.getBidderid(); int
		 * idd=dto.getCropId(); BidderRequest dd=dao.viewCurrentBid(idd); return dd
		 */;
		 
		 BidderRequest bidreq=new BidderRequest();
		 
		 SetBid setbid=(SetBid)dao.fetchByCropId(dto.getCropId()) ;
		 
		 BidderInfo infoo=dao.fetchByBidderId(dto.getBidderId());
		 
		 bidreq.setAmount(dto.getMoney());
		 bidreq.setDate(new Date());
		 bidreq.setBidd(setbid);
		 bidreq.setInfo(infoo);
		 
		 int biddid=dao.addBiddingDetail(bidreq);
		 
		    BiddingStatusDTO stat = new BiddingStatusDTO();
			stat.setId(biddid);
			stat.setMessage("Bidding Registered Successfully");
			return stat;		
	     
}


}

