package com.sourcetrace.eses.entity;
// Generated 23 Jun, 2020 5:09:17 PM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PmtImageDetails generated by hbm2java
 */
@Entity
 @Table(name = "pmt_image_details")
public class PmtImageDetails implements java.io.Serializable {

	public static enum Type {
		NA, PMT, SPINNING,GMO,PRODUCT_RETURN
	}
	private Long id;
	private Long offlinePmt;
	private Long pmtId;
	private byte[] photo;
	private Date photoCaptureTime;
	private String latitude;
	private String longitude;
	private Integer type;
	private String fileName;
	private String fileType;

	

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "OFFLINE_PMT_ID")
	public Long getOfflinePmt() {
		return this.offlinePmt;
	}

	public void setOfflinePmt(Long offlinePmtI) {
		this.offlinePmt = offlinePmtI;
	}

	@Column(name = "PMT_ID")
	public Long getPmtId() {
		return this.pmtId;
	}

	public void setPmtId(Long pmtId) {
		this.pmtId = pmtId;
	}

	@Column(name = "PHOTO")
	public byte[] getPhoto() {
		return this.photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PHOTO_CAPTURE_TIME", length = 19)
	public Date getPhotoCaptureTime() {
		return this.photoCaptureTime;
	}

	public void setPhotoCaptureTime(Date photoCaptureTime) {
		this.photoCaptureTime = photoCaptureTime;
	}

	@Column(name = "LATITUDE", length = 20)
	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Column(name = "LONGITUDE", length = 20)
	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Column(name = "TYPE")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name = "FILE_NAME", columnDefinition="LONGTEXT")
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Column(name = "FILE_TYPE", length = 20)
	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

}
