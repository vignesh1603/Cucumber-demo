#Author: your.email@your.domain.com
Feature: Add customer module
@hardcoded
  Scenario: Add customer flow validation
    Given user launches telecom application
    And user click on add customer
    When user enter values in fields
    And user click on submit button
    Then user shoukld be displayed customer id is generated

  Scenario: Add customer flow validation using 1 dim list
    Given user launches telecom application
    And user click on add customer
    When user enter values in fields by using one dim list
      | vignesh | vijayaraman | vicky@gmail.com | coimbatore | 8940422633 |
    And user click on submit button
    Then user shoukld be displayed customer id is generated

  Scenario: Add customer flow validation using 1 dim map
    Given user launches telecom application
    And user click on add customer
    When user enter values in fields by using one dim map
      | fname | vignesh         |
      | lname | vijayaraman     |
      | mail  | vicky@gmail.com |
      | addr  | coimbatore      |
      | phno  |      8940422633 |
    And user click on submit button
    Then user shoukld be displayed customer id is generated

  Scenario: Add customer flow validation using 2 dim list
    Given user launches telecom application
    And user click on add customer
    When user enter values in fields by using two dim list
      | vignesh | vijayaraman | vicky@gmail.com  | coimbatore  | 8940422633 |
      | vicky   | vijayaraman | vicky@gmail1.com | coimbatore1 | 8940422633 |
      | soundar | vijayaraman | vicky@gmail2.com | coimbatore2 | 8940422633 |
      | karthi  | vijayaraman | vicky@gmail3.com | coimbatore3 | 8940422633 |
    And user click on submit button
    Then user shoukld be displayed customer id is generated

  Scenario: Add customer flow validation using 2 dim map
    Given user launches telecom application
    And user click on add customer
    When user enter values in fields by using two dim map
      | fname   | lname       | mail            | addr       | phno       |
      | vignesh | vijayaraman | vicky@gmail.com | coimbatore | 8940422633 |
      | vicky   | vijayaraman | vicky@gmail.com | coimbatore | 8940422633 |
      | soundar | vijayaraman | vicky@gmail.com | coimbatore | 8940422633 |
      | karthi  | vijayaraman | vicky@gmail.com | coimbatore | 8940422633 |
    And user click on submit button
    Then user shoukld be displayed customer id is generated
