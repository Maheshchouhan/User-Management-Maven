package com.happiestMinds.entity;
// Generated Sep 20, 2017 11:51:49 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Country generated by hbm2java
 */
@Entity
@Table(name = "country")
public class Country implements java.io.Serializable {

	private long id;
	private String name;
	private String description;
	private Byte status;
	private Set<State> states = new HashSet<State>(0);

	public Country() {
	}

	public Country(long id) {
		this.id = id;
	}

	public Country(long id, String name, String description, Byte status, Set<State> states) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.status = status;
		this.states = states;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "name", length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 45)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
	public Set<State> getStates() {
		return this.states;
	}

	public void setStates(Set<State> states) {
		this.states = states;
	}

}
