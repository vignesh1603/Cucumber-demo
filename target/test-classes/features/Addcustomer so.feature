#Author: your.email@your.domain.com
Feature: Add customer
@hardcoded

  Scenario Outline: Validation of add customer
    
    And user click  add customer
    When user enter values in fields  "<fname>","<lname>","<mail>","<addr>","<phno>"       
    And user click  submit button
    Then user should be displayed customer id

    Examples: 
      | fname   | lname       | mail            | addr       | phno       |
      | vignesh | vijayaraman | vicky@gmail.com | coimbatore | 8940422633 |
      | vicky   | vijayaraman | vicky@gmail.com | coimbatore | 8940422633 |
      | soundar | vijayaraman | vicky@gmail.com | coimbatore | 8940422633 |
      | karthi  | vijayaraman | vicky@gmail.com | coimbatore | 8940422633 |
