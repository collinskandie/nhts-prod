package com.sourcetrace.eses.entity;
// Generated 24 Jun, 2020 6:21:14 PM by Hibernate Tools 5.0.6.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.Filters;
import org.hibernate.annotations.ParamDef;
import org.hibernate.envers.*;

/**
 * Vendor generated by hbm2java
 */
@Entity
 @FilterDef(name = "branchFilter", parameters = @ParamDef(name = "branchIdParam", type = "string"))@Filters(@org.hibernate.annotations.Filter(name="branchFilter", condition="branch_id in ( :branchIdParam )"))
@Table(name = "vendor")
@Audited
public class Vendor implements java.io.Serializable {

	private Long id;
	private String vendorId;
	private String vendorName;
	private String vendorAddress;
	private String landline;
	private String personName;
	private String mobileNo;
	private String emailId;
	private Long revisionNo;
	private String branchId;

    // transient variable
	 private List<String> branchesList;

	 public Vendor() {
	}

	public Vendor(String vendorId, String vendorName, String vendorAddress, String landline, String personName,
			String mobileNo, String emailId, Long revisionNo, String branchId,
			Set<WarehouseStockReturn> warehouseStockReturns) {
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.landline = landline;
		this.personName = personName;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.revisionNo = revisionNo;
		this.branchId = branchId;

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

	@Column(name = "VENDOR_ID", length = 20)
	public String getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	@Column(name = "VENDOR_NAME", length = 90)
	public String getVendorName() {
		return this.vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	@Column(name = "VENDOR_ADDRESS")
	public String getVendorAddress() {
		return this.vendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	@Column(name = "LANDLINE", length = 15)
	public String getLandline() {
		return this.landline;
	}

	public void setLandline(String landline) {
		this.landline = landline;
	}

	@Column(name = "PERSON_NAME", length = 90)
	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Column(name = "MOBILE_NO", length = 10)
	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Column(name = "EMAIL_ID", length = 90)
	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "REVISION_NO")
	public Long getRevisionNo() {
		return this.revisionNo;
	}

	public void setRevisionNo(Long revisionNo) {
		this.revisionNo = revisionNo;
	}

	@Column(name = "BRANCH_ID", length = 50)
	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	@Transient
	public List<String> getBranchesList() {
		return branchesList;
	}

	public void setBranchesList(List<String> branchesList) {
		this.branchesList = branchesList;
	}


}