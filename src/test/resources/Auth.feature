Feature: Auth
  As an user
  I want to have account
  So that I can access using my account


  @Register
  Scenario: POST - Register account with invalid endpoints (negative)
    Given I set POST invalid endpoints register
    When I send invalid POST HTTP request register
    Then I receive valid HTTP response code 404

  @Login
  Scenario: POST - Login account (positive)
    Given I set POST endpoints login
    When I send POST HTTP request login
    Then I receive valid HTTP response code 200
  @Login
  Scenario: POST - Login account with invalid endpoints (negative)
    Given I set POST invalid endpoints login
    When I send invalid POST HTTP request login
    Then I receive valid HTTP response code 404

  @UserInfo
  Scenario: GET - Get user information (positive)
    Given I set GET endpoints user info
    When I send GET HTTP request user info
    Then I receive valid HTTP response code 200
  @UserInfo
  Scenario: GET - Get user information with invalid endpoints (negative)
    Given I set GET invalid endpoints user info
    When I send invalid GET HTTP request user info
    Then I receive valid HTTP response code 404
