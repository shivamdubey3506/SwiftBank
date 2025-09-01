package com.bank.service.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.service.constants.URLConstants;
import com.bank.service.dto.CustomerDetails;

@RestController
@RequestMapping(URLConstants.CUSTOMER_URL)
@CrossOrigin(origins = "http://localhost:5173")
public class CustomerRestApiController extends BaseRestApiController{

	protected final Logger logger = LoggerFactory.getLogger(CustomerRestApiController.class);
	
	@GetMapping(value = "/all")
	
	public List<CustomerDetails> getAllCustomers() {
		logger.info("CustomerRestApiController::getAllCustomers():: IN");
		return customerService.findAll();
	}

	@PostMapping(value = "/add")
	public ResponseEntity<Object> addCustomer(@RequestBody CustomerDetails customer) {
		logger.info("CustomerRestApiController::addCustomer():: IN");
		return customerService.addCustomer(customer);
	}

	@GetMapping(value = "/{cust_Id}")
	public CustomerDetails getCustomer(@PathVariable Long cust_Id) {
		logger.info("CustomerRestApiController::getCustomer(), cust_Id::{}",cust_Id);
		return customerService.findByCustomerNumber(cust_Id);
	}

	@PutMapping(value = "/{cust_Id}")
	public ResponseEntity<Object> updateCustomer(@RequestBody CustomerDetails customerDetails,
			@PathVariable Long cust_Id) {
		logger.info("CustomerRestApiController::updateCustomer(), cust_Id::{}",cust_Id);
		return customerService.updateCustomer(customerDetails, cust_Id);
	}

	@DeleteMapping(path = "/{cust_Id}")
	public ResponseEntity<Object> deleteCustomer(@PathVariable Long cust_Id) {
		logger.info("CustomerRestApiController::deleteCustomer(), cust_Id::{}",cust_Id);
		return customerService.deleteCustomer(cust_Id);
	}

}