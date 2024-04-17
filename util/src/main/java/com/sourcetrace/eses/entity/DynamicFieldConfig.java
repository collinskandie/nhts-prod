package com.sourcetrace.eses.entity;
// Generated 23 Jun, 2020 5:09:17 PM by Hibernate Tools 5.0.6.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Where;

/**
 * DynamicFieldsConfig generated by hbm2java
 */
@Entity
@Table(name = "DYNAMIC_FIELDS_CONFIG")
public class DynamicFieldConfig implements java.io.Serializable {
	

	public static enum COMPONENT_TYPES {
		NA, TEXTBOX, RADIO, DATE_PICKER, DROP_DOWN, TEXT_AREA, CHECKBOX, LABEL, LIST, MULTIPLE_SELECT, BUTTON, AUDIO, PHOTO_CERTIFICATION,VIDEO, WEATHER_INFO,PLOTTING
		
	}
	
	public static enum LIST_METHOD {
		NA, getStatesDynamic, getDistrictsDynamic, getTaluksDynamic, getGpsDynamic, getVillagesDynamic, getGroupsDynamic, getFarmersDynamic, getFarmsDynamic, getCropsDynamic,getVarietyDynamic,getManufacturerDynamic,getFarmProductDynamic,getGradeDynamic
	}
	
	public static enum CONSTANTS {
		NA, noOfPalmTrees
	}
	
	public static enum IS_MOBILE_AVAILABLE {
		NA, WEB_AND_MOBILE,ONLY_RPEORT,ONLY_MOBILE,CUSTOMIZED_FORMULA
	}
	
	public static enum ACCESS_TYPE {
		NA, CATALOGUE_TYPE,CATALOGUE_NAMES,LIST_METHOD
	}
	public static enum followUp{
		NA, ACTION_PLAN,DEADLINE,ACTION_PLAN_PARENT,FOLLOW_UP_FIELDS
	}
	public static enum VALIDATION_TYPE {
		NA, STRING,NUMBER,EMAIL,DECIMAL,ALPHANUMERIC
	}
	  public static final String FORMULA_CONSTANT_VALUE = "##";
	  

	private Long id;
	private String code;
	private String componentType;
	private String componentName;
	//private String componentDataType;
	private String componentMaxLength;
	private String defaultValue;
	private String isRequired;
	private String dataFormat;
	private String validation;
	private String minLen;
	//private String listMethodName;
	private Date createdDate;
	private Date updatedDate;
	private DynamicSectionConfig dynamicSectionConfig;
	//private String beforeAdd;
	//private String afterAdd;
	private String catalogueType;
	private Integer accessType;
	private DynamicFieldConfig parentDepen;
	private String dependencyKey;
	private Long orderSet;
	private Long referenceId;
	private String isMobileAvail;
	private String isReportAvail;
	private String formula;
	private String catDependencyKey;
	private String parentDependencyKey;
	//private String MBeforeInsert;
	//private String MAfterInsert;
	private Long isOther;
	private String profileField;
	//private Long isUpdateProfile;
	private Long followUp;
	private String parentActField;
	private String parentActKey;
	private String grade;
	private Long valueDependency;
	private Long fOrder;
	private String isUpdateProfile;
	private Set<LanguagePreferences>languagePreferences=new HashSet<LanguagePreferences>();

	

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "COMPONENT_CODE", length = 45)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "COMPONENT_TYPE", length = 20)
	public String getComponentType() {
		return this.componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	@Column(name = "COMPONENT_NAME", length = 2000)
	public String getComponentName() {
		return this.componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	

	@Column(name = "COMPONENT_MAX_LENGTH")
	public String getComponentMaxLength() {
		return this.componentMaxLength;
	}

	public void setComponentMaxLength(String componentMaxLength) {
		this.componentMaxLength = componentMaxLength;
	}

	@Column(name = "DEFAULT_VALUE", length = 100)
	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	@Column(name = "IS_REQUIRED", length = 10)
	public String getIsRequired() {
		return this.isRequired;
	}

	public void setIsRequired(String isRequired) {
		this.isRequired = isRequired;
	}

	@Column(name = "DATA_FORMAT", length = 45)
	public String getDataFormat() {
		return this.dataFormat;
	}

	public void setDataFormat(String dataFormat) {
		this.dataFormat = dataFormat;
	}

	@Column(name = "VALIDATION", length = 45)
	public String getValidation() {
		return this.validation;
	}

	public void setValidation(String validation) {
		this.validation = validation;
	}

	@Column(name = "MIN_LENGTH", length = 45)
	public String getMinLen() {
		return this.minLen;
	}

	public void setMinLen(String minLen) {
		this.minLen= minLen;
	}

	

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE", length = 19)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE", length = 19)
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
    @ManyToOne
	@JoinColumn(name = "SECTION_ID",referencedColumnName="SECTION_CODE")
	public DynamicSectionConfig getDynamicSectionConfig() {
		return this.dynamicSectionConfig;
	}

	public void setDynamicSectionConfig(DynamicSectionConfig dynamicSectionConfig) {
		this.dynamicSectionConfig = dynamicSectionConfig;
	}

	
	@Column(name = "CATALOGUE_TYPE")
	public String getCatalogueType() {
		return this.catalogueType;
	}

	public void setCatalogueType(String catalogueType) {
		this.catalogueType = catalogueType;
	}

	@Column(name = "ACCESS_TYPE")
	public Integer getAccessType() {
		return this.accessType;
	}

	public void setAccessType(Integer accessType) {
		this.accessType = accessType;
	}

	@ManyToOne
	@JoinColumn(name = "PARENT_DEPENDANCY_ID")
	public DynamicFieldConfig getParentDepen() {
		return this.parentDepen;
	}

	public void setParentDepen(DynamicFieldConfig parentDepen) {
		this.parentDepen = parentDepen;
	}

	@Column(name = "DEPENDENCY_KEY", length = 45)
	public String getDependencyKey() {
		return this.dependencyKey;
	}

	public void setDependencyKey(String dependencyKey) {
		this.dependencyKey = dependencyKey;
	}

	@Column(name = "ORDER_SET")
	public Long getOrderSet() {
		return this.orderSet;
	}

	public void setOrderSet(Long orderSet) {
		this.orderSet = orderSet;
	}

	@Column(name = "REFERENCE_ID")
	public Long getReferenceId() {
		return this.referenceId;
	}

	public void setReferenceId(Long referenceId) {
		this.referenceId = referenceId;
	}

	@Column(name = "IS_MOBILE_AVAILABLE", length = 2)
	public String getIsMobileAvail() {
		return this.isMobileAvail;
	}

	public void setIsMobileAvail(String isMobileAvail) {
		this.isMobileAvail = isMobileAvail;
	}

	@Column(name = "IS_REPORT_AVAILABLE", length = 2)
	public String getIsReportAvail() {
		return this.isReportAvail;
	}

	public void setIsReportAvail(String isReportAvail) {
		this.isReportAvail = isReportAvail;
	}

	@Column(name = "FORMULA")
	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	@Column(name = "CATALOGUE_DEP_KEY", length = 45)
	public String getCatDependencyKey() {
		return this.catDependencyKey;
	}

	public void setCatDependencyKey(String catDependencyKey) {
		this.catDependencyKey = catDependencyKey;
	}

	@Column(name = "PARENT_DEP_KEY", length = 45)
	public String getParentDependencyKey() {
		return this.parentDependencyKey;
	}

	public void setParentDependencyKey(String parentDependencyKey) {
		this.parentDependencyKey = parentDependencyKey;
	}

	

	@Column(name = "IS_OTHER")
	public Long getIsOther() {
		return this.isOther;
	}

	public void setIsOther(Long isOther) {
		this.isOther = isOther;
	}

	@Column(name = "PROFILE_FIELD", length = 250)
	public String getProfileField() {
		return this.profileField;
	}

	public void setProfileField(String profileField) {
		this.profileField = profileField;
	}

	/*@Column(name = "IS_PROFILE_UPDATE")
	public Long getIsUpdateProfile() {
		return this.isUpdateProfile;
	}

	public void setIsUpdateProfile(Long isUpdateProfile) {
		this.isUpdateProfile = isUpdateProfile;
	}*/

	@Column(name = "FOLLOW_UP")
	public Long getFollowUp() {
		return this.followUp;
	}

	public String getIsUpdateProfile() {
		return isUpdateProfile;
	}

	public void setIsUpdateProfile(String isUpdateProfile) {
		this.isUpdateProfile = isUpdateProfile;
	}

	public void setFollowUp(Long followUp) {
		this.followUp = followUp;
	}

	@Column(name = "PARENT_ACTION_FIELD", length = 50)
	public String getParentActField() {
		return this.parentActField;
	}

	public void setParentActField(String parentActField) {
		this.parentActField = parentActField;
	}

	@Column(name = "PARENT_ACTION_KEY", length = 50)
	public String getParentActKey() {
		return this.parentActKey;
	}

	public void setParentActKey(String parentActKey) {
		this.parentActKey = parentActKey;
	}

	@Column(name = "GRADE", length = 10)
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Column(name = "VALUE_DEPENDENCY")
	public Long getValueDependency() {
		return this.valueDependency;
	}

	public void setValueDependency(Long valueDependency) {
		this.valueDependency = valueDependency;
	}

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="code",referencedColumnName="COMPONENT_CODE")
	@Where(clause = "LTYPE=1")
	public Set<LanguagePreferences> getLanguagePreferences() {
		return languagePreferences;
	}

	public void setLanguagePreferences(Set<LanguagePreferences> LanguagePreferences) {
		this.languagePreferences = LanguagePreferences;
	}

	public Long getfOrder() {
		return fOrder;
	}

	public void setfOrder(Long fOrder) {
		this.fOrder = fOrder;
	}
	
	

}