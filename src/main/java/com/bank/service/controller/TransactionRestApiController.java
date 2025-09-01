package com.bank.service.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.service.constants.URLConstants;
import com.bank.service.dto.TransactionDetails;


@RestController
@RequestMapping(URLConstants.BASE_URL)
public class TransactionRestApiController extends BaseRestApiController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TransactionRestApiController.class);
	
	
	@GetMapping(path = "/transactions/{customerNumber}/{accountNumber}")
	public List<TransactionDetails> getTransactionByAccountNumber(@PathVariable Long customerNumber,@PathVariable Long accountNumber) {
		LOGGER.info("TransactionRestApiController::getTransactionByAccountNumber() , customerNumber :{}, accountNumber:{}",customerNumber,accountNumber);
		return transactionsService.findTransactionsByAccountNumber(customerNumber,accountNumber);
	}
	
}
