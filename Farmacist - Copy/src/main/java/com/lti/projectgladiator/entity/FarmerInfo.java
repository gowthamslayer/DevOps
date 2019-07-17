package com.lti.projectgladiator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FS_FARMER_REG")
public class FarmerInfo {
	
	@Id
	@GeneratedValue
	@Column(name="F_ID")//
	private int id;
	@Column(name="F_EMAIL")//
	private String email;
	@Column(name="F_NAME")//
	private String fname;
	@Column(name="F_CONTACT")//
	private String fcontact;
	@Column(name="F_CITY")//
	private String city;
	@Column(name="F_PIN")
	private int pincode;
	@Column(name="F_PAN")//
	private String pan;
	@Column(name="F_ACCOUNT_NO")//
	private long accountno;
	@Column(name="F_IFSC")//
	private String ifsc;
	@Column(name="F_CERTIFICATE")//
	private String certificate;
	@Column(name="F_AADHAR")//
	private String aadhar;
	@Column(name="F_ADDRESS")//
	private String address;
	@Column(name="F_STATE")//
	private String state;
	@Column(name="F_AREA")//
	private String area;
	@Column(name="F_AREA_ADDRESS")//
	private String areaAddress;
	@Column(name="F_AREA_PINCODE")//
	private int areaPincode;
	@Column(name="F_PASSWORD")//
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFcontact() {
		return fcontact;
	}
	public void setFcontact(String fcontact) {
		this.fcontact = fcontact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getAreaAddress() {
		return areaAddress;
	}
	public void setAreaAddress(String areaAddress) {
		this.areaAddress = areaAddress;
	}
	public int getAreaPincode() {
		return areaPincode;
	}
	public void setAreaPincode(int areaPincode) {
		this.areaPincode = areaPincode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
