Feature: Regular testing of purchase item
  Scenario: Add to item to the cart
    Given User opens the given link
    And User go to the sign in and click
    And User enters email and password
    Then User verify the main page is opened
    When User enter "iphone x" in search bar
    And User click at search button
    Then User verify "\"iphone x\"" on search page
    When User add it on the cart
    And User close subtotal cart
    And User go to the cart
    Then User validate the content of the cart to ensure the correct article has been added
    When User delete item from cart