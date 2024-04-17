package com.sourcetrace.eses.entity;
// Generated 23 Jun, 2020 5:09:17 PM by Hibernate Tools 5.0.6.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ReportMailConfig generated by hbm2java
 */
@Entity
@Table(name = "report_mail_config")
public class ReportMailConfig implements java.io.Serializable {

	private Long id;
	private String name;
	private int status;
	private String mailId;
	private Set<String> dailyReport;
    private Set<String> consolidatedReport;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "NAME", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "STATUS")
	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Column(name = "MAIL_ID", length = 45)
	public String getMailId() {
		return this.mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	
	
	@ElementCollection
	  @CollectionTable(
	        name="daily_report_mail_config",
	        joinColumns=@JoinColumn(name="report_mail_config_id")
	  )
	  @Column(name="name")
		public Set<String> getDailyReport() {
		return dailyReport;
	}

	public void setDailyReport(Set<String> dailyReport) {
		this.dailyReport = dailyReport;
	}
	
	@ElementCollection
	  @CollectionTable(
	        name="consolidate_report_mail_config",
	        joinColumns=@JoinColumn(name="report_mail_config_id")
	  )
	  @Column(name="name")
	public Set<String> getConsolidatedReport() {
		return consolidatedReport;
	}

	public void setConsolidatedReport(Set<String> consolidatedReport) {
		this.consolidatedReport = consolidatedReport;
	}

}