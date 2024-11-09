Feature: Register User
    Scenario: Registering User Information
        Given User Launch Chrome Browser
        When User opens url "https://tutorialsninja.com/demo/"
        Then navigate to Register Page
        Then Page Title should be "Register Account"
        Then provide all value "first name","last name","email","phone","password","actual password"
        Then click on privacy policy checkbox
        And click on continue button of the reg page
        And verify "Your Account Has Been Created!" displayed on page
        And Close the browser