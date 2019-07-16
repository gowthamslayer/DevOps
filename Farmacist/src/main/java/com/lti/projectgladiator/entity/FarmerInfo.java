package com.lti.projectgladiator.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
@Table(name="FS_FARMERINFO")
public class FarmerInfo {
	
	@Id
	private String email;
	private String fname;
	private String fcontact;
	private String faddress;
	
	

}
