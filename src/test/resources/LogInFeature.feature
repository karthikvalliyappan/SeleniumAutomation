Feature: Validating the login feature

  #Background:
   # Given user is on the login page

  Scenario: Verify whether the customer is able to login with valid details
    Given user is on the login page
    When user enters the valid username "student" and password "Password123"
    Then user click on the submit button
    And user should be able to navigated to the homepage