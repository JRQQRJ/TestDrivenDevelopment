Feature: Validating login functionality
  This feature validates login form page for ORangeCRM application

  Scenario: As a valid user, I want to test the login to the application
    Given I am at the login page
    When  I enter "<username>" and "<password>" and submit
      |username|password|
      |   Admin   | admin123  |
    Then  I should see the Welcome Page


