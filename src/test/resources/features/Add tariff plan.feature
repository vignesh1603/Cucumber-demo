#Author: your.email@your.domain.com
Feature: Add tariff plan

  Background: 
    Given user launch telecom app
    And user click on add tariff plan

  Scenario: validation of tariff plan using 1 dim list
    When user enter fill fields by using one dim list
      | 100 | 200 | 300 | 400 | 1 | 2 | 3 |
    And user clicks  submit button
    Then user should be displayed  message

  Scenario: validation of tariff plan using 2 dim list
    When user enter fill fields by using two dim list
      | 100 | 200 | 300 | 400 | 1 | 2 | 3 |
      | 200 | 100 | 400 | 100 | 3 | 1 | 2 |
      | 300 | 300 | 500 | 200 | 4 | 3 | 1 |
    And user clicks  submit button
    Then user should be displayed  message

  Scenario: validation of tariff plan using 1 dim map
    When user enter fill fields by using one dim map
      | 1 | 100 |
      | 2 | 200 |
      | 3 | 300 |
      | 4 | 400 |
      | 5 |   1 |
      | 6 |   2 |
      | 7 |   3 |
    And user clicks  submit button
    Then user should be displayed  message

  Scenario: validation of tariff plan using 2 dim map
    When user enter fill fields by using two dim map
      |   1 |   2 |   3 |   4 | 5 | 6 | 7 |
      | 100 | 200 | 300 | 400 | 1 | 2 | 3 |
      | 200 | 100 | 400 | 100 | 3 | 1 | 2 |
      | 300 | 300 | 500 | 200 | 4 | 3 | 1 |
    And user clicks  submit button
    Then user should be displayed  message
