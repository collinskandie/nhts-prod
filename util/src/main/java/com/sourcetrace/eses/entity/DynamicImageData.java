package com.sourcetrace.eses.entity;
// Generated 23 Jun, 2020 5:09:17 PM by Hibernate Tools 5.0.6.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DynamicImageData generated by hbm2java
 */
@Entity
 @Table(name = "dynamic_image_data")
public class DynamicImageData implements java.io.Serializable {
	
	public static enum TYPES {
		digitalSignature,agentSignature
	}

	private Long id;
	private FarmerDynamicFieldsValue farmerDynamicFieldValue;
	private byte[] image;
	private Date photoCaptureTime;
	private String latitude;
	private String longitude;

	private String fileExt;
	private FarmerDynamicData farmerDynamicData;
	private int typez;
	private String order;

	
	public DynamicImageData() {
	}

	public DynamicImageData(int typez) {
		this.typez = typez;
	}

	

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FARMER_DYNMAIC_FIELD_ID")
	public FarmerDynamicFieldsValue getFarmerDynamicFieldValue() {
		return this.farmerDynamicFieldValue;
	}

	public void setFarmerDynamicFieldValue(FarmerDynamicFieldsValue farmerDynamicFieldValue) {
		this.farmerDynamicFieldValue = farmerDynamicFieldValue;
	}

	@Column(name = "IMAGE")
	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PHOTO_CAPTURE_TIME", length = 19)
	public Date getPhotoCaptureTime() {
		return this.photoCaptureTime;
	}

	public void setPhotoCaptureTime(Date photoCaptureTime) {
		this.photoCaptureTime = photoCaptureTime;
	}

	@Column(name = "LATITUDE", length = 45)
	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Column(name = "LONGITUDE", length = 45)
	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	@Column(name = "FILE_EXT", length = 500)
	public String getFileExt() {
		return this.fileExt;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}

	@ManyToOne()
	@JoinColumn(name = "FARMER_DYNMAIC_DATA_ID")
	public FarmerDynamicData getFarmerDynamicData() {
		return this.farmerDynamicData;
	}

	public void setFarmerDynamicData(FarmerDynamicData farmerDynmaicDataId) {
		this.farmerDynamicData = farmerDynmaicDataId;
	}

	@Column(name = "typez", nullable = false)
	public int getTypez() {
		return this.typez;
	}

	public void setTypez(int typez) {
		this.typez = typez;
	}
	@Column(name = "ORDERZ", length = 45)
	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}


}