Feature: Orders
  As an user
  I want to order
  So that I can see my orders

  @POST
  Scenario: POST - Create a new order (positive)
    Given I set POST endpoints order
    When I send POST HTTP request order

  @POST
  Scenario: POST - Create a new order with invalid endpoints (negative)
    Given I set POST invalid endpoints order
    When I send invalid POST HTTP request order
    Then I receive valid HTTP response code 404

  @GetAll
  Scenario: GET - Get all Orders (positive)
    Given I set GET endpoints orders
    When I send GET HTTP request orders
    Then I receive valid HTTP response code 200
  @GetAll
  Scenario: GET - Get all Orders with invalid endpoints (negative)
    Given I set GET invalid endpoints orders
    When I send invalid GET HTTP request orders
    Then I receive valid HTTP response code 404

  @GetByID
  Scenario: GET - Get order by ID with invalid endpoints (negative)
    Given I set GET invalid endpoints order id
    When I send invalid GET HTTP request order id
    Then I receive valid HTTP response code 404