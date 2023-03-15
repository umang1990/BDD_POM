Feature: Place Order 
User will search an item, Add item to cart and place an order

Scenario: Search Item
Given User is on Home Page
When User search an item "Parry Hotter"
Then Item must be displayed

Scenario: Add Item to Cart
#Given Item must be displayed
When User Add Item to Cart
Then Item must be listed in cart