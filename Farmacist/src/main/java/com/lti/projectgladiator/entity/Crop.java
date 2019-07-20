package com.lti.projectgladiator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="FS_SET_BID")
public class Crop {

	@Id
	@GeneratedValue
	@Column(name="SET_BID_ID")
	private int cropId;
	@Column(name="BASE_PRICE")
	private double baseprice;
	@Column(name="BID_STATUS")
	private int cropStatus;
	@Column(name="CROP_NAME")
	private String cropName;
	@Column(name="CROP_TYPE")
	private String cropType;
	@Column(name="FERTILIZER_TYPE")
	private String cropFertilizer;
    @Column(name="QUANTITY")
	private int cropQuantity;
	
	@ManyToOne
	@JoinColumn(name="f_id")
	private FarmerInfo farmer;

	public int getCropId() {
		return cropId;
	}

	public void setCropId(int cropId) {
		this.cropId = cropId;
	}

	public double getBaseprice() {
		return baseprice;
	}

	public void setBaseprice(double baseprice) {
		this.baseprice = baseprice;
	}

	public int getCropStatus() {
		return cropStatus;
	}

	public void setCropStatus(int cropStatus) {
		this.cropStatus = cropStatus;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public String getCropFertilizer() {
		return cropFertilizer;
	}

	public void setCropFertilizer(String cropFertilizer) {
		this.cropFertilizer = cropFertilizer;
	}

	public int getCropQuantity() {
		return cropQuantity;
	}

	public void setCropQuantity(int cropQuantity) {
		this.cropQuantity = cropQuantity;
	}

	public FarmerInfo getFarmer() {
		return farmer;
	}

	public void setFarmer(FarmerInfo farmer) {
		this.farmer = farmer;
	}
}