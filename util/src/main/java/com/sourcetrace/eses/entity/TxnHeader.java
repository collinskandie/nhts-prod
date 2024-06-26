package com.sourcetrace.eses.entity;
// Generated 24 Jun, 2020 6:21:14 PM by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TxnHeader generated by hbm2java
 */
@Entity
@Table(name = "txn_header")
public class TxnHeader implements java.io.Serializable {

	private Long id;
	private String serialNo;
	private String agentId;
	private String servicePointId;
	private String versionNo;

	public TxnHeader() {
	}

	public TxnHeader(String serialNo, String agentId, String servicePointId, String versionNo) {
		this.serialNo = serialNo;
		this.agentId = agentId;
		this.servicePointId = servicePointId;
		this.versionNo = versionNo;
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

	@Column(name = "SERIAL_NO", length = 45)
	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	@Column(name = "AGENT_ID", length = 45)
	public String getAgentId() {
		return this.agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	@Column(name = "SERVICE_POINT_ID", length = 45)
	public String getServicePointId() {
		return this.servicePointId;
	}

	public void setServicePointId(String servicePointId) {
		this.servicePointId = servicePointId;
	}

	@Column(name = "VERSION_NO", length = 50)
	public String getVersionNo() {
		return this.versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

}
