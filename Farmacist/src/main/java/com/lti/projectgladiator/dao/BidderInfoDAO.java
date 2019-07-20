package com.lti.projectgladiator.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.lti.projectgladiator.entity.BidderInfo;
import com.lti.projectgladiator.entity.Bid;
import com.lti.projectgladiator.entity.Crop;

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
	public int addBiddingDetail(Bid biddreq) {
		System.out.println("dao");
		Bid req=em.merge(biddreq);
		 return req.getBid();
	}
	
	public Crop display(int cropId) {
		
		System.out.println("dao");
		Query q= em.createQuery("select  c from Crop as c where c.id=:br");
		q.setParameter("br", cropId);
		return (Crop) q.getSingleResult();
		
	}
	
public long viewCurrentBid(int cropId) {
		
		/*System.out.println("dao");
		Query q= em.createQuery("select c from Bid as c where c.bidd.id=:br");
		q.setParameter("br", cropId);
		return (Bid) q.getSingleResult();*/
	//Query q= em.createQuery("select c from Bid as c group by c.bidd.id where c.bidd.id=:br");
	Query q= em.createQuery("select max(c.amount) from Bid as c where c.bidd.id=:br");
	q.setParameter("br", cropId);
	return (Long)q.getSingleResult();
	
	
		//select bid0_.b_id as col_0_0_, max(bid0_.b_amount) as col_1_0_ from fs_bidder_req bid0_ where bid0_.req_id=?
		
	}

public Crop fetchByCropId(int cropId) {
	
	Query q= em.createQuery("select c from Crop c where c.id=:br");
	q.setParameter("br", cropId);
	return (Crop) q.getSingleResult();
}

public BidderInfo fetchByBidderId(int bidderId) {
	
	Query q= em.createQuery("select c from BidderInfo c where c.bid=:br");
	q.setParameter("br", bidderId);
	return (BidderInfo) q.getSingleResult();
}

public List<Crop> fetchCrop() {
	Query q=em.createQuery("select c from Crop c where c.cropStatus=0");
	return (List<Crop>)q.getResultList();
}



	
	
	
	/*
	 * @Transactional public void addBidderReq(Bid req) { em.merge(req); }
	 */
	 
}
