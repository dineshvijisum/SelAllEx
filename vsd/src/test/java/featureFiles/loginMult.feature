Feature: Bookcart Application tests

  Scenario Outline: 
    Login should be success

    Given User navigate to the Boocart application
    And User clicks on the login button
    And User enter the <Username> and <Password>
    When User click on the login button
    Then Login should be success
    
    #Examples:
#|Username|Password|
#|ortoni|pas|
#|ort|pass1234|
#|ort|pass|
#|ortoni|pass1234|