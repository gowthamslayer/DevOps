package com.lti.projectgladiator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="FS_FARMER_REQ")
public class SetBid {

	@Id
	@GeneratedValue
	@Column(name="REQ_ID")
	private int id;
	@Column(name="CROP_NAME")
	private String cropname;
	@Column(name="CROP_TYPE")
	private String croptype;
	@Column(name="CROP_VARIETY")
	private String cropvariety;
    @Column(name="CROP_QUANTITY")
	private int cropquantity;
	
	@ManyToOne
	@JoinColumn(name="f_id")
	private FarmerInfo farmer;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCropname() {
		return cropname;
	}

	public void setCropname(String cropname) {
		this.cropname = cropname;
	}

	public String getCropvariety() {
		return cropvariety;
	}

	public void setCropvariety(String cropvariety) {
		this.cropvariety = cropvariety;
	}

	public int getCropquantity() {
		return cropquantity;
	}

	public void setCropquantity(int cropquantity) {
		this.cropquantity = cropquantity;
	}

	public FarmerInfo getFarmer() {
		return farmer;
	}

	public void setFarmer(FarmerInfo farmer) {
		this.farmer = farmer;
	}
	
	 public String getCroptype() {
			return croptype;
		}

		public void setCroptype(String croptype) {
			this.croptype = croptype;
		}
	
}
