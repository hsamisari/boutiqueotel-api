package com.samisari.hotelmanagement.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.samisari.hotelmanagement.entity.accounting.Transaction;
import com.samisari.hotelmanagement.entity.accounting.TransactionType;
import com.samisari.hotelmanagement.entity.auth.AppUser;

@Entity
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotNull
	private String name;
	private String address;
	@NotNull
	private String phoneNumber;
	@NotNull
	private String email;
	private Date dateCreated;
	private Date lastModified;
	private long userCreated;
	private long userLastModified;
	@ManyToMany
	@JoinTable(name = "app_user_hotels")
	private List<AppUser> appUsers;
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Room> rooms;
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<RoomType> roomTypes;
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<TransactionType> transactionTypes;
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Reservation> reservations;
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Customer> customers;
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Transaction> transactions;

	public Hotel() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public List<AppUser> getAppUsers() {
		return appUsers;
	}

	public void setAppUsers(List<AppUser> appUsers) {
		this.appUsers = appUsers;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public List<RoomType> getRoomTypes() {
		return roomTypes;
	}

	public void setRoomTypes(List<RoomType> roomTypes) {
		this.roomTypes = roomTypes;
	}

	public List<TransactionType> getTransactionTypes() {
		return transactionTypes;
	}

	public void setTransactionTypes(List<TransactionType> transactionTypes) {
		this.transactionTypes = transactionTypes;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
}
