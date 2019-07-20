package com.lti.projectgladiator.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.projectgladiator.dto.BidderLoginDTO;
import com.lti.projectgladiator.dto.FarmerLoginDTO;
import com.lti.projectgladiator.entity.BidderInfo;
import com.lti.projectgladiator.entity.FarmerInfo;

@Repository
public class BidderLoginDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

public String fetchByUsername(BidderLoginDTO loginDTO) {
	
		try {
		Query q = entityManager.createQuery("select a from BidderInfo as a where a.bname=:em and a.bpassword=:pwd");
		q.setParameter("em", loginDTO.getUsername());
		q.setParameter("pwd", loginDTO.getPassword());
		
		BidderInfo bidder = (BidderInfo)q.getSingleResult();
		return bidder.getBname();
		}
		catch(Exception e) {
			return "fail";
		}
		
		//return (AdminInfo) q.getSingleResult();
		
		
	}
}
