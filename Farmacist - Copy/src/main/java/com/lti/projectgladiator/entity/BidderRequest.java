package com.lti.projectgladiator.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="FS_BIDDER_REQ")
public class BidderRequest {

	  @Id
	  @GeneratedValue
	  @Column(name="b_id")
	  private int bid;
	@Column(name="b_amount")
	private long amount;
	@Column(name="b_date")
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="req_id")
	private SetBid bidd ;
	
	@ManyToOne
	@JoinColumn(name="bi_id")
	private BidderInfo info;
	

	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}

	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public SetBid getBidd() {
		return bidd;
	}
	public void setBidd(SetBid bidd) {
		this.bidd = bidd;
	}
	public BidderInfo getInfo() {
		return info;
	}
	public void setInfo(BidderInfo info) {
		this.info = info;
	}
	
}
