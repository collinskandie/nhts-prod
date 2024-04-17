package com.sourcetrace.eses.entity;
// Generated 23 Jun, 2020 5:09:17 PM by Hibernate Tools 5.0.6.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.Filters;
import org.hibernate.annotations.ParamDef;
import org.hibernate.annotations.Type;

/**
 * HarvestSeason generated by hbm2java
 */
@Entity
@Table(name = "HARVEST_SEASON")
@FilterDef(name = "branchFilter", parameters = @ParamDef(name = "branchIdParam", type = "string"))@Filters(@org.hibernate.annotations.Filter(name="branchFilter", condition="branch_id in ( :branchIdParam )"))
public class HarvestSeason implements java.io.Serializable {

	private Long id;
	private String name;
	private String code;
	private Date fromPeriod;
	private Date toPeriod;
	private Boolean currentSeason;
	private Long revisionNo;
	private String branchId;

	public HarvestSeason() {
	}

	public HarvestSeason(String name, String code, Date fromPeriod, Date toPeriod) {
		this.name = name;
		this.code = code;
		this.fromPeriod = fromPeriod;
		this.toPeriod = toPeriod;
	}

	public HarvestSeason(String name, String code, Date fromPeriod, Date toPeriod, Boolean currentSeason,
			Long revisionNo, String branchId) {
		this.name = name;
		this.code = code;
		this.fromPeriod = fromPeriod;
		this.toPeriod = toPeriod;
		this.currentSeason = currentSeason;
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

	@Column(name = "NAME",  length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "CODE",  length = 20)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
	@Temporal(TemporalType.DATE)
	@Column(name = "FROM_PERIOD",  length = 10)
	public Date getFromPeriod() {
		return this.fromPeriod;
	}

	public void setFromPeriod(Date fromPeriod) {
		this.fromPeriod = fromPeriod;
	}

	
	@Temporal(TemporalType.DATE)
	@Column(name = "TO_PERIOD",  length = 10)
	public Date getToPeriod() {
		return this.toPeriod;
	}

	public void setToPeriod(Date toPeriod) {
		this.toPeriod = toPeriod;
	}

	@Column(name = "IS_CURRENT_SEASON",columnDefinition= "TINYINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	public Boolean getCurrentSeason() {
		return this.currentSeason;
	}

	public void setCurrentSeason(Boolean currentSeason) {
		this.currentSeason = currentSeason;
	}

	@Column(name = "REVISION_NO")
	public Long getRevisionNo() {
		return this.revisionNo;
	}

	public void setRevisionNo(Long revisionNo) {
		this.revisionNo = revisionNo;
	}

	
	@Column(name = "BRANCH_ID" )
	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

}
