Feature: User Log-In

  Scenario Outline: Successful User Login
    Given user clicks on signin button
    When user enters "<Your Email>", and confirms "<Your Password>"
    And user clicks on Login Button

    Examples: 
      | Your Email                 | Your Password |
      | niyojithsuresh06@gmail.com | NiyoJith@22   |