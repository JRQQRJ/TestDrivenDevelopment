Feature: Validating login functionality
  This feature validates login form page for ORangeCRM application

  @sanity
  Scenario Outline: As a valid user, I want to test the login to the application
    Given I am at the login page
    When  I enter "<username>" and "<password>" and submit

    Then  I should see the Welcome Page
    Examples:
      | username | password |
      | Admin    | admin123 |

  @smoke
  Scenario Outline: As a invalid user, I should not be allowed to login to the application
    Given I am at the login page
    When  I enter "<username>" and "<password>" and try submit

    Then  I should not see the Welcome Page
    Examples:
      | username | password |
      | Tarun    | admin123 |
