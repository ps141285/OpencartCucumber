Feature: Login
  Scenario: Successful Login with valid credentials
    Given User Launch Chrome Browser
    When User opens url "https://tutorialsninja.com/demo/" and navigate to login page
    And User enters Email as "manojpratap21@gmail.com" and password is "manoj@123"
    And click on Login
    Then Page Title should be "My Account"
    When User click on Logout Link
    Then Page title should be "Account Logout"
    Then click on continue button
    Then Page Title should be "Your Store"
    And Close the browser



