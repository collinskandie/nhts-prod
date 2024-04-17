package com.sourcetrace.eses.entity;
// Generated 23 Jun, 2020 5:09:17 PM by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ClientType generated by hbm2java
 */
@Entity
@Table(name = "client_type")
public class ClientType implements java.io.Serializable {

	private long id;
	private String code;
	private String name;

	public ClientType() {
	}

	public ClientType(long id) {
		this.id = id;
	}

	public ClientType(long id, String code, String name) {
		this.id = id;
		this.code = code;
		this.name = name;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "CODE", length = 45)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "NAME", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
