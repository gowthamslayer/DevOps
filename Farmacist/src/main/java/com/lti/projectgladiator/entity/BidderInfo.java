package com.lti.projectgladiator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="FS_BIDDER_REG")
public class BidderInfo {

	//Personal Details
	@Id
	@GeneratedValue
	@Column(name="bi_id")
	private int bid;
	@Column(name="bi_name")
	private String bname;
	@Column(name="bi_contactno")
	private String bcontactno;
	@Column(name="bi_email",unique=true)
	private String bemail;
	@Column(name="bi_address")
	private String baddress;
	@Column(name="bi_city")
	private String bcity;
	@Column(name="bi_state")
	private String bstate;
	@Column(name="bi_pincode")
	private int bpincode;
	
	//Account Details
	@Column(name="bi_accno")
	private long baccno;
	@Column(name="bi_ifsc")
	private String bifsc;
	
	//Verification Details
	@Column(name="bi_aadhaar")
	private String baadhaar;
	@Column(name="bi_pan")
	private String bpan;
	@Column(name="bi_traderlicense")
	private String btraderlicense;
	
	//Create Login
	@Column(name="bi_password")
	private String bpassword;
	
	
	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public String getBcontactno() {
		return bcontactno;
	}


	public void setBcontactno(String bcontactno) {
		this.bcontactno = bcontactno;
	}


	public String getBemail() {
		return bemail;
	}


	public void setBemail(String bemail) {
		this.bemail = bemail;
	}


	public String getBaddress() {
		return baddress;
	}


	public void setBaddress(String baddress) {
		this.baddress = baddress;
	}


	public String getBcity() {
		return bcity;
	}


	public void setBcity(String bcity) {
		this.bcity = bcity;
	}


	public String getBstate() {
		return bstate;
	}


	public void setBstate(String bstate) {
		this.bstate = bstate;
	}


	public int getBpincode() {
		return bpincode;
	}


	public void setBpincode(int bpincode) {
		this.bpincode = bpincode;
	}


	public long getBaccno() {
		return baccno;
	}


	public void setBaccno(long baccno) {
		this.baccno = baccno;
	}


	public String getBifsc() {
		return bifsc;
	}


	public void setBifsc(String bifsc) {
		this.bifsc = bifsc;
	}


	public String getBaadhaar() {
		return baadhaar;
	}


	public void setBaadhaar(String baadhaar) {
		this.baadhaar = baadhaar;
	}


	public String getBpan() {
		return bpan;
	}


	public void setBpan(String bpan) {
		this.bpan = bpan;
	}


	public String getBtraderlicense() {
		return btraderlicense;
	}


	public void setBtraderlicense(String btraderlicense) {
		this.btraderlicense = btraderlicense;
	}


	public String getBpassword() {
		return bpassword;
	}


	public void setBpassword(String bpassword) {
		this.bpassword = bpassword;
	}


	@Override
	public String toString() {
		return "BidderInfo [bname=" + bname + ", bcontactno=" + bcontactno + ", bemail=" + bemail + ", baddress="
				+ baddress + ", bcity=" + bcity + ", bstate=" + bstate + ", bpincode=" + bpincode + ", baccno=" + baccno
				+ ", bifsc=" + bifsc + ", baadhaar=" + baadhaar + ", bpan=" + bpan + ", btraderlicense="
				+ btraderlicense + ", bpassword=" + bpassword + "]";
	}
	
	
	
	
	
	
}
