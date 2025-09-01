package com.bank.service.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.service.service.AccountService;
import com.bank.service.service.CustomerService;
import com.bank.service.service.TransactionsService;

public class BaseRestApiController {
	
	@Autowired
	public CustomerService customerService;
	
	@Autowired
	public AccountService accountService;

	@Autowired
	public TransactionsService transactionsService;
}