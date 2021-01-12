package com.example.restcrudjsondemo.entity;

import java.util.Date;

import javax.persistence.Basic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="lp_table")
public class Lp {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="label")
	private String label;
	
	@Column(name="code")
	private String code;
	
	@Basic
	@Temporal(TemporalType.DATE)
	private Date releaseDate;
	
	
	public Lp() {
		
	}


	public Lp(String label, String code, Date releaseDate) {
		this.label = label;
		this.code = code;
		this.releaseDate = releaseDate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public Date getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	
}
