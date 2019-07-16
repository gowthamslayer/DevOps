package com.lti.projectgladiator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lti.projectgladiator.dao.BidderInfoDAO;
import com.lti.projectgladiator.entity.BidderRequest;

public class BidderReqTest {

	@Autowired
	private BidderInfoDAO dao;
	@Test
	public void test(BidderRequest req) {
		
		dao.addBidderReq(req);
		
	}

}
