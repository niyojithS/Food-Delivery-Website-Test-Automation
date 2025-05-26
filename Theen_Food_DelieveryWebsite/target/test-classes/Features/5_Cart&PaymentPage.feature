Feature: Cart and Payment

  Scenario Outline: User applies promo code, provides address, and completes payment
    Given the user has added items to the cart
    When the user applies promo code "<promo Code>"
    And the user enters the address with first name "<First Name>", last name "<Last name>", phone "<phone>", street "<Street>", street number "<Street number>", building number "<Building number>", city "<City>"
    And the user selects the payment method and places the order
    Then the order placed successfully message displayed and Track your order

    Examples: 
      | promoCode | First Name | Last name | phone      | Street      | Street number | Building number | City        |
      | Theen@22  | John       | Doe       | 1234567890 | Main Street |           101 | 12A             | Springfield |
