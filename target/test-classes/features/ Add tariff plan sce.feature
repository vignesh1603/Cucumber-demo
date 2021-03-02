#Author: your.email@your.domain.com
Feature: Add tariff plan

  Background: 
    Given user launches telecom app
    And user click on add tariff plan

  Scenario: Validation of tariff plan message
    When user fill values in field
      | 100 | 200 | 300 | 400 | 1 | 2 | 3 |
    And user clicked on submit button
    Then user shouuld be displayed success message
