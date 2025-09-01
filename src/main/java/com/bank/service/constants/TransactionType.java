package com.bank.service.constants;

public enum TransactionType {

	DEPOSIT("DEPOSIT"), WITHDRAWAL("WITHDRAWAL");

	String name;

	TransactionType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}