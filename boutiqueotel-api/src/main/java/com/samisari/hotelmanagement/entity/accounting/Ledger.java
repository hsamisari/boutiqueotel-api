package com.samisari.hotelmanagement.entity.accounting;

import java.util.Currency;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ledger {
	@Id
	private long id;
	private Currency currency;
	@OneToMany
	private List<Account> children;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

}
