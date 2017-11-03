package com.happiestMinds.mappingDummy;
// Generated Sep 20, 2017 11:51:49 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Address generated by hbm2java
 */
@Entity
@Table(name = "Address", catalog = "UserManagement")
public class Address implements java.io.Serializable {

	private long id;
	private City city;
	private String doorNo;
	private String street;
	private String pinCode;
	private Set<User> users = new HashSet<User>(0);

	public Address() {
	}

	public Address(long id) {
		this.id = id;
	}

	public Address(long id, City city, String doorNo, String street, String pinCode, Set<User> users) {
		this.id = id;
		this.city = city;
		this.doorNo = doorNo;
		this.street = street;
		this.pinCode = pinCode;
		this.users = users;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city")
	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Column(name = "doorNo", length = 10)
	public String getDoorNo() {
		return this.doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	@Column(name = "street", length = 45)
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "pinCode", length = 20)
	public String getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
