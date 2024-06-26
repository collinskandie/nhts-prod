package com.sourcetrace.eses.entity;
// Generated 23 Jun, 2020 5:09:17 PM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import java.util.List;
import java.util.SortedSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Where;

import com.sourcetrace.eses.util.ObjectUtil;
import org.hibernate.envers.*;

/**
 * AgentProf generated by hbm2java
 */
@Entity
// @org.hibernate.annotations.Filter(name = "branchFilter", condition =
// "branch_id in ( :branchIdParam )")
@Table(name = "agent_prof")
@PrimaryKeyJoinColumn(name = "PROF_ID")
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
public class Agent extends Profile implements java.io.Serializable {

	private Long version;
	private String password;
	private Date passwordUpt;
    @NotAudited
    private AgentType agentType;
	private int mode;
	private int bodStatus;
	private String farmerCurrentIdSeq;
	private String farmerAllotedIdSeq;
	private String farmerAllotedResIdSeq;
	private String shopDealerCurrentIdSeq;
	private String shopDealerAllotedIdSeq;
	private String shopDealerAllotedResIdSeq;
	private String farmerCardIdSeq;
	private String farmerAccountNoSeq;
	private String shopDealerCardIdSeq;
	private String internalIdSeq;
	private String receiptNumber;
	private String orderNoSeq;
	private String deliveryNoSeq;
	private Integer isTrainingAvailable;
	private String language;
	
	

	private Role role;

	private Long isActive;

	private Packhouse packhouse;

	@Column(name = "IS_ACTIVE")
	public Long getIsActive() {
		return isActive;
	}

	public void setIsActive(Long isActive) {
		this.isActive = isActive;
	}

	// Transient variable
	private List<String> branchesList;
	private String accountRupee;
	private String accountPaise;
	private double accountBalance;
	private String internalIdSequence;
	private String confirmPassword;
	private ExporterRegistration exporter;

	@Column(name = "VERSION")
	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Column(name = "PASSWORD", length = 90)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PASSWORD_UPT", length = 19)
	public Date getPasswordUpt() {
		return this.passwordUpt;
	}

	public void setPasswordUpt(Date passwordUpt) {
		this.passwordUpt = passwordUpt;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "AGENT_TYPE_ID", referencedColumnName = "id")
	public AgentType getAgentType() {
		return this.agentType;
	}

	public void setAgentType(AgentType agentTypeId) {
		this.agentType = agentTypeId;
	}

	@Column(name = "MODE")
	public int getMode() {
		return this.mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	@Column(name = "BOD_STATUS")
	public int getBodStatus() {
		return this.bodStatus;
	}

	public void setBodStatus(int bodStatus) {
		this.bodStatus = bodStatus;
	}

	@Column(name = "FARMER_CURRENT_ID_SEQ", length = 15)
	public String getFarmerCurrentIdSeq() {
		return this.farmerCurrentIdSeq;
	}

	public void setFarmerCurrentIdSeq(String farmerCurrentIdSeq) {
		this.farmerCurrentIdSeq = farmerCurrentIdSeq;
	}

	@Column(name = "FARMER_ALLOTED_ID_SEQ", length = 15)
	public String getFarmerAllotedIdSeq() {
		return this.farmerAllotedIdSeq;
	}

	public void setFarmerAllotedIdSeq(String farmerAllotedIdSeq) {
		this.farmerAllotedIdSeq = farmerAllotedIdSeq;
	}

	@Column(name = "FARMER_ALLOTED_RES_ID_SEQ", length = 15)
	public String getFarmerAllotedResIdSeq() {
		return this.farmerAllotedResIdSeq;
	}

	public void setFarmerAllotedResIdSeq(String farmerAllotedResIdSeq) {
		this.farmerAllotedResIdSeq = farmerAllotedResIdSeq;
	}

	@Column(name = "SHOP_DEALER_CURRENT_ID_SEQ", length = 15)
	public String getShopDealerCurrentIdSeq() {
		return this.shopDealerCurrentIdSeq;
	}

	public void setShopDealerCurrentIdSeq(String shopDealerCurrentIdSeq) {
		this.shopDealerCurrentIdSeq = shopDealerCurrentIdSeq;
	}

	@Column(name = "SHOP_DEALER_ALLOTED_ID_SEQ", length = 15)
	public String getShopDealerAllotedIdSeq() {
		return this.shopDealerAllotedIdSeq;
	}

	public void setShopDealerAllotedIdSeq(String shopDealerAllotedIdSeq) {
		this.shopDealerAllotedIdSeq = shopDealerAllotedIdSeq;
	}

	@Column(name = "SHOP_DEALER_ALLOTED_RES_ID_SEQ", length = 15)
	public String getShopDealerAllotedResIdSeq() {
		return this.shopDealerAllotedResIdSeq;
	}

	public void setShopDealerAllotedResIdSeq(String shopDealerAllotedResIdSeq) {
		this.shopDealerAllotedResIdSeq = shopDealerAllotedResIdSeq;
	}

	@Column(name = "FARMER_CARD_ID_SEQ", length = 45)
	public String getFarmerCardIdSeq() {
		return this.farmerCardIdSeq;
	}

	public void setFarmerCardIdSeq(String farmerCardIdSeq) {
		this.farmerCardIdSeq = farmerCardIdSeq;
	}

	@Column(name = "FARMER_ACCOUNT_NO_SEQ", length = 45)
	public String getFarmerAccountNoSeq() {
		return this.farmerAccountNoSeq;
	}

	public void setFarmerAccountNoSeq(String farmerAccountNoSeq) {
		this.farmerAccountNoSeq = farmerAccountNoSeq;
	}

	@Column(name = "SHOP_DEALER_CARD_ID_SEQ", length = 45)
	public String getShopDealerCardIdSeq() {
		return this.shopDealerCardIdSeq;
	}

	public void setShopDealerCardIdSeq(String shopDealerCardIdSeq) {
		this.shopDealerCardIdSeq = shopDealerCardIdSeq;
	}

	@Column(name = "INTERNAL_ID_SEQ", length = 45)
	public String getInternalIdSeq() {
		return this.internalIdSeq;
	}

	public void setInternalIdSeq(String internalIdSeq) {
		this.internalIdSeq = internalIdSeq;
	}

	@Column(name = "RECEIPT_NUMBER", length = 45)
	public String getReceiptNumber() {
		return this.receiptNumber;
	}

	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}

	@Column(name = "ORDER_NO_SEQ", length = 45)
	public String getOrderNoSeq() {
		return this.orderNoSeq;
	}

	public void setOrderNoSeq(String orderNoSeq) {
		this.orderNoSeq = orderNoSeq;
	}

	@Column(name = "DELIVERY_NO_SEQ", length = 45)
	public String getDeliveryNoSeq() {
		return this.deliveryNoSeq;
	}

	public void setDeliveryNoSeq(String deliveryNoSeq) {
		this.deliveryNoSeq = deliveryNoSeq;
	}

	@Column(name = "IS_TRAINING_AVAILABLE")
	public Integer getIsTrainingAvailable() {
		return this.isTrainingAvailable;
	}

	public void setIsTrainingAvailable(Integer isTrainingAvailable) {
		this.isTrainingAvailable = isTrainingAvailable;
	}

	@Column(name = "language", length = 5)
	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Transient
	public boolean isCoOperativeManager() {

		if (!ObjectUtil.isEmpty(agentType)) {
			if (AgentType.COOPERATIVE_MANAGER.equalsIgnoreCase(agentType.getCode())) {
				return true;
			}
		}
		return false;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ESE_ROLE_ID", columnDefinition = "BIGINT(45)")
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Transient
	public List<String> getBranchesList() {
		return branchesList;
	}

	public void setBranchesList(List<String> branchesList) {
		this.branchesList = branchesList;
	}

	@Transient
	public String getAccountRupee() {
		return accountRupee;
	}

	public void setAccountRupee(String accountRupee) {
		this.accountRupee = accountRupee;
	}

	@Transient
	public String getAccountPaise() {
		return accountPaise;
	}

	public void setAccountPaise(String accountPaise) {
		this.accountPaise = accountPaise;
	}

	@Transient
	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Transient
	public String getInternalIdSequence() {
		return internalIdSequence;
	}

	public void setInternalIdSequence(String internalIdSequence) {
		this.internalIdSequence = internalIdSequence;
	}

	@Transient
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "WAREHOUSE")
	public Packhouse getPackhouse() {
		return packhouse;
	}

	public void setPackhouse(Packhouse packhouse) {
		this.packhouse = packhouse;
	}

	private SortedSet<PasswordHistory> passwordHistory;

	@OneToMany(mappedBy = "referenceId", orphanRemoval = true)
	@OrderBy(value = "createdDate desc")
    @Where(clause = "type = 1")
    @NotAudited
	public SortedSet<PasswordHistory> getPasswordHistory() {
		return passwordHistory;
	}


    public void setPasswordHistory(SortedSet<PasswordHistory> passwordHistory) {
		this.passwordHistory = passwordHistory;
	}
	
	private boolean changePassword;
	@Transient
	public boolean isChangePassword() {
		return changePassword;
	}

	public void setChangePassword(boolean changePassword) {
		this.changePassword = changePassword;
	}

	@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name = "EXPORTER_ID")
	public ExporterRegistration getExporter() {
		return exporter;
	}

	public void setExporter(ExporterRegistration exporter) {
		this.exporter = exporter;
	}

}
