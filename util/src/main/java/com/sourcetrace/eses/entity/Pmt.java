package com.sourcetrace.eses.entity;
// Generated 23 Jun, 2020 5:09:17 PM by Hibernate Tools 5.0.6.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import javax.persistence.Transient;

import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.Filters;
import org.hibernate.annotations.ParamDef;

/**
 * Pmt generated by hbm2java
 */
@Entity
 @FilterDef(name = "branchFilter", parameters = @ParamDef(name = "branchIdParam", type = "string"))@Filters(@org.hibernate.annotations.Filter(name="branchFilter", condition="branch_id in ( :branchIdParam )"))
@Table(name = "pmt")
public class Pmt implements java.io.Serializable {

	public static enum Status {
		NONE, MTNT, MTNR, COMPLETE
	}

	public static final String TRN_TYPE_STOCK_TRNASFER = "STOCK_TRANSFER";
	public static final String TRN_TYPE_OTEHR = "OTHER";
	public static final String TRN_TYPE_PRODUCT_RECEPTION = "PRODUCT RECEPTION";
	private Long id;
	private Packhouse coOperative;
	private Long mtntTransferInfoId;
	private Long mtnrTransferInfoId;
	private Date mtntDate;
	private Date mtnrDate;
	private String invoiceNo;
	private String mtntReceiptNumber;
	private String mtnrReceiptNumber;
	private String truckId;
	private String driverName;
	private Integer statusCode;
	private String statusMsg;
	private String trnType;
	private String seasonCode;
	private Double totalLabourCost;
	private Double transportCost;
	private String client;
	private Double totalAmount;
	private String branchId;
	private Long transferInfo;
	private String transporter;
	private String latitude;
	private String longitude;
	private Set<PmtFarmerDetail> pmtFarmerDetails = new HashSet<PmtFarmerDetail>(0);
	private Set<PmtDetail> pmtDetails = new HashSet<PmtDetail>(0);
	private Agent agentRef;
	
	private Long senderWarehouse;
	private Long receiverWarehouse;
	private Long productId;
	
	 
	
	private List<CityWarehouse> stockDetails = new ArrayList<CityWarehouse>();

	public Pmt() {
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
@ManyToOne
	@JoinColumn(name = "CO_OPERATIVE_ID")
	public Packhouse getCoOperative() {
		return this.coOperative;
	}

	public void setCoOperative(Packhouse coOperativeId) {
		this.coOperative = coOperativeId;
	}

	@Column(name = "MTNT_TRANSFER_INFO_ID")
	public Long getMtntTransferInfoId() {
		return this.mtntTransferInfoId;
	}

	public void setMtntTransferInfoId(Long mtntTransferInfoId) {
		this.mtntTransferInfoId = mtntTransferInfoId;
	}

	@Column(name = "MTNR_TRANSFER_INFO_ID")
	public Long getMtnrTransferInfoId() {
		return this.mtnrTransferInfoId;
	}

	public void setMtnrTransferInfoId(Long mtnrTransferInfoId) {
		this.mtnrTransferInfoId = mtnrTransferInfoId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MTNT_DATE", length = 19)
	public Date getMtntDate() {
		return this.mtntDate;
	}

	public void setMtntDate(Date mtntDate) {
		this.mtntDate = mtntDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MTNR_DATE", length = 19)
	public Date getMtnrDate() {
		return this.mtnrDate;
	}

	public void setMtnrDate(Date mtnrDate) {
		this.mtnrDate = mtnrDate;
	}

	@Column(name = "INVOICE_NO", length = 45)
	public String getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	@Column(name = "MTNT_RECEIPT_NUMBER", length = 45)
	public String getMtntReceiptNumber() {
		return this.mtntReceiptNumber;
	}

	public void setMtntReceiptNumber(String mtntReceiptNumber) {
		this.mtntReceiptNumber = mtntReceiptNumber;
	}

	@Column(name = "MTNR_RECEIPT_NUMBER", length = 45)
	public String getMtnrReceiptNumber() {
		return this.mtnrReceiptNumber;
	}

	public void setMtnrReceiptNumber(String mtnrReceiptNumber) {
		this.mtnrReceiptNumber = mtnrReceiptNumber;
	}

	@Column(name = "TRUCK_ID", length = 35)
	public String getTruckId() {
		return this.truckId;
	}

	public void setTruckId(String truckId) {
		this.truckId = truckId;
	}

	@Column(name = "DRIVER_NAME", length = 35)
	public String getDriverName() {
		return this.driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	@Column(name = "STATUS_CODE")
	public Integer getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	@Column(name = "STATUS_MSG")
	public String getStatusMsg() {
		return this.statusMsg;
	}

	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}

	@Column(name = "TRN_TYPE", length = 35)
	public String getTrnType() {
		return this.trnType;
	}

	public void setTrnType(String trnType) {
		this.trnType = trnType;
	}

	@Column(name = "SEASON_CODE", length = 25)
	public String getSeasonCode() {
		return this.seasonCode;
	}

	public void setSeasonCode(String seasonCode) {
		this.seasonCode = seasonCode;
	}

	@Column(name = "TOTAL_LABOUR_COST", precision = 25)
	public Double getTotalLabourCost() {
		return this.totalLabourCost;
	}

	public void setTotalLabourCost(Double totalLabourCost) {
		this.totalLabourCost = totalLabourCost;
	}

	@Column(name = "TRANSPORT_COST", precision = 25)
	public Double getTransportCost() {
		return this.transportCost;
	}

	public void setTransportCost(Double transportCost) {
		this.transportCost = transportCost;
	}

	@Column(name = "CLIENT", length = 25)
	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	@Column(name = "TOTAL_AMOUNT", precision = 20)
	public Double getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Column(name = "BRANCH_ID", length = 50)
	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	@Column(name = "TRANSFER_INFO")
	public Long getTransferInfo() {
		return this.transferInfo;
	}

	public void setTransferInfo(Long transferInfo) {
		this.transferInfo = transferInfo;
	}

	@Column(name = "TRANSPORTER", length = 50)
	public String getTransporter() {
		return this.transporter;
	}

	public void setTransporter(String transporter) {
		this.transporter = transporter;
	}

	@Column(name = "LATITUDE", length = 50)
	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Column(name = "LONGITUDE", length = 50)
	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	

	@OneToMany( mappedBy = "pmt")
	public Set<PmtFarmerDetail> getPmtFarmerDetails() {
		return this.pmtFarmerDetails;
	}

	public void setPmtFarmerDetails(Set<PmtFarmerDetail> pmtFarmerDetails) {
		this.pmtFarmerDetails = pmtFarmerDetails;
	}


	@OneToMany( mappedBy = "pmt")
	public Set<PmtDetail> getPmtDetails() {
		return this.pmtDetails;
	}

	public void setPmtDetails(Set<PmtDetail> pmtDetails) {
		this.pmtDetails = pmtDetails;
	}
	
	@Transient
	public Agent getAgentRef() {
		return agentRef;
	}
	public void setAgentRef(Agent agentRef) {
		this.agentRef = agentRef;
	}
	@Transient
	public Long getSenderWarehouse() {
		return senderWarehouse;
	}
	public void setSenderWarehouse(Long senderWarehouse) {
		this.senderWarehouse = senderWarehouse;
	}
	@Transient
	public Long getReceiverWarehouse() {
		return receiverWarehouse;
	}
	public void setReceiverWarehouse(Long receiverWarehouse) {
		this.receiverWarehouse = receiverWarehouse;
	}
	
	@Transient
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	
	@Transient
	public List<CityWarehouse> getStockDetails() {
		return stockDetails;
	}
	public void setStockDetails(List<CityWarehouse> stockDetails) {
		this.stockDetails = stockDetails;
	}
	
	

}
