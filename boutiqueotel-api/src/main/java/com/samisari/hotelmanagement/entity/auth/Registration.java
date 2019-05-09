package com.samisari.hotelmanagement.entity.auth;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Registration {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@NotNull
	private String hotelName;
	@NotNull
	private String hotelPhoneNumber;
	@NotNull
	private String hotelEmail;
	@NotNull
	private String contactFullName;
	@NotNull
	private String contactPhoneNumber;
	private String contactEmail;
	@NotNull
	private String contactRelationshipToHotel;
	private Date dateCreated;
	private Date lastModified;
	private long  userCreated;
	private long  userLastModified;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelPhoneNumber() {
		return hotelPhoneNumber;
	}

	public void setHotelPhoneNumber(String hotelPhoneNumber) {
		this.hotelPhoneNumber = hotelPhoneNumber;
	}

	public String getHotelEmail() {
		return hotelEmail;
	}

	public void setHotelEmail(String hotelEmail) {
		this.hotelEmail = hotelEmail;
	}

	public String getContactFullName() {
		return contactFullName;
	}

	public void setContactFullName(String contactFullName) {
		this.contactFullName = contactFullName;
	}

	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}

	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactRelationshipToHotel() {
		return contactRelationshipToHotel;
	}

	public void setContactRelationshipToHotel(String contactRelationshipToHotel) {
		this.contactRelationshipToHotel = contactRelationshipToHotel;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public long getUserCreated() {
		return userCreated;
	}

	public void setUserCreated(long userCreated) {
		this.userCreated = userCreated;
	}

	public long getUserLastModified() {
		return userLastModified;
	}

	public void setUserLastModified(long userLastModified) {
		this.userLastModified = userLastModified;
	}
}
