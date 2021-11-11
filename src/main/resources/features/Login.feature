Feature: Login Page Scenarios
  Scenario: Verify login options with valid credentials as an Instructor
    Given I navigate to LoginPage
    When I input "username" as "kuba@gmail.com"
    And I input "password" as "123456"
    And I click Login button
    Then Title of the page should be Home Page

  Scenario: Verify login options with valid credentials as Student
    Given I navigate to LoginPage
    When I input "username" as "user@test.com"
    And I input "password" as "123456"
    And I click Login button
    Then Title of the page should be Home Page

  Scenario: Verify login options with Invalid credentials
    Given  I navigate to LoginPage
    When  I input "Username" as "newUser@gmail.com"
    And  I input "Password" as "1234"
    And I click Login button
    Then I should see error message
