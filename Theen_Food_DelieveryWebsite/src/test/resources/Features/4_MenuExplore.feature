Feature: Exploring the menu and selecting food

  Scenario Outline: User explores the menu and selects favorite dishes
    Given User clicks the menu to view the available items
    When User selects "<Menu Item>", clicks "<Food Item>", and adds it to the cart

    Examples:
      | Menu Item | Food Item     |
      | Kabab     | Mutton Kabab  |
      | Rice      | Mandi Rice    |
      | Rolls     | Chicken Roll  |