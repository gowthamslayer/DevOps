package com.lti.projectgladiator.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.lti.projectgladiator.entity.BidderInfo;
import com.lti.projectgladiator.entity.BidderRequest;

@Repository
public class BidderInfoDAO {
	
	@PersistenceContext
	 EntityManager em;
	
	@Transactional
	public int addBidder(BidderInfo info) {
		System.out.println("dao");
		 BidderInfo bidder=em.merge(info);
		 return bidder.getBid();
	}
	
	/*
	 * @Transactional public void addBidderReq(BidderRequest req) {
	 * 
	 * em.merge(req);
	 * 
	 * }
	 */
}
