Feature: Login
  Scenario: Successful Login with valid credentials
    Given User Launch Chrome Browser
    When User opens url "https://tutorialsninja.com/demo/"
    Then navigate to login page
    And User enters Email as "manojpratap21@gmail.com" and password is "manoj@123"
    And click on Login
    Then Page Title should be "My Account"
    When User click on Logout Link
    Then Page title should be "Account Logout"
    Then click on continue button
    Then Page Title should be "Your Store"
    And Close the browser

    Scenario Outline:Login Data Driven
        Given User Launch Chrome Browser
        When User opens url "https://tutorialsninja.com/demo/"
        Then navigate to login page
        And User enters Email as "<email>" and password is "<password>"
        And click on Login
        Then Page Title should be "My Account"
        When User click on Logout Link
        Then Page title should be "Account Logout"
        Then click on continue button
        Then Page title should be "Your Store"
        And Close the browser

        Examples:
            |email| password|
            |manojpratap21@gmail.com| manoj@123|
            |monubhadoriya786@gmail.com|monu@123|




