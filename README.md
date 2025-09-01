# Banking Operations Service

Banking Management Application using Java8, Spring Boot, Spring Security and Mysql DB

RESTful API to simulate simple banking operations.

Requirements
-------------
  1.	CRUD operations for customers and accounts.
		
  2.	Support deposits and withdrawals on accounts.
	
  3.	Internal get recent 10 transaction details
	
  4.	Calculate Interest rates based on account number 
	
  5.	Getting Started

  

	
	
Refer to the following link for instructions:
---------------------------------------------

Open IDE of your choice and Import as existing maven project in your workspace

- Import existing maven project
- Run mvn clean install
- If using STS, Run As Spring Boot App

Custom port for the api is 8081

Prerequisites
-------------
-	Java 8
-	Spring Tool Suite 4 or similar IDE
-	Maven - Dependency Management
-	Maven Dependencies
-	spring-boot-starter-actuator
-	spring-boot-starter-data-jpa
-	spring-boot-starter-security
-	spring-boot-starter-web
-	spring-boot-devtools
-	mysql - database
-	spring-boot-starter-test


Mysql Database
---------------
Make sure to use mysql jdbc url. If you intend to you use custom database name, please define datasource properties in application.properties

		## Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
		spring.datasource.url = jdbc:mysql://localhost:3306/swift_bank?useSSL=false
		spring.datasource.username = root
		spring.datasource.password = root


Testing the Bank APP Rest API
------------------------------
-	Authentication Rest endpoint 


		*	Method : POST
		*	URL : http://localhost:8081/swiftbank/authenticate
		*	Request Body: 
			{
    	"username":"bankservice",
    	"password":"password"
		}
		*	Response Body:
			{
				token":"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiYW5rc2VydmljZSIsImV4cCI6MTY1MTQyMTUzMSwiaWF0IjoxNjUxNDAzNTMxfQ.MPSqVuhsne_JIc92mnAjKJJhhHUpOUNv8HSb60KrAKUU8_1X75ajkx-vFk-GeUZDhrk7LWs5cN0AMzyF4KEQEg"
			}

-	CUSTOMER LIST


		*	Method: GET
		*	URL : http://localhost:8081/swiftbank/api/v1/customers/all
	
-	ADD CUSTOMER

		*	Method: POST
		*	URL: http://localhost:8081/swiftbank/api/v1/customers/add
		*	Request Body:
				{
					"customerNumber":10001,
					"firstName":"Test ***",
					"lastName":"Test ***",
					"address":"adress ***",
					"city":"****",
					"state":"***",
					"mobileNum":9876543210,
					"status":"ACTIVE"
				 }

-	GET ACCOUNT ID

		*	Method: GET
		*	URL: http://localhost:8081/swiftbank/api/v1/accounts/12345

-	ADD ACCOUNT FOR CUSTOMER

		*	Method: POST
		*	URL: http://localhost:8081/swiftbank/api/v1/accounts/add/2
		*	Request Body:
				{
					"accountNumber": 12345,
					"accout_type": "CURRENT",
					"account_name": "AXIS BANK",
					"description": "AXIS Bank account.",
					"balance": 10000.0,
					"interestRate": 5.0
				}


-	DEPOSITE AMOUNT

		*	Method: PUT
		*	URL: http://localhost:8081/swiftbank/api/v1/deposit/1
		*	Request Body:
				{
					"accountNumber": 12345,
					"amount": 1000
				}
				 
				 
-	WITHDROW AMOUNT

		*	Method: PUT
		*	URL: http://localhost:8081/swiftbank/api/v1/withdrawal/1
		*	Request Body:
				{
					"accountNumber": 12345,
					"amount": 500
				}
				 
-	CALCULATE INTEREST RATES

		*	Method: GET
		*	URL: http://localhost:8081/swiftbank/api/v1/calculate_interest/12345?amount=500
		
				 
-	TRANSACTIONS

		*	Method: GET
		*	URL: http://localhost:8081/swiftbank/api/v1/transactions/1/12345
		

Please use the POST MAN to perform CRUD operations.

Browse to /src/test/resources to find sample requests to add customer and accounts.

