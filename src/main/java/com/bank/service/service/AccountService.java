package com.bank.service.service;

import org.springframework.http.ResponseEntity;

import com.bank.service.dto.AccountInformation;

public interface AccountService {

	ResponseEntity<?> findByAccountNumber(Long account_id);

	ResponseEntity<?> addNewAccount(AccountInformation accountInformation, Long cust_Id);

	ResponseEntity<?> calculateInterestRates(Long accountNumber, Double amount);


}
