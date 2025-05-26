Feature: Search and Select Food from Food Delivery Website

  Scenario Outline: User searches for food and adds it to the cart
    Given User searches for "<Search Item>", clicks "<Food Item>" and adds the item to the cart
    Then item should be visible in the cart

    Examples: 
      | Search Item   | Food Item         |
      | Beef bbq      | Beef BBQ          |
      | Beef kabab    | Beef Kabab        |
      | Biriyani rice | Biriyani Rice     |
      | Cola          | Kinza Cola 250 ml |
