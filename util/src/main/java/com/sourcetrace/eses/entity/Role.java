package com.sourcetrace.eses.entity;
// Generated 23 Jun, 2020 5:09:17 PM by Hibernate Tools 5.0.6.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.Filters;
import org.hibernate.annotations.ParamDef;
import org.hibernate.envers.*;

/**
 * EseRole generated by hbm2java
 */
@Entity
 @FilterDef(name = "branchFilter", parameters = @ParamDef(name = "branchIdParam", type = "string"))@Filters(@org.hibernate.annotations.Filter(name="branchFilter", condition="branch_id in ( :branchIdParam )"))
@Table(name = "ese_role")
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
public class Role implements java.io.Serializable {
	public static enum Type {
		ADMIN,EXPORTER_USER,EXPORTER_ADMIN,DEALER,SEED_MERCHANT,AGRO_CHEMICAL_INSPECTOR,SEED_MERCHANT_INSPECTOR,FARMER,PHYTOSANITORY_INSPECTOR,PHYTO_INSPECTOR
		
	}
	
	private Long id;
	private String name;
	private String des;
	private String branchId;
	private boolean dataFiltered;
	private String isAdminUser;
	private Set<User> eseUsers = new HashSet<User>(0);

    private Set<Entitlement> entitlements = new HashSet<Entitlement>(0);
	private Set<Menu> menus = new HashSet<Menu>(0);
	private Integer type;
	/**
	 * Transient variable
	 */
	private List<String> branchesList;
	private String parentBranchId;

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

	@Column(name = "DES", length = 45)
	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	@Column(name = "BRANCH_ID")
	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	

	@OneToMany( mappedBy = "role")
	public Set<User> getEseUsers() {
		return this.eseUsers;
	}

	public void setEseUsers(Set<User> eseUsers) {
		this.eseUsers = eseUsers;
	}

	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "ese_role_ent", joinColumns = {
			@JoinColumn(name = "ROLE_ID",  updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "ENT_ID",  updatable = false) })
	public Set<Entitlement> getEntitlements() {
		return this.entitlements;
	}

	public void setEntitlements(Set<Entitlement> eseRoleEnts) {
		this.entitlements = eseRoleEnts;
	}

	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "ese_role_menu", joinColumns = {
			@JoinColumn(name = "ROLE_ID",  updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "MENU_ID",  updatable = false) })
     public Set<Menu> getMenus() {
		return this.menus;
	}

	public void setMenus(Set<Menu> eseRoleMenus) {
		this.menus = eseRoleMenus;
	}
	@Transient
	public boolean isDataFiltered() {
		return dataFiltered;
	}

	public void setDataFiltered(boolean dataFiltered) {
		this.dataFiltered = dataFiltered;
	}
	@Column(name = "IS_ADMIN", length = 10)
	public String getIsAdminUser() {
		return isAdminUser;
	}

	public void setIsAdminUser(String isAdminUser) {
		this.isAdminUser = isAdminUser;
	}

	@Transient
	public List<String> getBranchesList() {
		return branchesList;
	}

	public void setBranchesList(List<String> branchesList) {
		this.branchesList = branchesList;
	}

	
	@Transient
	public String getParentBranchId() {
		return parentBranchId;
	}

	public void setParentBranchId(String parentBranchId) {
		this.parentBranchId = parentBranchId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}



}
