package com.lti.projectgladiator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.projectgladiator.dao.BidderLoginDAO;
import com.lti.projectgladiator.dao.FarmerLoginDAO;
import com.lti.projectgladiator.dto.BidderLoginDTO;
import com.lti.projectgladiator.dto.FarmerLoginDTO;
import com.lti.projectgladiator.entity.Crop;
import com.lti.projectgladiator.entity.FarmerInfo;

@Service
public class FarmerLoginService {
	
	@Autowired
	private FarmerLoginDAO dao;

	//public AdminInfo adminValid(String email)
		public String farmerValid(FarmerLoginDTO loginDTO){
			return dao.fetchByUsername(loginDTO);
			
		}
		
		
		
		/*
		 * public List<BidderInfo> fetchAllBidders(){ return
		 * adminDao.fetchAll(BidderInfo.class); }
		 */
		
		

}
