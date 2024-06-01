# LumpSumCalculator
# Description:
The Lump Sum Calculator is a simple web application built with Spring Boot and Thymeleaf that calculates the future value of a lump sum investment based on the principal amount, rate of interest, time period, and compounding frequency provided by the user. It also calculates the earnings generated from the investment.

# Technical Details:
**Framework**: Spring Boot <br>
**View Template Engine**: Thymeleaf<br>
**Language:** Java<br>
**Dependencies:** <br>
Spring Boot Starter Web<br>
Spring Boot Starter Test<br>
Spring Boot Starter Thymeleaf<br><br>
**Controller:** LumpSumController handles user requests and serves the appropriate Thymeleaf template.<br>
**Model:** Parameters class represents the parameters required for the calculation (principal, rate of interest, time, and compounding frequency).<br>
**View:** Thymeleaf template (LumpSumCalculator.html) provides a form for users to input the parameters and displays the calculated result.<br>
**Endpoint:** <br>
GET /LumpSumCalculator: Displays the form to input parameters.<br>
POST /LumpSumCalculator/calculate: Processes the form submission and calculates the future value and earnings.<br>

# How to Run:
Clone the repository to your local machine.<br>
Navigate to the project directory.<br>
Open a terminal and run the command mvn spring-boot:run.<br>
Open a web browser and go to http://localhost:8080/LumpSumCalculator.<br>
Input the required parameters and click "Calculate" to see the result.<br>
