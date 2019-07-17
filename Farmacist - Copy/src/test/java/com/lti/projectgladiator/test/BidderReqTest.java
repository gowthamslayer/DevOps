package com.lti.projectgladiator.test;

import static org.junit.Assert.*;

import java.awt.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.lti.projectgladiator.dao.BidderInfoDAO;
import com.lti.projectgladiator.entity.BidderRequest;
import com.lti.projectgladiator.entity.SetBid;

@RunWith(SpringRunner.class)
@DataJpaTest
@Rollback(false)
@AutoConfigureTestDatabase(replace=Replace.NONE)

public class BidderReqTest {

	@Autowired
	private BidderInfoDAO dao;
	@Test
	public void test() {
		SetBid bid= dao.display(98);
		System.out.println(bid.getCropname());
}
}
