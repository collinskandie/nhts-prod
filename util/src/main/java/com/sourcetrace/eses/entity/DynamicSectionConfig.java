package com.sourcetrace.eses.entity;
// Generated 23 Jun, 2020 5:09:17 PM by Hibernate Tools 5.0.6.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Where;

/**
 * DynamicSectionConfig generated by hbm2java
 */
@Entity
@org.hibernate.annotations.Filter(name = "branchFilter", condition = "branch_id in ( :branchIdParam )")
@Table(name = "dynamic_section_config")
public class DynamicSectionConfig implements java.io.Serializable {

	private Long id;
	private String sectionName;
	private String tableId;
	private String branchId;
	private String sectionCode;
	private String typez;
	private String MTxnTypez;
	private String sectionOrder;
	private String afterInsert;
	private String MBeforeInsert;
	private String MAfterInsert;
	private String beforeInsert;
	private String secorder;
	private Set<DynamicMenuSectionMap> dynamicMenuSectionMaps = new HashSet<DynamicMenuSectionMap>(0);
	private Set<LanguagePreferences> languagePreferences;
	private Set<DynamicFieldConfig> dynamicFieldConfigs;

	public DynamicSectionConfig() {
	}

	public DynamicSectionConfig(String sectionName, String tableId, String branchId, String sectionCode, String typez,
			String MTxnTypez, String sectionOrder, String afterInsert, String MBeforeInsert, String MAfterInsert,
			String beforeInsert, Set<DynamicMenuSectionMap> dynamicMenuSectionMaps) {
		this.sectionName = sectionName;
		this.tableId = tableId;
		this.branchId = branchId;
		this.sectionCode = sectionCode;
		this.typez = typez;
		this.MTxnTypez = MTxnTypez;
		this.sectionOrder = sectionOrder;
		this.afterInsert = afterInsert;
		this.MBeforeInsert = MBeforeInsert;
		this.MAfterInsert = MAfterInsert;
		this.beforeInsert = beforeInsert;
		this.dynamicMenuSectionMaps = dynamicMenuSectionMaps;
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

	@Column(name = "SECTION_NAME")
	public String getSectionName() {
		return this.sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	@Column(name = "TABLE_ID", length = 20)
	public String getTableId() {
		return this.tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	@Column(name = "BRANCH_ID", length = 20)
	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	@Column(name = "SECTION_CODE", length = 25)
	public String getSectionCode() {
		return this.sectionCode;
	}

	public void setSectionCode(String sectionCode) {
		this.sectionCode = sectionCode;
	}

	@Column(name = "TYPEZ", length = 25)
	public String getTypez() {
		return this.typez;
	}

	public void setTypez(String typez) {
		this.typez = typez;
	}

	@Column(name = "M_TXN_TYPEZ", length = 50)
	public String getMTxnTypez() {
		return this.MTxnTypez;
	}

	public void setMTxnTypez(String MTxnTypez) {
		this.MTxnTypez = MTxnTypez;
	}

	@Column(name = "SECTION_ORDER", length = 45)
	public String getSectionOrder() {
		return this.sectionOrder;
	}

	public void setSectionOrder(String sectionOrder) {
		this.sectionOrder = sectionOrder;
	}

	@Column(name = "AFTER_INSERT", length = 20)
	public String getAfterInsert() {
		return this.afterInsert;
	}

	public void setAfterInsert(String afterInsert) {
		this.afterInsert = afterInsert;
	}

	@Column(name = "M_BEFORE_INSERT", length = 20)
	public String getMBeforeInsert() {
		return this.MBeforeInsert;
	}

	public void setMBeforeInsert(String MBeforeInsert) {
		this.MBeforeInsert = MBeforeInsert;
	}

	@Column(name = "M_AFTER_INSERT", length = 20)
	public String getMAfterInsert() {
		return this.MAfterInsert;
	}

	public void setMAfterInsert(String MAfterInsert) {
		this.MAfterInsert = MAfterInsert;
	}

	@Column(name = "BEFORE_INSERT", length = 20)
	public String getBeforeInsert() {
		return this.beforeInsert;
	}

	public void setBeforeInsert(String beforeInsert) {
		this.beforeInsert = beforeInsert;
	}

	@OneToMany(mappedBy = "section")
	public Set<DynamicMenuSectionMap> getDynamicMenuSectionMaps() {
		return this.dynamicMenuSectionMaps;
	}

	public void setDynamicMenuSectionMaps(Set<DynamicMenuSectionMap> dynamicMenuSectionMaps) {
		this.dynamicMenuSectionMaps = dynamicMenuSectionMaps;
	}

	@Transient
	public Integer getMobileFieldsSize() {

		return this.getDynamicFieldConfigs() != null && this.getDynamicFieldConfigs().size() > 0
				? this.getDynamicFieldConfigs().stream()
						.filter(u -> (u.getIsMobileAvail() != null && u.getIsMobileAvail().equals("1")))
						.collect(Collectors.toList()).size()
				: 0;
	}

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="code",referencedColumnName="SECTION_CODE")
	@Where(clause = "LTYPE=2")
	public Set<LanguagePreferences> getLanguagePreferences() {
		return languagePreferences;
	}

	public void setLanguagePreferences(Set<LanguagePreferences> languagePreferences) {
		this.languagePreferences = languagePreferences;
	}
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="SECTION_ID",referencedColumnName="SECTION_CODE")
	public Set<DynamicFieldConfig> getDynamicFieldConfigs() {
		return dynamicFieldConfigs;
	}

	public void setDynamicFieldConfigs(Set<DynamicFieldConfig> dynamicFieldConfigs) {
		this.dynamicFieldConfigs = dynamicFieldConfigs;
	}
	
	public String getSecorder() {
		return secorder;
	}

	public void setSecorder(String secorder) {
		this.secorder = secorder;
	}



	
}