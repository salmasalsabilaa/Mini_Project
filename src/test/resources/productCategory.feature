Feature: Product Categories
  As an admin
  I want to see category
  So that I can manage the categories

  @POST
  Scenario: POST - Create a category (positive)
    Given I set POST endpoints categories
    When I send POST HTTP request categories
    Then I receive valid HTTP response code 200

  @POST
  Scenario: POST - Create a category with invalid endpoints(negative)
    Given I set POST invalid endpoints categories
    When I send invalid POST HTTP request categories
    Then I receive valid HTTP response code 404

  @GetCategoryByID
  Scenario: GET - Get category by ID with invalid endpoints (negative)
    Given I set GET invalid endpoints category By ID
    When I send invalid GET HTTP request category By ID
    Then I receive valid HTTP response code 404

  @GetAllCategory
  Scenario: GET - Get All Categories (positive)
    Given I set GET endpoints to all category
    When I send GET HTTP request to all category
    Then I receive valid HTTP response code 200

  @DeleteCategory
  Scenario: DELETE - As admin I have delete a category (positive)
    Given I set DELETE endpoints category
    When I send DELETE HTTP request category
    Then I receive valid HTTP response code 200