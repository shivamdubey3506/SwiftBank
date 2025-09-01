package com.bank.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.service.constants.URLConstants;
import com.bank.service.dto.AccountInformation;

@RestController
@RequestMapping(URLConstants.BASE_URL)

public class AccountRestApiController extends BaseRestApiController {

	protected final Logger logger = LoggerFactory.getLogger(AccountRestApiController.class);
	
	@GetMapping(value = URLConstants.ACCOUNTS_URL+"/{accountNumber}")
	public ResponseEntity<?> getByAccountNumber(@PathVariable Long accountNumber) {

		return accountService.findByAccountNumber(accountNumber);
	}

	@PostMapping(value = URLConstants.ACCOUNTS_URL+"/add/{customerNumber}")
	public ResponseEntity<?> addNewAccount(@RequestBody AccountInformation accountInformation,
			@PathVariable Long customerNumber) {

		return accountService.addNewAccount(accountInformation, customerNumber);
	}
	
	
	
	@GetMapping(value = "/calculate_interest/{accountNumber}")
	public ResponseEntity<?> calculateInterestRates(@PathVariable Long accountNumber,@RequestParam Double amount) {

		return accountService.calculateInterestRates(accountNumber,amount);
	}
	

}
