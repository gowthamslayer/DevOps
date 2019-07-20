package com.lti.projectgladiator.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.projectgladiator.dao.BidderInfoDAO;
import com.lti.projectgladiator.dto.BidderRequestDTO;
import com.lti.projectgladiator.dto.BidderStatusDTO;
import com.lti.projectgladiator.dto.BiddingDTO;
import com.lti.projectgladiator.dto.BiddingStatusDTO;
import com.lti.projectgladiator.dto.CurrentBidDTO;
import com.lti.projectgladiator.entity.Bid;
import com.lti.projectgladiator.entity.BidderInfo;

import com.lti.projectgladiator.entity.Crop;

@Service
public class BidderService {

	@Autowired
	private BidderInfoDAO dao;
	
public Crop fetch(BidderRequestDTO dto) {
		
		System.out.println("service");
		//int id=dto.getBidderid();
		int idd=dto.getCropId();
		Crop dd=dao.display(idd);
		return dd;
		
	}

//public Bid bidAmount(CurrentBidDTO dto)
public long bidAmount(CurrentBidDTO dto){
	
	System.out.println("service");
	//int id=dto.getBidderid();
	int idd=dto.getCropId();
	Long dd=(Long) dao.viewCurrentBid(idd);
	return dd;
	//return dao.viewCurrentBid(id);
	
	
}

public BiddingStatusDTO bidderPut(BiddingDTO dto) {
	
		/*
		 * System.out.println("service"); //int id=dto.getBidderid(); int
		 * idd=dto.getCropId(); BidderRequest dd=dao.viewCurrentBid(idd); return dd
		 */;
		 
		 Bid bidreq=new Bid();
		 
		 Crop setbid=(Crop)dao.fetchByCropId(dto.getCropId()) ;
		 
		 BidderInfo infoo=dao.fetchByBidderId(dto.getBidderId());
		 
		 Date date = new java.util.Date();
		 long t = date.getTime();
		/*
		 * SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 * Date date = new Date(); System.out.println(formatter.format(date));
		 */
		 int idd=dto.getCropId();
		Long dd=(Long) dao.viewCurrentBid(idd);
		
		
		if(dd+100<=dto.getMoney()) {
				 bidreq.setAmount(dto.getMoney());
				 bidreq.setDate(new java.sql.Date(t));
				 bidreq.setBidd(setbid);
				 bidreq.setInfo(infoo);
				/*
				 * bidreq.setAmount(dto.getMoney()); bidreq.setDate(new Date());
				 * bidreq.setBidd(setbid); bidreq.setInfo(infoo);
				 */		 
				 int biddid=dao.addBiddingDetail(bidreq);
				    BiddingStatusDTO stat = new BiddingStatusDTO();
					stat.setId(biddid);
					stat.setMessage("Bidding Registered Successfully");
					return stat;
			}
			
	
		
		else {
			    BidderInfo bidderin=dao.fetchByBidderId(dto.getBidderId());
			    int biddid=bidderin.getBid();
			    BiddingStatusDTO stat = new BiddingStatusDTO();
			    stat.setId(biddid);
				stat.setMessage("Enter atleast RS.100 Greater than the Current bid");
				return stat;		
		}
		 
		 
		
	     
}

public List<Crop> fetchAllCrops() {
	
	List<Crop> list=dao.fetchCrop();
	
	return list;
}


}

