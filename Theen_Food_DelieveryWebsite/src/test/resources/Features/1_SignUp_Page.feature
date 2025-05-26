Feature: User Sign-Up

  Scenario Outline: Successful User Sign-Up
    Given user is on the Home page and clicks SignUp button
    When user clicks on Click here and enters "<Your Name>" "<Your Email>" and confirms "<Your Password>"
    Then user clicks on the Create Account button

    Examples: 
      | Your Name  | Your Email                 | Your Password |
      | Niyojith.S | niyojithsuresh06@gmail.com | NiyoJith@22   |