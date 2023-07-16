Feature: Cart Feature
  Scenario: Add Product To Cart
    Given User is on homePage
    When Click accept cookies
    And Click the search field
    And Enter product name
    And Click the search button
    And Filter for shipped by Amazon
    And Filter for Apple
    And Click the first product
    And Add to the cart
    And Go to the cart
    Then Check if the product is in the cart