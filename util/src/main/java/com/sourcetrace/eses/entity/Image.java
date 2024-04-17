package com.sourcetrace.eses.entity;
// Generated 23 Jun, 2020 5:09:17 PM by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Image generated by hbm2java
 */
@Entity

@Table(name = "image", uniqueConstraints = @UniqueConstraint(columnNames = "IMG_ID"))
public class Image implements java.io.Serializable {

	private Long id;

	private byte[] image;
	private String imageId;
	public Image() {
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

	

	@Column(name = "IMG", nullable = false)
	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	@Column(name = "IMG_ID", unique = true,  length = 45)
	public String getImageId() {
		return imageId;
	}
    public void setImageId(String imageId) {
		this.imageId = imageId;
	}
}