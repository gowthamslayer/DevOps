package com.lti.projectgladiator.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.lti.projectgladiator.entity.BidderInfo;
import com.lti.projectgladiator.entity.BidderRequest;
import com.lti.projectgladiator.entity.SetBid;

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
	
	@Transactional
	public int addBiddingDetail(BidderRequest biddreq) {
		System.out.println("dao");
		BidderRequest req=em.merge(biddreq);
		 return req.getBid();
	}
	
	public SetBid display(int cropId) {
		
		System.out.println("dao");
		Query q= em.createQuery("select  c from SetBid as c where c.id=:br");
		q.setParameter("br", cropId);
		return (SetBid) q.getSingleResult();
		
	}
	
public BidderRequest viewCurrentBid(int cropId) {
		
		System.out.println("dao");
		Query q= em.createQuery("select c from BidderRequest as c where c.bidd.id=:br");
		q.setParameter("br", cropId);
		return (BidderRequest) q.getSingleResult();
		
	}

public SetBid fetchByCropId(int cropId) {
	
	Query q= em.createQuery("select c from SetBid c where c.id=:br");
	q.setParameter("br", cropId);
	return (SetBid) q.getSingleResult();
}

public BidderInfo fetchByBidderId(int bidderId) {
	
	Query q= em.createQuery("select c from BidderInfo c where c.bid=:br");
	q.setParameter("br", bidderId);
	return (BidderInfo) q.getSingleResult();
}
	
	
	
	/*
	 * @Transactional public void addBidderReq(BidderRequest req) { em.merge(req); }
	 */
	 
}
