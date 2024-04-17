package com.sourcetrace.eses.entity;
// Generated 23 Jun, 2020 5:09:17 PM by Hibernate Tools 5.0.6.Final

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * DistributionDetail generated by hbm2java
 */
@Entity

@Table(name = "DISTRIBUTION_DETAIL")
public class DistributionDetail implements java.io.Serializable {

	private Long id;
	private Distribution distribution;
	private Product product;
	private String sagiCode;
	private String batchNo;
	private Double quantity;
	private String unit;
	private Double pricePerUnit;
	private Double subTotal;
	private Double sellingPrice;
	private Double existingQuantity;
	private Double currentQuantity;
	private Double costPrice;
	private Double initFBalance;
	private Double initTBalance;
	private Double finalFarmerBalance;
	private String costPriceArray;
	
	//Transient
	private String seasonCode;

	public DistributionDetail() {
	}

	public DistributionDetail(Distribution distribution, Product product, String sagiCode, String batchNo,
			Double quantity, String unit, Double pricePerUnit, Double subTotal, Double sellingPrice,
			Double existingQuantity, Double currentQuantity, Double costPrice, Double initFBalance, Double initTBalance,
			Double finalFarmerBalance) {
		this.distribution = distribution;
		this.product = product;
		this.sagiCode = sagiCode;
		this.batchNo = batchNo;
		this.quantity = quantity;
		this.unit = unit;
		this.pricePerUnit = pricePerUnit;
		this.subTotal = subTotal;
		this.sellingPrice = sellingPrice;
		this.existingQuantity = existingQuantity;
		this.currentQuantity = currentQuantity;
		this.costPrice = costPrice;
		this.initFBalance = initFBalance;
		this.initTBalance = initTBalance;
		this.finalFarmerBalance = finalFarmerBalance;
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
	@JoinColumn(name = "DISTRIBUTION_ID")
	public Distribution getDistribution() {
		return this.distribution;
	}

	public void setDistribution(Distribution distribution) {
		this.distribution = distribution;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUCT_ID")
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Column(name = "SAGI_CODE", length = 45)
	public String getSagiCode() {
		return this.sagiCode;
	}

	public void setSagiCode(String sagiCode) {
		this.sagiCode = sagiCode;
	}

	@Column(name = "BATCH_NO", length = 20)
	public String getBatchNo() {
		return this.batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	@Column(name = "QUANTITY", precision = 20, scale = 3)
	public Double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	@Column(name = "UNIT", length = 15)
	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Column(name = "PRICE_PER_UNIT", precision = 20)
	public Double getPricePerUnit() {
		return this.pricePerUnit;
	}

	public void setPricePerUnit(Double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	@Column(name = "SUB_TOTAL", precision = 20)
	public Double getSubTotal() {
		return this.subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	@Column(name = "SELLING_PRICE", precision = 20)
	public Double getSellingPrice() {
		return this.sellingPrice;
	}

	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	@Column(name = "EXISTING_QUANTITY", precision = 20, scale = 3)
	public Double getExistingQuantity() {
		return this.existingQuantity;
	}

	public void setExistingQuantity(Double existingQuantity) {
		this.existingQuantity = existingQuantity;
	}

	@Column(name = "CURRENT_QUANTITY", precision = 20, scale = 3)
	public Double getCurrentQuantity() {
		return this.currentQuantity;
	}

	public void setCurrentQuantity(Double currentQuantity) {
		this.currentQuantity = currentQuantity;
	}

	@Column(name = "COST_PRICE", precision = 20, scale = 3)
	public Double getCostPrice() {
		return this.costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	@Column(name = "INIT_FBAL", precision = 5)
	public Double getInitFBalance() {
		return this.initFBalance;
	}

	public void setInitFBalance(Double initFBalance) {
		this.initFBalance = initFBalance;
	}

	@Column(name = "INIT_TBAL", precision = 5)
	public Double getInitTBalance() {
		return this.initTBalance;
	}

	public void setInitTBalance(Double initTBalance) {
		this.initTBalance = initTBalance;
	}

	@Column(name = "FINAL_FARMER_BALANCE", precision = 5)
	public Double getFinalFarmerBalance() {
		return this.finalFarmerBalance;
	}

	public void setFinalFarmerBalance(Double finalFarmerBalance) {
		this.finalFarmerBalance = finalFarmerBalance;
	}
	
	@Transient
	public String getSeasonCode() {
		return seasonCode;
	}

	public void setSeasonCode(String seasonCode) {
		this.seasonCode = seasonCode;
	}

	@Transient
	public String getCostPriceArray() {
		return costPriceArray;
	}

	public void setCostPriceArray(String costPriceArray) {
		this.costPriceArray = costPriceArray;
	}
	
}
